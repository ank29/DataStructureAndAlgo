
public class Search {
    public static int binarySearch(int[] arr,int l,int h,int x){
        if(l<h){
            int mid = l+(h-l)/2;
            if(arr[mid ] == x)
                return mid;
            else if(arr[mid] > x)
                return binarySearch(arr,l,mid-1,x);
            else return binarySearch(arr,mid+1,h,x);
        }
           return -1;
    }
    public static int jumpSearch(int[] arr,int l,double h,int x){
           int jump = (int)Math.floor(Math.sqrt(h));
           while(l<=h && l >=0){
                   if(arr[l] == x)
                       return l;
                   else if(arr[l] > x) {
                       return binarySearch(arr,l-jump,l,x);
                   }
                   else l = l+jump;

           }
           return -1;
    }
    public static void main(String args[]){
        int arr[] = { 0,1, 2, 3, 5, 8, 13, 21,
                34, 55, 89, 144, 233, 377, 610};
        int index = binarySearch(arr,0,arr.length-1,55);
        System.out.println("found at index ::"+index);
        int indexJump = jumpSearch(arr,0,arr.length-1,55);
        System.out.println("found at index ::"+indexJump);
    }

}
