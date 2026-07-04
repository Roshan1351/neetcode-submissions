class Solution {
    public int[] rearrangeArray(int[] nums) {
        List<Integer> positive= new ArrayList<>();
        List<Integer> negative= new ArrayList<>();
        for(int num: nums){
            if(num>0){
                positive.add(num);
            }else{
                negative.add(num);
            }
        }
        int idx= 0;
        for(int i= 0; i<nums.length; ){
            nums[i]= positive.get(idx);
            i++;
            nums[i]= negative.get(idx);
            i++;
            idx++;
        }
        return nums;
    }
}