import java.util.Arrays;

public class BinaryString {
    public  static void Binary(int n,int[] A){
        if(n <1){
           System.out.print(Arrays.toString(A));
        }
         else {
            A[n-1] = 0;
            Binary(n-1,A);
            A[n-1] = 1;
            Binary(n-1,A);
        }

    }
    public static void main(String args[]){
        int[] A = new int[2];
         Binary(A.length,A);

    }
}
