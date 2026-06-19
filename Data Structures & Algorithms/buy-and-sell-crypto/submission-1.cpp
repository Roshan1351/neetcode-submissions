class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int maxprofits= 0;
        int profits= 0;
        int minprice= prices[0];
        for(int i= 1; i<prices.size(); i++){
            if(minprice>prices[i]){
                minprice= prices[i];
            }else{
                profits= prices[i]-minprice;
                maxprofits= max(maxprofits, profits);
            }
        }
        return maxprofits;
    }
};
