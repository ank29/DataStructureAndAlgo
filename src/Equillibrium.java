public class Equillibrium {
    static  void equillibriumNaive(int[] arr) {
        int n = arr.length;
        int left[] = new int[n];
        left[0] = 0;
        for (int i = 1; i < n; i++) {
            left[i] = left[i-1]+arr[i-1];
        }
        int rightsum = 0;
        for(int i = n-1;i>=0;i--){
            if(left[i] == rightsum){
                System.out.println("equillibrium found at index "+i);
            }
            else rightsum= rightsum+arr[i];
        }
    }
    static void equillibriumBetter(int[] arr){
        int n = arr.length;
        int totalsum = 0;
        for (int i = 0; i < n; i++) {
            totalsum = totalsum+arr[i];
        }
        int rightsum = 0;
        for(int i = n-1;i>=0;i--){
            if((totalsum-(arr[i]+rightsum))== rightsum)
                System.out.println(i);
            rightsum= rightsum+arr[i];
        }
    }
    public static void main(String args[]){
        int[] arr = {-7, 1, 5, 2, -4, 3, 0};
        equillibriumNaive(arr);
        equillibriumBetter(arr);

    }
}

