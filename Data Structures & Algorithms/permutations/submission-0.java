class Solution {
    void permutations(int[] nums, int idx, List<List<Integer>>ans){
        if(idx==nums.length){
            List<Integer> arr= new ArrayList<>();
            for(int a: nums){
                arr.add(a);
            }
            ans.add(new ArrayList<>(arr));
            return;
        }
        for(int i= idx; i<nums.length; i++){
            int temp= nums[i];
            nums[i]= nums[idx];
            nums[idx]= temp;
            permutations(nums, idx+1, ans);
            int swap=nums[idx];
            nums[idx]= nums[i];
            nums[i]= swap;
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans= new ArrayList<>();
        permutations(nums, 0, ans);
        return ans;
    }
}
