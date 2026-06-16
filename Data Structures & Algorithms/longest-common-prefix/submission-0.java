class Solution {
    public String longestCommonPrefix(String[] strs) {
       
        if(strs==null || strs.length==0){
            return "";
        }
         String str= strs[0];
        int idx= str.length();
        boolean isfound= false;
        for(int i= 0; i<str.length(); i++){
            char ch= str.charAt(i);
            for(int j= 1; j<strs.length; j++){
                if(i>= strs[j].length() || ch!= strs[j].charAt(i)){
                    idx= i;
                    isfound= true;
                    break;
                }
                
                
            }
            if(isfound){
                    break;
                }
        }
        return str.substring(0, idx);
    }
}