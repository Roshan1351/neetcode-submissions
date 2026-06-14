class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        Set<List<Integer>> ans= new HashSet<>();
        for(int i= 0; i<nums.length; i++){
            
            for(int j= i+1; j<nums.length; j++){
                for(int k= j+1; k<nums.length; k++){
                    if(nums[i]+nums[j]+nums[k]==0){
                        List<Integer> result= new ArrayList<>();
                        result.add(nums[i]);
                        result.add(nums[j]);
                        result.add(nums[k]);
                        Collections.sort(result);
                        ans.add(result);
                    }
                }
            }
            
            

        }
        return new ArrayList<>(ans);
    }
}
