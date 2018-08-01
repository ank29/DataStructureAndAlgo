import java.util.Arrays;

public class ProductArray {
    public static void mutilplyArr(int[] ar,int n){
        int left[] = new int[n];
        int right[] = new int[n];
        left[0] = 1;
        right[n-1] = 1;
        for(int i =1;i<n;i++){
            left[i] = ar[i-1]*left[i-1];
        }

        for(int j =n-2;j>=0;j--){
            right[j] = ar[j+1]*right[j+1];
        }
        for(int k =0;k<n;k++){
            ar[k] = left[k] *right[k];
            System.out.println(ar[k]);
        }

    }
    public static void main(String args[]) {
        int arr[] = {5, 3, 4, 2, 6, 8};
        int n = arr.length;
        mutilplyArr(arr, n);
    }
}

