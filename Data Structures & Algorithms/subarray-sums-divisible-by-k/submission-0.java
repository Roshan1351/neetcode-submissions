class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int count= 0;
        int[] sum= new int[nums.length];
        sum[0]= nums[0];
        for(int i= 1; i<nums.length; i++){
            sum[i]= sum[i-1]+nums[i];
        }

        for(int i= 0; i<nums.length; i++){
            if(sum[i]%k==0){
                count++;
            }

            for(int j= 0; j<i; j++){
                if((sum[i]-sum[j])%k==0){
                    count++;
                }
            }
        }
        return count;
    }
}