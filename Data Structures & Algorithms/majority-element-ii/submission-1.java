class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer, Integer> freq= new HashMap<>();
        int n= nums.length;
        for(int num: nums){
            freq.put(num, freq.getOrDefault(num, 0)+1);
        }
        List<Integer> ans= new ArrayList<>();
        for(Map.Entry<Integer, Integer> check: freq.entrySet()){
            if(check.getValue()> n / 3){
                ans.add(check.getKey());
            }
        }
        return ans;
    }
}