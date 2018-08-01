public class NthStairs {
    public static int fib(int n){
        if(n == 1)
            return 1;
        else if(n ==0)
            return 0;
        else return (fib(n-1)+fib(n-2));
    }
    public static void countNumberOfways(int n){
        int k =fib(n+1);
        System.out.println(k);
    }
    public static int factorial(int n){
        if(n <=0)return 1;
        else return (n*factorial(n-1));
    }
    public static void main(String args[]){
        int n = 4;
        countNumberOfways(n);
        int k = factorial(n);
        System.out.println(k);
    }
}
