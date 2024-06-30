public class BestTimeToBuyStocks {
    public int maxProfit(int[] prices) {
       if(prices.length==0) return 0;
       int maxpro = 0;
       int buyAt=prices[0];
       for (int i=1; i<prices.length; i++){
           maxpro = Math.max(maxpro, prices[i]-buyAt);
           if(prices[i]<buyAt){
               buyAt=prices[i];
           }
           return maxpro;
       }
       return maxpro;
    }
}
