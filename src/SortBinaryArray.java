import java.util.Arrays;

class SortBinaryArray
{
    public static void sort(int[] A)
    {
        int k = 0;

        for (int i = 0; i < A.length; i++)
        {
            if (A[i] == 0) {
                A[k++] = 0;
            }
        }

        for (int i = k; i < A.length; i++) {
            A[k++] = 1;
        }
    }


    public static void main (String[] args)
    {
        int A[] = { 0, 0, 1, 0, 1, 1, 0, 1, 0, 0 };

        sort(A);
        System.out.println(Arrays.toString(A));
    }
}
