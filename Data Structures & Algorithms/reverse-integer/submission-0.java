class Solution {
    public int reverse(int x) {
         int reversed = 0;
        int remainder;
        
        while (x != 0) {
            remainder = x % 10;
            
            // Java bounds check using Integer constants
            if ((reversed > Integer.MAX_VALUE / 10) || (reversed < Integer.MIN_VALUE / 10)) {
                return 0;
            }
            
            reversed = reversed * 10 + remainder;
            x /= 10;
        }
        return reversed;
    }
}
