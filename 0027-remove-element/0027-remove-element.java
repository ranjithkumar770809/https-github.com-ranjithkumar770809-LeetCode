class Solution {
    public int removeElement(int[] nums, int val) {
        ArrayList<Integer> l = new ArrayList<>();
        int j = 0;
        for( int i=0;i< nums.length ;i++ ){
            if( nums[i] != val ){
                l.add(nums[i]);
                 }

         } 
         for( int i=0;i< l.size() ;i++ ){
            nums[i] = l.get(i);
         }
        return l.size();
    }
}