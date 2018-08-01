import java.util.Arrays;

public class MergeArrays {
    public static void mergeArrays(int[] X,int[] Y){
        rearrange(X);
        int n = X.length-1;
        int m = Y.length-1;
        int p = n-m-1;
        while (m >= 0 && p >= 0 ){
            if(Y[m] > X[p]) {
                X[n] = Y[m];
                m--;
            }
            else {
                X[n] = X[p];
                p--;
            }
            n--;
        }
        while (m >= 0) {
            X[n] = Y[m];
            n--;
            m--;
        }
        while (p >= 0) {
            X[n] = X[p];
            n--;
            p--;
        }



    }
    public static int rearrange(int[] a){
        int j =0;
        for(int i =0;i<a.length;i++){
            if(a[i] != 0) {
                AllZeroToEnd.swap(a, i, j);
                j++;
            }
        }
        return  j;
    }
    public static void main(String args[]){
        int X[] = { 0, 2, 0, 3, 0, 5, 6, 0, 0};
        int Y[] = { 1, 8, 9, 10, 15 };
        mergeArrays(X,Y);
        System.out.println(Arrays.toString(X));
    }
}
