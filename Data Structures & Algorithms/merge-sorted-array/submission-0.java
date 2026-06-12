class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int j= 0;
        for(int i= m; i<m+n; i++){
            nums1[i]= nums2[j];
            j++;
        }
        
        for(int k=0; k<(m+n); k++){
            for(int i= k+1; i<(m+n); i++){
                if(nums1[k]>nums1[i]){
                    int temp= nums1[k];
                    nums1[k]= nums1[i];
                    nums1[i]= temp;
                }
            }
        }
    }
}