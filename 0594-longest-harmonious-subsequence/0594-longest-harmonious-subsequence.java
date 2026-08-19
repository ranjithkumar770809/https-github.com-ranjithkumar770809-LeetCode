class Solution {
    public int findLHS(int[] nums) {
        int res =0;
        Arrays.sort(nums);
        Map<Integer,Integer> map = new HashMap<>();
        for(int i: nums){  map.put(i,map.getOrDefault(i,0)+1);  }

        for(int i: nums){
            int max = 0;
            if(map.containsKey(i+1)){
                max = map.get(i)+map.get(i+1);
            }
            res = Math.max(max,res);
        }
        System.out.println(map);
        return res;
    }

}