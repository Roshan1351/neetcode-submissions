class Solution {
    public int searchBinary(int[] nums, int target, int st, int end) {
        
        if (st <= end) {
            int mid = st + (end - st) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] >= target) {
                return searchBinary(nums, target, st, mid - 1);
            } else {
                return searchBinary(nums, target, mid + 1, end);
            }
        }
        return -1;
    }
    public int search(int[] nums, int target) {
        return searchBinary(nums, target, 0, nums.length-1);
    }
}
