class Solution {
    public int arraySign(int[] nums) {
        int sign = 1;

        for (int num : nums) {
            if (num == 0) {
                return 0; // Product is zero if any element is 0
            }
            if (num < 0) {
                sign = -sign; // Flip sign for every negative number
            }
        }

        return sign;
    }
}