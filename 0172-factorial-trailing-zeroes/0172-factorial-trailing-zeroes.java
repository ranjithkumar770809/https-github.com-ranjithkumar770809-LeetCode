class Solution {
    public int trailingZeroes(int n) {
        int divide = 5; int res = 0;
        while( divide <= n ){
            res += ( n/divide );
            divide *= 5;
        }
        return res;
    }
}