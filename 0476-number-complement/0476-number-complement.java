class Solution {
    public int findComplement(int num) {
        int n = num; int mask = 0;
        while( num > 0 ){
            mask = ( mask << 1) | 1;
            num >>= 1;
        }
        return n ^ mask;
    }
}