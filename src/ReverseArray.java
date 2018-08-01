import java.util.Arrays;

public class ReverseArray {
    public static void reverseArray(int[] A,int l,int h){
        if(l < h){
            int temp = A[l];
            A[l] = A[h];
            A[h] = temp;
            reverseArray(A,l+1,h-1);
        }
        else System.out.print(Arrays.toString(A));
    }
    public static void main(String args[]){
        int [] A = {1,2,3,4,5};
        int[] B = {1,2,3,4,5,6};
        reverseArray(A,0,A.length-1);
        reverseArray(B,0,B.length -1);
    }
}
