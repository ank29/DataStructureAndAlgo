public class DutchNational {
    public static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void dutchNationalSort(int[] arr) {
        int start = 0, mid = 0;
        int end = arr.length - 1;
        int pivot = 1;
        while (mid <= end) {
            if (arr[mid] < pivot) {
                swap(arr, mid, start);
                mid++;
                start++;
            } else if (arr[mid] > pivot) {
                swap(arr, mid, end);
                end--;
            } else {
                mid++;
            }
        }
    }
    public static void main(String args[]){
            int[] ar = {0,2,1,1,2,0};
            dutchNationalSort(ar);
            for(int i =0;i< ar.length;i++)
                System.out.print(ar[i] +" ");
        }

    }

