
public class CircularMaxSum {
    public static int maxSum(int[] arr){
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum = sum+arr[i];
            sum = Math.max(sum,0);
            maxSum = Math.max(sum,maxSum);
        }
        return maxSum;
    }
  public static int maxCircularSubarray(int[] arr){
        int sum =0;
        for(int i =0;i<arr.length;i++){
            sum = sum+arr[i];
        }
        for(int i =0;i<arr.length;i++){
            arr[i] = -arr[i];
        }
        int maxNegativeSum = maxSum(arr);
        System.out.println(sum +" "+maxNegativeSum);
        return Math.max(sum,sum+maxNegativeSum);

  }
    public static void main(String args[]) {
        int[] arr = {2,1,-5,4,3,1};
        int sum = maxCircularSubarray(arr);
        System.out.println(sum);
    }
}
