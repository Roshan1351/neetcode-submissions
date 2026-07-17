class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int doubles = 0, missing = 0;
        for (int i = 1; i <= n * n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    if (grid[j][k] == i) {
                        count++;
                    }
                }
            }
            if (count == 2) {
                doubles = i;
            }else if(count==0){
                missing= i;
            }
        }
        return new int[]{doubles, missing};
    }
}