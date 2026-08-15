class Solution {
    public static void getAllSubsets(int[] nums, List<Integer> ans, int i, List<List<Integer>> allsubsets){
        if(i==nums.length){
            allsubsets.add(new ArrayList<>(ans));
            return;
        }
        ans.add(nums[i]);
        getAllSubsets(nums, ans, i+1, allsubsets);
        ans.remove(ans.size() - 1);
        getAllSubsets(nums, ans, i+1, allsubsets);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> ans= new ArrayList<>();
        List<List<Integer>> allsubsets= new ArrayList<>();
        getAllSubsets(nums, ans, 0, allsubsets);
        return allsubsets;
    }
}
