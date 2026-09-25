class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        List<List<Integer>> range= new ArrayList<>();
        int col= matrix[0].length;
        for(int i= 0; i<matrix.length; i++){
            int low= matrix[i][0];
            int high= matrix[i][col-1];
            List<Integer> arr= new ArrayList<>(List.of(low, high));
            range.add(arr);
        }
        int present= -1;

        for(int i= 0; i<range.size(); i++){
            if(target>= range.get(i).get(0) && target<= range.get(i).get(1)){
                present= i;
                break;
            }
        }
        if(present==-1){
            return false;
        }

        for(int i= 0; i<col; i++){
            if(target==matrix[present][i]){
                return true;
            }
        }
        return false;
    }
}
