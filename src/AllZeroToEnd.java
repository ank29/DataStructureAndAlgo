import java.util.Arrays;

public class AllZeroToEnd {
    public static void swap(int[] a,int i,int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    public static void moveZeroesToEnd(int[] arr){
    int j =0;
    int k = 0;
    for(int i =0; i < arr.length;i++){
        if(arr[i] > k) {
            swap(arr, i, j);
            j++;
        }
        }
    }
    public static void main(String args[]){
        int[] arr = {2,0,0,9,0,5,1,0,9,0};
        moveZeroesToEnd(arr);
        System.out.println(Arrays.toString(arr));
    }
}
