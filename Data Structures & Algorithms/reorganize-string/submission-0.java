class Solution {
    public String reorganizeString(String s) {
        int[] freq= new int[26];
        int maxfreq= 0;
        char maxchar= ' ';
        for(char ch: s.toCharArray()){
            freq[ch-'a']++;
            if(freq[ch-'a']>maxfreq){
                maxfreq= freq[ch-'a'];
                maxchar= ch;
            }
        }
        if(maxfreq>(s.length()+1)/2){
            return "";
        }
        char[] res= new char[s.length()];
        int idx= 0;
        while(freq[maxchar-'a']>0){
            res[idx]= maxchar;
            idx+= 2;
            freq[maxchar-'a']--;
        }

        for(int i= 0; i<26; i++){
            while(freq[i]>0){
                if(idx>= s.length()){
                    idx= 1;
                }
                res[idx]= (char)(i+'a');
                idx+= 2;
                freq[i]--;
            }
        }
        return new String(res);
    }
}