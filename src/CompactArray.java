
public class CompactArray {
    public static StringBuilder appendRange(StringBuilder s ,int previous,int start){
        s.append(start);
        if(previous != start) s.append(previous-start >1 ?"-":",").append(previous);
        return s;
    }
    public static String compact(int[] arr){
        int start = arr[0],previous = arr[0];
        StringBuilder sb = new StringBuilder();
        for(int i = 1;i<arr.length;i++){
            if(previous+1 !=arr[i]){
                appendRange(sb,previous,start).append(",");
                start = arr[i];
            }
             previous = arr[i];
        }
        String result = appendRange(sb,previous,start).append(",").toString();
        return result;
    }
public static void main(String args[]){
    int[] arr = {1,2,3,5,6,7,8,11,15,16};
    String s= compact(arr);
    System.out.println(s);
}
}

