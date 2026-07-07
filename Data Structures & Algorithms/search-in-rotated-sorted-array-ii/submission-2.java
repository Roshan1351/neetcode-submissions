class Solution {
    public boolean search(int[] nums, int target) {
        int i= 0;
        int j= nums.length-1;

        while(i<=j){
            int m= i+(j-i)/2;
            if(nums[m]==target){
                return true;
            }
            if(nums[i]<nums[m]){ //left portion
                if(target>=nums[i] && target<nums[m]){
                    j = m-1;
                }else{
                    i= m+1;
                }
            }else if(nums[i]>nums[m]){
                if(target>nums[m] && target<=nums[j]){
                    i= m+1;
                }else{
                    j= m-1;
                }
            }else{
                i++;
            }
        }
        return false;
    }
}