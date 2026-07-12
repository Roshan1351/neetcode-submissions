class Solution {
    public int mySqrt(int x) {
        int left= 0;
        int right= x;
        while(left<= right){
            long mid=(long) (left+(right-left)/2);
            long val= (mid*mid);
            if(val==x){
                return (int)mid;
            }else if(val>x){
                right= (int)mid-1;
            }else{
                left= (int)mid+1;
            }
        }
        return right;
    }
}