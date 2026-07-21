class Solution {
    public int removeElement(int[] nums, int val) {
        //Arrays.sort(nums);
        int numOccurences = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != val)
                continue;
                else{
            numOccurences++;
            nums[i] = 51;  
        }}
        Arrays.sort(nums);
        return nums.length - numOccurences;
    }
}