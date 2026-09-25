class Solution {
    public boolean ispossible(int[] weights, int days, int guess){
        int k= 0;
        int day= 1;
        for(int i= 0; i<weights.length; i++){
            if(k+weights[i]<= guess){
                k+= weights[i];
                
            }else{
                day++;
                k= weights[i];
                if(day>days){
                    return false;
                }
            }
        }
        return true;
    }
    public int shipWithinDays(int[] weights, int days) {
        int low= 0;
        int high= 0;
        for(int i= 0; i<weights.length; i++){
            high+= weights[i];
            low= Math.max(low, weights[i]);

        }
        int ans= 0;
        while(low<=high){
            int guess= low+(high-low)/2;
            if(ispossible(weights, days, guess)){
                ans= guess;
                high= guess-1;
            }else{
                low = guess+1;
            }
        }
        return ans;
    }
}