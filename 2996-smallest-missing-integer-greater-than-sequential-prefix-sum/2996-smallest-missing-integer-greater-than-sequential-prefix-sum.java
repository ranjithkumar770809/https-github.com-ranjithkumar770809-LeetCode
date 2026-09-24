class Solution {
    public int missingInteger(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int sum = 0;
        for( int i=0,j=1;i<nums.length;i++){
            set.add(nums[i]);
            if( j<nums.length && nums[j-1]+1 == nums[j]){
                sum += nums[j-1]; j++;
            }
            else{
                sum += nums[j-1];
                for( int k=i;k<nums.length;k++){
                    set.add(nums[k]);
                }
                while( set.contains(sum) ){
                    sum++;
                }
                return sum;
            }
        }
        return 1;
    }
}