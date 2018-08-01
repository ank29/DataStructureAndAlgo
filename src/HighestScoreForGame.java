import java.util.ArrayList;
import java.util.Arrays;

public class HighestScoreForGame {
    static int nofEntries =0;
    public static void addEntry(int[] arr,int k){
        if(nofEntries < arr.length || arr[arr.length-1] < k){
            if(nofEntries < arr.length)
                nofEntries ++;
            int j = arr.length -1;
            while (j > 0 && arr[j-1] < k){
                arr[j] = arr[j-1];
                j--;
            }
            arr[j] = k;
        }
    }
    public static void removeEntry(int[] arr,int i){
        if(i < 0 || i > arr.length)
            throw new IndexOutOfBoundsException();
        else{
            System.out.println(arr[i]);
            for(int j =i;j<arr.length-1;j++)
                arr[j] = arr[j+1];

            arr[arr.length-1] = 0;
            nofEntries--;
        }
    }
    public static void swap(int arr[],int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void insertionSort(int[] arr){
        for(int i = 1;i<arr.length;i++){
           int curr = arr[i];
           int k = i;
           while (k >0 && arr[k-1] > k){
               arr[k] = arr[k-1];
               k--;
           }
           arr[k] = curr;
        }
    }
    public static void main(String args[]){
        int arr[] = new int[5];
        addEntry(arr,5);
        addEntry(arr,3);
        addEntry(arr,2);
        addEntry(arr,9);
        addEntry(arr,1);
        addEntry(arr,45);
//        removeEntry(arr,1);
//        removeEntry(arr,3);
        addEntry(arr,4);
        System.out.println(Arrays.toString(arr));
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(0);
        list.add(5);
        if(!Arrays.stream(arr).allMatch(i -> i>=0))
            System.out.println("negative number exists");

    }
}
