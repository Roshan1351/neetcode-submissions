class Solution {
public:
    int buyChoco(vector<int>& prices, int money) {
        sort(prices.begin(), prices.end());
        int count= prices[0]+prices[1];
        if(count>money){
            return money;
        }
        return (money-count);
    }
};