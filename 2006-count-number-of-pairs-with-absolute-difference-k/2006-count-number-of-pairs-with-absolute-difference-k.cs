public class Solution {
    public int CountKDifference(int[] nums, int k) {
        int res = 0;
        // if(k==1){return nums.Length;}
        for(int i=0;i<nums.Length-1;i++){
            for(int j=i+1;j<nums.Length;j++){
                if(nums[i]-nums[j] == k){
                    res++;
                }
                else if(nums[j]-nums[i]==k){
                    res++;
                }
                else{
                    continue;
                }
            }
        }
        return res;
    }
}