class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.equals(" ")){
            return 1;
        }
        boolean[] count= new boolean[256];
        Arrays.fill(count, false);

        int first= 0;
        int second= 0;
        int len= 0;
        while(second<s.length()){
            while(count[s.charAt(second)]){
                count[s.charAt(first)]= false;
                first++;
            }
            count[s.charAt(second)]= true;
            len= Math.max(len, second-first+1);
            second++;
        }
        return len;
    }
}
