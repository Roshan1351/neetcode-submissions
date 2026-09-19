class Solution {
    int total= 0;
     void subset(int idx, List<Integer> xorgroup, int[] nums){
        if(idx==nums.length){
            int sum= 0;
            for(int i= 0; i<xorgroup.size(); i++){
                sum^= xorgroup.get(i);
            }
            total+= sum;
            return;
        }

        xorgroup.add(nums[idx]);
        subset(idx+1, xorgroup, nums);
        xorgroup.remove(xorgroup.size()-1);
        subset(idx+1, xorgroup, nums);
    }
    public int subsetXORSum(int[] nums) {
        List<Integer> xorgroup= new ArrayList<>();
        subset(0, xorgroup, nums);
        return total;
    }
}