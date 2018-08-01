import java.util.Arrays;

public class MergeSort {
    static int mergeSort(int[] ar,int l,int r){
        int count = 0;
        if(l<r){
            int m = l+(r-l)/2;
            count = count + mergeSort(ar,l,m);
            count = count + mergeSort(ar,m+1,r);
            count = count + merge(ar,l,m,r);
        }
        return count;
    }
    static int merge(int[] arr,int l,int m,int r){
        int count = 0;
        int l1 = m-l+1;
        int l2 = r-m;
        int left[] = new int[l1];
        int right[] = new int[l2];
        for(int i=0;i<l1;i++){
            left[i] = arr[l+i];
        }
        for(int i=0;i<l2;i++){
            right[i] = arr[m+1+i];
        }
        int i =0;
        int j = 0;
        int k =l;
        while(i <l1 && j< l2){
            if(left[i] <right[j]) {
                arr[k] = left[i];
                i++;
            }
            else {
                arr[k] = right[j];
                j++;
                count = count + (m+1-i);
            }
            k++;
        }
      while (i < l1){
            arr[k] = left[i];
            i++;
            k++;
        }
       while(j < l2){
            arr[k] = right[j];
            j++;
            k++;
        }
     return count;
    }

    public static void main(String args[]) {
        int arr[] = {2,5,1,3,4};
        int count =  mergeSort(arr,0,arr.length-1);
        System.out.println(count);
        System.out.println(Arrays.toString(arr));
    }
}
