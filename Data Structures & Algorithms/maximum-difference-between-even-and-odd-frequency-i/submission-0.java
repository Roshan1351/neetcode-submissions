class Solution {
    public int maxDifference(String s) {
        Map<Character, Integer> freq = new HashMap<>();
        for(char ch: s.toCharArray()){
            freq.put(ch , freq.getOrDefault(ch, 0)+1);
        }
        int maxOdd= 0;
        int minEven= 101;
        for(Map.Entry<Character, Integer> entry: freq.entrySet()){
            int n= entry.getValue();
            if(n%2!= 0){
                maxOdd= Math.max(n, maxOdd);
            }else{
                minEven= Math.min(n, minEven);
            }
            
        }
        return maxOdd- minEven;
    }
}