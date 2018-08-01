
public class QuickSort {
    public static int getPivot(int[] arr,int low,int high){
        int p = arr[high];
        int i = low-1;
        for(int j = low;j<high;j++){
            if(arr[j] <=p){
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
        return i+1;
    }
    public static void quickSort(int[] arr,int low,int high){
        if(low<high){
           int pivot = getPivot(arr,low,high);
           quickSort(arr,low,pivot-1);
           quickSort(arr,pivot+1,high);
        }
    }
    public static void main(String args[]){
     int[] arr = {3,2,6,8,4,5,1,7};
     quickSort(arr,0,arr.length-1);
     for(int i =0;i<arr.length;i++){
         System.out.println(arr[i]);
     }

    }
}
