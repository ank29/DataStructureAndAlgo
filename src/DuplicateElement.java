import java.util.HashMap;

public class DuplicateElement {
    public static void findDuplicateUsigHash(int[] arr){
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for(int i =0;i<arr.length;i++){
            if(hashMap.containsKey(arr[i]))
                System.out.println("Duplicate ::"+arr[i]);
            else
                hashMap.put(arr[i],i);
        }
    }
    public static void findDuplicateUsingArray(int[] arr){
        int duplicate = -1;
        for(int i =0;i<arr.length;i++){
            int j = arr[i] - (i+1);
            if(j < 0) {
                System.out.println("duplicate element is ::" + arr[i]);
                break;
            }
        }

    }
    public static void main(String args[]){
        int[] arr = {1,1,2,3,4,5};
        findDuplicateUsigHash(arr);
        findDuplicateUsingArray(arr);
    }
}
