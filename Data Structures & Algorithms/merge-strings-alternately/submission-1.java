class Solution {
    public String mergeAlternately(String word1, String word2) {
        int l1= word1.length();
        int l2= word2.length();
        int i= 0;
        int j= 0;
        String str= "";
        while(i<l1 && j<l2){
            str+= word1.charAt(i);
            str+= word2.charAt(j);
            i++;
            j++;
        }
        while(i<l1){
            str+= word1.charAt(i);
            i++;
        }
        while(j<l2){
            str+= word2.charAt(j);
            j++;
        }
        return str;
    }
}