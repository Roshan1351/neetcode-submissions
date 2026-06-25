class Solution {
    public int countSeniors(String[] details) {
        int count= 0;
        for(int i= 0; i<details.length; i++){
            String string= details[i];
            String str= ""+ string.charAt(11)+string.charAt(12);
            int num= Integer.parseInt(str);
            if(num>60){
                count++;
            }
        }
        return count;
    }
}