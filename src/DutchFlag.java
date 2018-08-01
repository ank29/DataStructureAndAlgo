import java.util.Arrays;

public class DutchFlag {
    public static void sortDutchFlag(int[] ar){
        int k =1;
        int start = 0;
        int mid = 0;
        int end = ar.length-1;
       while (mid <= end){
           if(ar[mid] < k){
               BinaryArraySorting.swap(ar,start,mid);
               mid++;
               start++;
           }
           else if(ar[mid] > k) {
               BinaryArraySorting.swap(ar, mid, end);
               end--;
           }
           else mid++;



        }

    }

    public static void main(String args[]){
        int[] arr = {1,0,0,2,2,0,1,0,2,1,2,0,1,1,1};
        sortDutchFlag(arr);
        System.out.println(Arrays.toString(arr));
    }
}
