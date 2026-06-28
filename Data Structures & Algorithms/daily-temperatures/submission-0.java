class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] ans= new int[n];
        for(int i= 0; i<n; i++){
            boolean check=false;
            for(int j= i+1; j<n; j++){
                if(temperatures[i]<temperatures[j] && ans[i]==0){
                    check= true;
                    ans[i]= j-i;
                }
                if(check){
                    continue;
                }
            }
            if(!check){
                ans[i]= 0;
            }
        }
        return ans;
    }
}
