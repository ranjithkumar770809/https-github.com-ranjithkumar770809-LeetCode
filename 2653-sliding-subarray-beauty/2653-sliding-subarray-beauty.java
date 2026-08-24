class Solution {
    public int[] getSubarrayBeauty(int[] nums, int k, int x) {
        int n = nums.length;
        int[] result = new int[n - k + 1];
        int[] freq = new int[50];
        int negCount = 0;

        for (int i = 0; i < k; i++) {
            if (nums[i] < 0) {
                freq[nums[i] + 50]++;
                negCount++;
            }
        }

        for (int i = 0; i <= n - k; i++) {
            if (negCount >= x) {
                int count = 0;
                for (int j = 0; j < 50; j++) {
                    count += freq[j];
                    if (count >= x) {
                        result[i] = j - 50;
                        break;
                    }
                }
            }

            if (i < n - k) {
                if (nums[i] < 0) {
                    freq[nums[i] + 50]--;
                    negCount--;
                }
                if (nums[i + k] < 0) {
                    freq[nums[i + k] + 50]++;
                    negCount++;
                }
            }
        }

        return result;
    }
}