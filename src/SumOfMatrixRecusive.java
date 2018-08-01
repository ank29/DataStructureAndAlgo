public class SumOfMatrixRecusive {
    public static int sumOfArrays(int[][] arr,int r,int c){
        if( r == 0 && c == 0 )
            return arr[0][0];
        if(c == 0)
           return sumOfArrays(arr,r-1,arr.length-1)+ arr[r][c];
        return sumOfArrays(arr,r,c-1)+ arr[r][c];

    }
    public static void main(String args[]){
        int[][] array = {{1,1,1},{2,2,2},{3,3,3}};
        int sum = sumOfArrays(array,2,2);
        System.out.println(sum);
    }
}
