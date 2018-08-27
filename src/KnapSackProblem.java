public class KnapSackProblem {
    public static int max(int a,int b){
        if(a>b) return a;
        else return b;
    }
    public static int knapSackNative(int W,int n,int[]v,int[] w){
             if(n == 0 || W == 0)
                 return 0;
            if (w[n - 1] > W)
                return knapSackNative(W, n - 1, v, w);
            else return max(v[n - 1] + knapSackNative(W - w[n - 1], n - 1, v, w), knapSackNative(W, n - 1, v, w));

    }
    public static int knapSackDP(int W,int n,int[] v,int[] w){
        int i,j;
        int k[][] = new int[n+1][W+1];
        for(i =0;i <= n;i++){
           for(j = 0;j <= W;j++){
               if(i == 0 || j == 0)
                   k[i][j] = 0;
                else if(w[i-1] <= j)
                   k[i][j]= max(v[i-1]+k[i-1][j-w[i-1]],k[i-1][j]);
               else k[i][j]=k[i-1][j];
           }
        }
        return k[n][W];
    }

    public static void main(String args[]){
        int  W  = 20 ;
        int v[] = {80,130,30};
        int w[] = {5,20,10};
        int maxValue = knapSackNative(W,v.length,v,w);

        int maxValueDP = knapSackDP(W,v.length,v,w);
        System.out.println(maxValue);
        System.out.println(maxValueDP);
    }
}
