class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        if(nums.length < 2)
        {
            return nums[0];
        }
        for(int i = 0 ; i < nums.length ; i++)
        {
            if( i+2 < nums.length && nums[i] == nums[i+2] )
            {
                i = i + 2;
            }
            else{
                    return nums[i];
            }

        }
        return 0;
    }
}