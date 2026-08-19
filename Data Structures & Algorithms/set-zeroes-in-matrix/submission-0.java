class Solution {
    public void setZeroes(int[][] matrix) {
        boolean[] rows= new boolean[matrix.length];
        boolean[] column= new boolean[matrix[0].length];

        for(int i= 0; i<matrix.length; i++){
            for(int j= 0; j<matrix[0].length; j++){
                if(matrix[i][j]==0){
                    rows[i]= true;
                    column[j]= true;
                }
            }
        }

        for(int i= 0; i<matrix.length; i++){
            for(int j= 0; j<matrix[0].length; j++){
                if(rows[i] || column[j]){
                    matrix[i][j]= 0;
                }
            }
        }
    }
}
