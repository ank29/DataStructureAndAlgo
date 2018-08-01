import java.util.*;

public class custCompare {
    public static void sorting(String[] a) {
        for(int i =0;i<a.length;i++){
            for(int j = 0;j<a.length-1;j++){
                int c = compare(a[i],a[j]);
                if(c>0)
                    swap(i,j,a);
            }
        }
    }
    public static void swap(int i,int j,String[] arr){
        String temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }
    static int compare(String i,String j){
        String x = i+j;
        String y = j+i;
        return x.compareTo(y);
    }
    public static void main(String args[]){
//        String[] arr = { "10", "68", "97", "9", "21", "12" };
        String[] arr = {"21","67","45","8","9"};
        List<String> numbers = Arrays.asList("21","67","45","8","9");
        sorting(arr);
        System.out.println("old java");
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
        System.out.println("new java");
        Collections.sort(numbers,(a,b)->(b+a).compareTo(a+b));
        numbers.stream().forEach(System.out::print);
    }
}

