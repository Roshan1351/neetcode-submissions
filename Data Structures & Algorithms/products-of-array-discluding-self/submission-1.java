class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n= nums.length;
        int[] answer= new int[n];
        for(int i= 0;i<n; i++){
            int ans=1;
            for(int j= 0; j<n; j++){
                if(i!=j){
                    ans= ans*nums[j];
                }
            }
            answer[i]= ans;
        }
        return answer;
    }
}  
