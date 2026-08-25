class Solution {
    public int removeDuplicates(int[] nums) {
        Map<Integer,Integer> m = new LinkedHashMap<>();
        int res = 0;
        for(int i=0;i<nums.length;i++){
             m.put(nums[i],m.getOrDefault(nums[i], 0) + 1 );
        }
        Arrays.fill(nums,0); int ii =0;
        for (Integer key : m.keySet()) {
            Integer val = m.get(key);
            if (val >= 2) {
                res += 2;
                nums[ii] = key; ii++;   
                nums[ii] = key; ii++;
            }
            if (val == 1) {
                res += 1;
                nums[ii] = key; ii++; 
            }
        }

        System.out.println(m); System.out.println(res);
        return res;
    }
}