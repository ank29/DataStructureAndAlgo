import java.util.ArrayList;
import java.util.Arrays;

public class StockMax {
     int buy;
     int sell;
    public static void maxProfitBuySellOnce(int[] st,int n) {
        int min = st[n];
        int max = st[n];
        int max_diff = 0;
        for(int i = n-1;i>=0;i--){
            if(st[i] > max) {
                max = st[i];
            } else {
                 if(max_diff < (max - st[i])) {
                     max_diff = Math.max(max_diff, max - st[i]);
                 }
                min = st[i];
                }
            }
        System.out.println("buy at "+min +" sell at "+max + " maxProfit "+max_diff);
    }

public static void maxProfitBuySell(int[] stock,int n){
    ArrayList<StockMax> stockMaxes = new ArrayList<>();
    int i = 0;
    while (i+1 <= n){
        StockMax stockMax = new StockMax();
     while (i+1 <= n && stock[i] > stock[i+1])
        i++;
     stockMax.buy = stock[i];
        while (i+1 <= n && stock[i] < stock[i + 1])
           i++;
        stockMax.sell = stock[i];
        if((stockMax.sell - stockMax.buy) >0)
        stockMaxes.add(stockMax);
    }
    if(stockMaxes.isEmpty())
        System.out.println("no profit");
    else {
        for(StockMax stockMax:stockMaxes) {
            System.out.println(" buy at " + stockMax.buy);
            System.out.println(" sell at " + stockMax.sell);
        }
    }



}


    public static void main(String args[]){
        int[] stockPrice =   {100, 180, 260, 310, 535, 40,30,20,395};
//        maxProfitBuySellOnce(stockPrice,stockPrice.length-1);
        maxProfitBuySell(stockPrice,stockPrice.length-1);
    }
}
