class Solution {
    public boolean divisible(String s){
        int rem = 0;
        for( char c : s.toCharArray()){
            int b = c-'0';
            rem = ((rem << 1)+b) %5;
        }
        return rem == 0;
    }
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> l = new ArrayList<>();
        String s = "";
        for( int i : nums){
            s+=i;
            if ( divisible(s)){
                l.add(true);
            }
            else{
                l.add(false);
            }
        }
        return l;
    }
}