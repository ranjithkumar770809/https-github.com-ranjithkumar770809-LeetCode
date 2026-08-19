class Solution {
    public void moveZeroes(int[] nums) {
        int size = nums.length;
        int j=0;
        for(int i=0;i<size;i++)
        {
            if(nums[i] != 0)
            {
                int t =nums[i];
                nums[i] = nums[j];
                nums[j] = t;
                j++;
            }
        }
           System.out.print(Arrays.toString(nums)); 
    }
}