class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n= nums.length;
        HashMap<Integer, Integer> map= new HashMap<>();
        for(int i= 0; i<n; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }
        int[] ans= new int[k];

        for(int i= 0; i<k; i++){
            int maxcount= 0;
            int answer= 0;
            for(Map.Entry<Integer, Integer> entry: map.entrySet()){
                if(maxcount<entry.getValue()){
                    maxcount= entry.getValue();
                    answer= entry.getKey();
                }

            }
            ans[i]= answer;
            map.remove(answer);
        }
        return ans;
    }
}
