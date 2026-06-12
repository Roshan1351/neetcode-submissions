class Solution {
    public boolean isPalindrome(String s) {
        String str= "";
        for(int i= 0; i<s.length(); i++){
            char ch= s.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                str+= Character.toLowerCase(ch);
            }
        }
        int i= 0;
        int j= str.length()-1;
        while(i<=j){
            char ch= str.charAt(i);
            char chars= str.charAt(j);
            if(ch!=chars){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
