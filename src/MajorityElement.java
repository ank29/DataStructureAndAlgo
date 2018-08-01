public class MajorityElement {
    public static int mahorityelement(int[] arr){
        int i = 0;
        int m = 0;
        for(int j =0;j<arr.length;j++){
            if(i == 0){
                m = arr[i];
                i++;
            }
            else if(m == arr[j])
                i++;
            else i--;
        }
        return m;
    }
    public static void main(String args[]){
        int[] arr = {1,2,1,3,1,2,1,3,1,2,1,3};
        int m = mahorityelement(arr);
        System.out.println(m);
    }
}
