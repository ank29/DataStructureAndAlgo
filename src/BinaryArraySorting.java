import java.util.Arrays;

public class BinaryArraySorting {
    public static void sortBinaryArrayNaive(int [] a){
        int count =0;
        for(int i =0;i< a.length;i++){
            if (a[i] == 0)
                count++;
        }
        for (int i =0;i< count;i++){
            a[i] = 0;
        }
        for(int i = count;i<a.length;i++){
            a[i] = 1;
        }
    }
    public static void sortBinaryArrayBetter(int[] ar){
        int k =0;
        for(int i =0;i<ar.length-1;i++){
            if(ar[i] == 0) {
                ar[k++] = 0;
            }
        }
        for(int i = k;i<ar.length;i++){
            ar[i] = 1;
        }
    }
    public static void swap(int[] a,int i,int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    public static void sortBinaryArrayBest(int[] a){
        int k = 1;
        int j =0;
        for(int i =0;i<a.length;i++){
            if(a[i] < k) {
                swap(a, i, j);
                j++;
            }
        }
    }
    public static int indexOfZero(int[] arr){
        int max_index = -1;
        int max_count = -1;
        int prevIndex = -1;
        int count = 0;
        for(int i =0;i<arr.length;i++){
            if(arr[i] == 1)
                count++;
            else {
                count = i-prevIndex;
                prevIndex = i;
            }
            if(count > max_count){
                max_count = count;
                max_index = prevIndex;
            }

        }
        return max_index;
    }
    public static void main(String args[]){
        int[] arr = {1,0,0,0,1,0,1,0,1,1,1};
//        sortBinaryArrayNaive(arr);
//        sortBinaryArrayBetter(arr);
//        sortBinaryArrayBest(arr);
//        System.out.println(Arrays.toString(arr));
        int index = indexOfZero(arr);
        System.out.println(index);
    }
}
