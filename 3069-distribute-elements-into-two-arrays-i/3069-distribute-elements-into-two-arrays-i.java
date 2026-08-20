import java.util.*;

class Solution {
    public int[] resultArray(int[] nums) {
        List<Integer> arr1 = new ArrayList<>();
        List<Integer> arr2 = new ArrayList<>();

        // First operation: append nums[0] to arr1
        arr1.add(nums[0]);
        // Second operation: append nums[1] to arr2
        arr2.add(nums[1]);

        // Sequential comparisons for the rest of the elements
        for (int i = 2; i < nums.length; i++) {
            if (arr1.get(arr1.size() - 1) > arr2.get(arr2.size() - 1)) {
                arr1.add(nums[i]);
            } else {
                arr2.add(nums[i]);
            }
        }

        // Merge arr1 followed by arr2 into result array
        int[] result = new int[nums.length];
        int index = 0;

        for (int num : arr1) {
            result[index++] = num;
        }
        for (int num : arr2) {
            result[index++] = num;
        }

        return result;
    }
}