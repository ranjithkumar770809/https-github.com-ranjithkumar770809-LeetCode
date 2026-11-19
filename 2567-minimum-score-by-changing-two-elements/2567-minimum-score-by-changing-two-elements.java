// Approach 1 ------------------------------------------------------------ --- -- ->

class Solution {
    public int minimizeSum(int[] nums) {
        int[] small = new int[3], neg = new int[3];
        Arrays.fill(small, Integer.MAX_VALUE);
        Arrays.fill(neg, Integer.MAX_VALUE);
        for (int x : nums) {
            keep(small, x);
            keep(neg, -x);
        }
        return Math.min(-neg[0] - small[2], Math.min(-neg[1] - small[1], -neg[2] - small[0]));
    }

    private void keep(int[] three, int x) {
        if (x >= three[2])
            return;
        int i = 2;
        for (; i > 0 && three[i - 1] > x; i--)
            three[i] = three[i - 1];
        three[i] = x;
    }
}



// Approach 2 ------------------------------------------------------------ --- -- ->


// class Solution {
//     public int minimizeSum(int[] nums) {

//         Arrays.sort(nums);

//         int n = nums.length;

//         if (n <= 3) {
//             return 0;
//         }

//         int a = nums[n - 1] - nums[2];
//         int b = nums[n - 2] - nums[1];
//         int c = nums[n - 3] - nums[0];

//         return Math.min(a, Math.min(b, c));
//     }
// }