class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans= new ArrayList<>();
        Arrays.sort(nums);
        int n= nums.length;
        for(int i= 0; i<n; i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            for(int j= i+1; j<n;){
                int p= j+1;
                int q= n-1;
                while(p<q){
                     long  count= ( long)nums[i]+( long)nums[j]+( long )nums[p]+( long)nums[q];
                    if(count==target){
                        List<Integer> result= new ArrayList<>();
                        result.add(nums[i]);
                        result.add(nums[j]);
                        result.add(nums[p]);
                        result.add(nums[q]);
                        ans.add(result);
                        p++;
                        q--;
                        while(p<q && nums[p]==nums[p-1]) p++;
                    }else if(count<target){
                        p++;
                    }else{
                        q--;
                    }

                }
                j++;
                while(j<n && nums[j]==nums[j-1])j++;
            }
        }
        return ans;
    }
}