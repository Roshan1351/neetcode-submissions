class Solution {
    public int trap(int[] height) {
        int i= 0;
        int n= height.length;
        int j= n-1;
        int ans= 0;
        int lmax= height[0];
        int rmax= height[j];

        while(i<j){
            lmax= Math.max(lmax, height[i]);
            rmax= Math.max(rmax, height[j]);
            if(lmax<rmax){
                ans+= (lmax-height[i]);
                i++;
            }else{
                ans+= (rmax-height[j]);
                j--;
            }
        }
        return ans;
    }
}
