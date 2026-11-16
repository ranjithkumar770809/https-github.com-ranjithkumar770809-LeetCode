public class Solution {
    public int[] TwoSum(int[] nums, int target) {
        int[] res={};
        Array.Resize( ref res, 2);
        res[0]= 0;
        res[1]=0;
        for(int i=0;i<nums.Length-1;i++){
            for( int j=i+1;j<nums.Length;j++){
                if(nums[i]+ nums[j] == target ){
                    res[0]=i; res[1]=j;
                    break;
                }
            }

        }
        return res;
    }
}