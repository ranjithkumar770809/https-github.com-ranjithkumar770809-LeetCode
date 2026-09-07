class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int[] a = new int[nums.length];
        for( int i=0;i<nums.length;i++){
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;

            for( int j=0; j<=i; j++){
                max = Math.max( max,nums[j]);
            }
            for( int h=i;h<nums.length;h++){
                min = Math.min( min,nums[h]);
            }
            a[i] = max-min;
        }
        int min = Integer.MAX_VALUE;
        int res = -1;
        System.out.println(Arrays.toString(a));
        for( int i=0; i<nums.length;i++ ){
            if( a[i] <= k ){
                return i;
            }
        }
        return -1;
    }
}