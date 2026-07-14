class Solution {
    public int findDuplicate(int[] nums) {
        int[] arr= new int[nums.length];
        for(int i= 0; i<nums.length; i++){
            int idx= nums[i];
            if(arr[idx]==1){
                return nums[i];
            }
            arr[idx]= 1;
        }
        return -1;
    }
}
