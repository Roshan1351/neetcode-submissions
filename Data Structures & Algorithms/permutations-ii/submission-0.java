class Solution {
    static void permutation(int[] nums, int idx, List<List<Integer>> ans){
        if(nums.length==idx){
            List<Integer> temp= new ArrayList<>();
            for(int n: nums){
                temp.add(n);
            }
            ans.add(temp);
            return;
        }
        for(int i= idx; i<nums.length; i++){
            int temp= nums[i];
            nums[i]= nums[idx];
            nums[idx]= temp;
            permutation(nums, idx+1, ans);
            temp= nums[i];
            nums[i]= nums[idx];
            nums[idx]= temp;
        }
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ans= new ArrayList<>();
        permutation(nums, 0, ans);
        Map<List<Integer>, Integer> map= new HashMap<>();
        for(List<Integer> ansIteration: ans){
            map.put(ansIteration, map.getOrDefault(ansIteration, 0)+1);
        }
        ans.clear();
        for(Map.Entry<List<Integer>, Integer> entry: map.entrySet()){
            ans.add(entry.getKey());
        }
        return ans;
    }
}