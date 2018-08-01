public class TestSingleton {
    public static void main(String args[]) {
        ThreadOne threadOne = new ThreadOne();
        ThreadTwo threadTwo = new ThreadTwo();
        Thread t1 = new Thread(threadOne);
        Thread t2 = new Thread(threadTwo);
        t1.start();
        t2.start();
    }
}
class SingletonTest{
    private static SingletonTest singletonTest = new SingletonTest();
    int counter = 0;
    private SingletonTest(){};
    public static SingletonTest getSingletonTest(){
        return singletonTest;
    }
    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }
}
class ThreadOne implements Runnable{
    SingletonTest singletonTest = SingletonTest.getSingletonTest();
    public void run(){
        for(int i=0;i<10;i++){
            singletonTest.setCounter(singletonTest.getCounter()+1);
            try {
                Thread.sleep(500);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        System.out.println("one " +singletonTest.getCounter());
    }
}
class ThreadTwo implements Runnable{
    SingletonTest singletonTest = SingletonTest.getSingletonTest();
    public void run(){
        for(int i=0;i<10;i++){
            singletonTest.setCounter(singletonTest.getCounter()+1);
            try {
                Thread.sleep(500);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        System.out.println("two " +singletonTest.getCounter());
    }
}
