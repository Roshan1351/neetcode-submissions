class Solution {
    public int calPoints(String[] operations) {
        ArrayList<Integer> record = new ArrayList<>();
        for(String ch: operations){
            if(ch.equals("+")){
                int n= record.size()-1;
                record.add(record.get(n)+record.get(n-1));
            }else if(ch.equals("D")){
                int n= record.size()-1;
                record.add(record.get(n)*2);
            }else if(ch.equals("C")){
                record.remove(record.size()-1);
            }else{
                int num= Integer.parseInt(ch);
                record.add(num);
            }
        }
        int sum= 0;
        for(int i= 0; i<record.size(); i++){
            sum+= record.get(i);
        }
        return sum;
    }
}