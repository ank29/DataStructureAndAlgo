import java.util.Arrays;

public class InPlaceMergeArrays {
    public static void inplaceMerge(int[] A,int[] B){
      int n = A.length;
      for(int i =0;i<n;i++){
          if(A[i] > B[0]) {
              int temp = A[i];
              A[i] = B[0];
              B[0] = temp;
              int j;
              for(j = 1;j < B.length;j++){
                  int k = B[j];
                 while (j > 0 && B[j-1] > k){
                     B[j]= B[j-1];
                     j--;
                 }
                 B[j] = k;
              }

          }

      }
    }
    public static void main(String args[]){
        int[] X = { 1, 4, 7, 8, 10 };
        int[] Y = { 2, 3, 9 };
        inplaceMerge(X,Y);
        System.out.println(Arrays.toString(X));
        System.out.println(Arrays.toString(Y));
    }
}
