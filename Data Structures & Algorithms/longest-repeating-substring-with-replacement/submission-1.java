class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq= new int[26];
        int ans= 0;
        int maxfreq= 0;
        int left= 0;
        for(int right =0; right<s.length(); right++){
            int idx= s.charAt(right)-'A';
            freq[idx]++;
            maxfreq= Math.max(maxfreq, freq[idx]);
            int windowLength= right-left+1;
            int replacement= windowLength-maxfreq;
            while(replacement>k){
                freq[s.charAt(left)-'A']--;
                left++;

                windowLength= right-left+1;
                replacement= windowLength-maxfreq;
            }

            ans= Math.max(ans, right-left+1);
        }
        return ans;
    }
}
