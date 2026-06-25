class Solution {
    public int scoreOfString(String s) {
        int score= 0;
        for(int i= 0; i<s.length()-1; i++){
            char ch= s.charAt(i);
            int ascii= ch;
            char ch1= s.charAt(i+1);
            int ascii1= ch1;
            score+= Math.abs(ascii1-ascii);
        }
        return score;
    }
}