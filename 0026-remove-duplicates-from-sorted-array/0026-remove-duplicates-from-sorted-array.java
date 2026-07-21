class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer> s = new LinkedHashSet<>();
        for( int i : nums ){
            s.add(i);

        }
        Arrays.fill(nums,0);
        ArrayList<Integer> l = new ArrayList<>(s);
         for( int i=0;i< s.size() ;i++){ 
            nums[i] = l.get(i);
         }
        return s.size();
    }
}