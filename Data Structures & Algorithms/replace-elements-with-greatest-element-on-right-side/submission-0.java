class Solution {
    public int[] replaceElements(int[] arr) {
        int n= arr.length;
        if(n==1){
            int[] ans= new int[1];
            ans[0]= -1;
            return ans;
        }
        int[] ans= new int[n];
        for(int i= 0; i<n; i++){
            int maxnum= -1;
            for(int j= i+1; j<n; j++){
                maxnum= Math.max(arr[j], maxnum);
            }
            ans[i]= maxnum;
        }
        ans[n-1]= -1;
        return ans;
    }
}