class Solution {
    public int buyChoco(int[] prices, int money) {
        int res= -1;
        for(int i= 0; i<prices.length; i++){
            for(int j= i+1 ; j<prices.length; j++){
                if(prices[i]+prices[j]<= money){
                    res= Math.max(res, money-prices[i]-prices[j]);
                }
            }
        }
        return res==-1?money:res;
    }
}