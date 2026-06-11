class Solution {
    public int firstMissingPositive(int[] nums) {
        int n= nums.length;
        Arrays.sort(nums);
        int track= 1;
        for(int i= 0; i<n; i++){
            if(nums[i]<= 0){
                continue;
            }

            if(nums[i]==track){
                track++;
            }else if(nums[i]>track){
                return track;
            }
        }
        return track;
    }
}