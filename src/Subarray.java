import java.util.*;

public class Subarray {
    public static void insert(HashMap<Integer,List<Integer>> map,int key,int value){
        if(!map.containsKey(key))
            map.put(key,new ArrayList<>());
            map.get(key).add(value);
    }
    public static void zeroSubarray(int[] arr){
        HashMap<Integer,List<Integer>> hashMap = new HashMap<>();
        int sum = 0;
        insert(hashMap,sum,-1);
        for(int i =0;i<arr.length;i++){
            sum = sum+arr[i];
            if (hashMap.containsKey(sum)) {
                List<Integer> list = hashMap.get(sum);
                for(Integer value : list)
                System.out.println("zero subarray exists from index ::" + (value + 1) + " to index " + i);
            }
                insert(hashMap,sum,i);
        }

    }
    public static void maxSubarray(int[] arr){
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i =0;i<arr.length;i++){
            sum = sum+arr[i];
            maxSum = Math.max(maxSum,sum);
        }
        System.out.println("maxsum is::" +maxSum);
    }
    public static void maxSubarrayAllNegative(int[] arr){
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i =0;i<arr.length;i++){
            sum = sum+arr[i];
            maxSum = Math.max(maxSum,arr[i]);
        }
        System.out.println("maxsum is::" +maxSum);
    }
    public static void findSum(int[] A,int sum){
        Map<Integer,Integer> map = new HashMap<>();
        for(int i =0;i<A.length;i++){
            if(map.containsKey(sum-A[i]))
                System.out.println("pair found at "+map.get(sum-A[i])+ " "+i);
            map.put(A[i],i);
        }
    }
    public static void main(String args[]){
        int[] arr = {3,4,3,1,3,1,-4,-2,-2};
        int[] arr1 = {-8,-6,-2,-5,-9};
        findSum(arr,7);
//        zeroSubarray(arr);
//        maxSubarray(arr);
//        maxSubarrayAllNegative(arr1);

    }
}
