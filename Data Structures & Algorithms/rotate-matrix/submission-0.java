class Solution {
    public void rotate(int[][] matrix) {
        int n= matrix.length;
        int[][] rotated= new int[n][n];
        for(int i= 0; i<n; i++){
            for(int j= 0; j<n; j++){
                rotated[j][i]= matrix[i][j];
            }
        }
        for(int i= 0; i<n;i++){
            int left= 0;
            int right= n-1;
            while(left<right){
                // swap(rotated[i][left], rotated[i][right]);
                int temp= rotated[i][left];
                rotated[i][left]= rotated[i][right];
                rotated[i][right]= temp;
                left++;
                right--;
            }
        }
        for(int i= 0; i<n; i++){
            for(int j= 0; j<n; j++){
                matrix[i][j]= rotated[i][j];
            }
        }
    }
}
