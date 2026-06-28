class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1= nums1.length;
        int n2= nums2.length;

        int[] num= new int[n1+n2];
        for(int i= 0; i<n1; i++){
            num[i]= nums1[i];
        }
        int j= 0;
        for(int i= n1; i<n1+n2; i++){
            num[i]= nums2[j++];
        }
        double ans= 0.0;
        Arrays.sort(num);
        if((n1+n2)%2==0){
            int idx= num.length/2;
            ans= (num[idx-1]+num[idx])/2.0;
        }else{
            int idx= num.length/2;
            ans= (double)(num[idx]);
        }
        return ans;
    }
}
