class Solution {
    public int minOperations(int[] nums, int k) {
        int count = 0; Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        for(int i=0;i<nums.length;i++){
            if(nums[i] >= k ){
                break;
            }
            count++;
        }
        return count;
    }
}