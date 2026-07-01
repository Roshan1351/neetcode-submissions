class Solution {
    public int longestConsecutive(int[] nums) {
        int count= 0;
        Set<Integer> s= new HashSet<>();
        for(int num: nums){
            s.add(num);
        }
        for(int num: nums){
            int track= 0, curr= num;
            while(s.contains(curr)){
                track++;
                curr++;
            }
            count= Math.max(count, track);
        }
        return count;
    }
}
