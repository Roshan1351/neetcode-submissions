class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans= new ArrayList<>();
        backtrack(nums,new ArrayList<>(),  ans, 0);
        return ans;
    }

    static void backtrack(int[] nums, List<Integer> subset, List<List<Integer>> ans, int idx){
        
        ans.add(new ArrayList<>(subset));

        for(int i= idx; i<nums.length; i++){
            if(i>idx && nums[i]== nums[i-1]){
                continue;
            }
            subset.add(nums[i]);
            backtrack(nums, subset, ans, i+1);
            subset.remove(subset.size()-1);
        }
    }
}
