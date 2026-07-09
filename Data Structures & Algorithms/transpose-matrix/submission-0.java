class Solution {
    public int[][] transpose(int[][] matrix) {
        if(matrix==null || matrix.length==0){
            return new int[0][0];
        }
        int column= matrix[0].length;
        int row= matrix.length;
        int[][] ans= new int[column][row];
        for(int i= 0; i<row; i++){
            for(int j= 0; j<column; j++){
                ans[j][i]= matrix[i][j];
            }
        }
        return ans;
    }
}