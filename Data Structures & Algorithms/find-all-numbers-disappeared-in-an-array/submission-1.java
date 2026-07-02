class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> set= new HashSet<>();
        List<Integer> ans=new  ArrayList<>();
        for(int num: nums){
            set.add(num);
        }
        int n= nums.length;
        
        for(int i= 1; i<=n; i++){
            if(!set.contains(i)){
                ans.add(i);
            }
        }
        return ans;
    }
}