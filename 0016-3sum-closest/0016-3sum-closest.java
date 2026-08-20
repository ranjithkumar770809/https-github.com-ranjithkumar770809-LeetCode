// class Solution {
//     public int threeSumClosest(int[] nums, int target) {
//         int ans=0;
//         int minclose = Integer.MAX_VALUE; Arrays.sort(nums);
//         if(nums.length == 3 ){ return nums[0]+nums[ 2]+nums[ 1];  }

//         for(int i=0;i<nums.length;i++){
//             int res = 0;
//             if(i+2 <nums.length){
//                  res = nums[i]+nums[i+2]+nums[i+1];
//             }
//             else{ break; }
            
//             if(res+1 == target || res-1==target){
//                 return res;
//             }
//             int diff =Math.abs(target-res);
//             if(minclose > diff){
//                 minclose = diff;
//                 ans = res;
//             }

//         }

//         return ans;
//     }
// }



class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int ans = nums[0] + nums[1] + nums[2];
        int minclose = Integer.MAX_VALUE;

        if (nums.length == 3) { 
            return nums[0] + nums[1] + nums[2]; 
        }

        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int res = nums[i] + nums[left] + nums[right];

                if (res == target) {
                    return res;
                }

                int diff = Math.abs(target - res);
                if (diff < minclose) {
                    minclose = diff;
                    ans = res;
                }

                if (res < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return ans;
    }
}