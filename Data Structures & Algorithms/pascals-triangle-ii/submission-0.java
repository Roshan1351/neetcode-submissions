class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> ans= new ArrayList<>(Arrays.asList(1));
        if(rowIndex==0) return Arrays.asList(1);
        List<Integer> previousrow= getRow(rowIndex-1);
        for(int i= 1; i<rowIndex; i++){
            ans.add(previousrow.get(i-1)+previousrow.get(i));

        }
        ans.add(1);
        return ans;
    }
}