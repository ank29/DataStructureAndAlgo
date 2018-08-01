import java.util.Arrays;

public class AlternateHighLow {

    public static void swap(int [] a,int i,int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    public static void reArrangehighLow(int[] a){
        for(int i =1;i<a.length -1;i=i+2){
            if(a[i-1] > a[i])
                swap(a,i,i-1);
            if(a[i+1] > a[i])
                swap(a,i,i+1);

        }
    }
    public static void main(String args[]){
        int[] arr = {1,2,3,4,5,6};
        reArrangehighLow(arr);
        System.out.println(Arrays.toString(arr));

    }
}
