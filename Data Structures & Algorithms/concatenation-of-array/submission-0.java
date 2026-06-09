class Solution {
    public int[] getConcatenation(int[] nums) {
        int n= nums.length;
        int[] arr= new int[2*n];
        int j= n;
        for(int i= 0; i<n; i++){
            arr[i]= nums[i];
            arr[j]= nums[i];
            j++;
        }
        return arr;
    }
}