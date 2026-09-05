class Solution {
    private boolean match(int[] a, int[] b){
        for(int i= 0 ; i<26; i++){
            if(a[i]!= b[i]){
                return false;
            }
        }
        return true;
    }
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()){
            return false;
        }
        int n= s1.length();
        int[] a= new int[26];
        int[] b= new int[26];
        for(char ch: s1.toCharArray()){
            a[ch-'a']++;
        }
        for(int i= 0; i<n; i++){
            b[s2.charAt(i)-'a']++;
        }
        if(match(a, b)){
            return true;
        }
        for(int i = n; i<s2.length(); i++){
            b[s2.charAt(i-n)-'a']--;

            b[s2.charAt(i)-'a']++;
            if(match(a,b)){
                return true;
            }
        }
        return false;
    }
}
