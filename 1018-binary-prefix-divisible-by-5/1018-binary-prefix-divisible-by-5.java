class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> l = new ArrayList<>();
        int rem =0;

        for( int i : nums){
            rem = ((rem << 1)+i)%5;
            l.add(rem == 0);
        }
        return l;
    }
}