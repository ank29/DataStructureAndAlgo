import java.util.HashMap;
import java.util.Map;

public class MaxDiffNumber {
       public static void maxDiff(int[] arr,int n){
           int max = arr[n-1];
           int min = arr[n-1];
           int max_diff = 0;
           for(int i =n-2;i>=0;i--){
               if(arr[i] >max) {
                   max = arr[i];
               }
               if(arr[i] < min){
                   min = arr[i];
               }
               max_diff = Math.max(max_diff,Math.abs(max-min));
           }
           System.out.println("max difference is "+max_diff);
       }

    public static void main(String args[]) {
        int arr[] = {19, 7, 9, 5, 4, 3, 2};
        int n = arr.length;
        maxDiff(arr, n);
    }
}

