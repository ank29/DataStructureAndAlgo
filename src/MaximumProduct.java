import java.util.Arrays;

public class MaximumProduct {
    public static void maxProduct(int[] arr){
        Arrays.sort(arr);
        int n = arr.length;
        int maxProduct = arr[n-1]* arr[n-2];
        if(maxProduct < (arr[0]*arr[1]))
            maxProduct = (arr[0]*arr[1]);
        System.out.println(maxProduct);
    }
    public static void maxProductBest(int[] arr){
        int max = arr[0];
        int secondMax = Integer.MIN_VALUE;
        int min = arr[0];
        int secondMin = Integer.MAX_VALUE;
        for (int i =0;i< arr.length;i++){
            if(arr[i] > max){
                secondMax = max;
                max = arr[i];
            }
            else if (arr[i] > secondMax)
                secondMax = arr[i];
            if(arr[i] < min){
                secondMin = min;
                min = arr[i];
            }
            else if (arr[i] < secondMin)
                secondMin = arr[i];
        }
        System.out.println(max*secondMax);
        System.out.println(min*secondMin);
    }
    public static void main(String args[]){
        int[] arr = {1,3,5,-6,6,-10};
//        maxProduct(arr);
        maxProductBest(arr);
    }
}
