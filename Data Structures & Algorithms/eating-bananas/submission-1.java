class Solution {
    public int func(int[] piles, int n, int guess){
        int h= 0;
        for(int i= 0; i<n ;i++){
            h=h+ piles[i]/guess;
            if(piles[i]%guess!= 0){
                h++;
            }
        }
        return h;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int n= piles.length;
        int high= Arrays.stream(piles).max().getAsInt();
        int ans= high;
        while(low<= high){
            int mid= (low+high)/2;
            int hour= func(piles, n, mid);
            if(hour>h){
                low= mid+1;
            }else{
                ans= mid;
                high= mid-1;
            }
        }
        return ans;
    }
}
