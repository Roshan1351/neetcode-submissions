class Solution {
    public int maxArea(int[] heights) {
        int maxwater= 0;
        for(int i= 0; i<heights.length; i++){
            for(int j= i+1; j<heights.length; j++){
                int diff= j-i;
                int height= Math.min(heights[i], heights[j]);
                int area= height*diff;
                maxwater= Math.max(maxwater, area);
            }
        }
        return maxwater;
    }
}
