class Solution {
    public int maxProfit(int[] prices) {
        int maxcount= 0;
        int minprice= prices[0];
        int profit= 0;
        for(int i= 1; i<prices.length; i++){
            if(prices[i]<minprice){
                minprice= prices[i];
            }else{
                profit= prices[i]-minprice;
                maxcount= Math.max(profit, maxcount);
            }
        }
        return maxcount;
    }
}
