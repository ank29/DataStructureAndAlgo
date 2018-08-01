class BankAccount{
    int balance = 50;
    public int getBalance(){
        return balance;
    }
    public void withdraw(int amount){
        balance = balance-amount;
    }
}
class ThreadTest implements Runnable{

    BankAccount account = new BankAccount();
    public void run(){
        for(int i=0;i<5;i++) {
            makeWithDraw(10);
            if(account.getBalance()<0)
                System.out.println("overdrawn");
        }
    }
    synchronized void makeWithDraw(int amount){
        if(account.getBalance() >= amount){
            System.out.println("About to withdraw "+Thread.currentThread().getName());
                try{
                    System.out.println("going to sleep");
                   Thread.sleep(500);
                }catch (Exception e){
                    e.printStackTrace();
                }
                System.out.println("withdrawing "+Thread.currentThread().getName());
                account.withdraw(amount);
        }
        else{
            System.out.println("not enough");
        }
    }
    public static void main(String args[]) {
        Runnable threadDrive = new ThreadTest();
        Thread t = new Thread(threadDrive);
        Thread t2 = new Thread(threadDrive);
        t.setName("Ryan");
        t2.setName("Monica");
        t.start();
        t2.start();
    }

}
