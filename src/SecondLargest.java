public class SecondLargest {
    public static int secondLargest(int[] arr){
        int max =-1;
        int secondMax = -1;
        for(int i =0;i<arr.length;i++){
            if(arr[i] > max) {
                secondMax = max;
                max = arr[i];
            }
            else if(arr[i] > secondMax)
                secondMax = arr[i];
        }
        return secondMax;
    }
    public static int largest(int[] a,int n){
       if(n == 1)
           return a[0];
       else
           return (Math.max(largest(a,n-1),a[n-1]));
    }
    public static void main(String args[]){
        int[] ar = {1,5,2,6,9,0};
        int y= largest(ar,ar.length);
        int x= secondLargest(ar);
        System.out.println(x);
        System.out.println(y);
    }
}
