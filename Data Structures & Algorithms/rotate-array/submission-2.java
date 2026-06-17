class Solution {
    public void rotate(int[] nums, int k) {
        
        if (k == 0) {
            return;
        }
        k%= nums.length;
        int i = 0;
        int rotatevalue = k;
        int j = nums.length - 1;
        while (i < j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
        i = 0;
        j = nums.length - 1;
        int track = k - 1;
        while (i < track) {
            int temp = nums[i];
            nums[i] = nums[track];
            nums[track] = temp;
            track--;
            i++;
        }
        track = k;
        while (track < j) {
            int temp = nums[track];
            nums[track] = nums[j];
            nums[j] = temp;
            j--;
            track++;
        }
    }
}