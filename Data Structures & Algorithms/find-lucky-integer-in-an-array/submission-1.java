class Solution {
    public int findLucky(int[] arr) {
        int count= 0;
        Map<Integer, Integer> freq=new HashMap<>();
        for(int a: arr){
            freq.put(a, freq.getOrDefault(a, 0)+1);
        }
        for(Map.Entry<Integer, Integer> maps: freq.entrySet()){
            if(maps.getKey()==maps.getValue()){
                count= Math.max(count, maps.getValue());
            }
        }
        return count==0?-1:count;
    }
}