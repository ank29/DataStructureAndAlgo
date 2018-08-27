
public class MedianMerge {
    static double findMedianMerge(int[] ar1,int ar2[]){
        int end = ar1.length-1;
        return getMedian(ar1,0,end,ar2,0,end);

    }
    static double getMedian(int[] ar1,int start1,int end1,int[] ar2,int start2,int end2) {
        int n = end1 - start1 + 1;
        if (n <= 0) return -1;
        if (n == 1)
            return (ar1[start1] + ar2[start2]) / 2;
        if (n == 2)
            return (Math.max(ar1[start1], ar2[start2]) + Math.min(ar1[end1], ar2[end2])) / 2;
        double m1 = median(ar1, start1, end1);
        double m2 = median(ar2, start2, end2);
        if (m1 < m2) {
            if (n % 2 == 0)
                return getMedian(ar1, start1 + (n / 2), end1, ar2, start2, start2 + (n / 2) - 1);
            else return getMedian(ar1, start1 + (n / 2), end1, ar2, start2, start2 + (n / 2));
        } else {
            if (n % 2 == 0)
                return getMedian(ar1, start1, start1 + (n / 2) - 1, ar2, start2 + (n / 2), end2);
            else return getMedian(ar1, start1, start1 + (n / 2), ar2, start2 + (n / 2), end2);

        }

    }
    static double median(int[] arr,int j,int n){
        int len = n-j+1;
        if(len%2 == 0)
            return (arr[n/2]+arr[(n/2)-1])/2;
        else
            return arr[n/2];
    }
    public static void main(String args[]){
        int arr[] = {1, 2,3,4,5,6};
        int arr2[] = {7,8,9,10,11,12};
        double median = findMedianMerge(arr,arr2);
      System.out.println("median is "+median);
    }
}




