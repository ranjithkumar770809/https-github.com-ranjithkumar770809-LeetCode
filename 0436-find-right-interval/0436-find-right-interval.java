class Solution {
    public int[] findRightInterval(int[][] intervals) {
         int[] res = new int[intervals.length];
        //  if( intervals.length == 1)
        //  {
        //      res[0] = -1;
        //      return res;
        //  }
        //  for(int i=0;i<intervals.length;i++){
        //     int[] a = intervals[i];
        //     int l = a[1]; int tr = Integer.MAX_VALUE;
        //     int index = -1;
        //     for(int j=0;j< intervals.length;i++)
        //     {
        //         int[] temp = intervals[j];
        //         if( l <= temp[0] ){
        //             if( tr > l){
        //                 index = j;
        //                 tr = temp[0];
        //             }
        //         }
        //     }
        //     res[i] = index;
        //  }
        //  return res;
        int[] a1 = new int[intervals.length];
        int[] a2 = new int[intervals.length];
        int index = 0;
        for(int i=0;i<intervals.length;i++){
            int[] temp = intervals[i];
            a1[i] = temp[0];   a2[i] = temp[1];
        }
        
        for(int i=0;i<intervals.length;i++){
            int ele = a2[i];
            int min = Integer.MAX_VALUE;
            int r = -1;
            for(int j=0;j<intervals.length;j++){
                if(a1[j] >= ele){
                    if( min > a1[j]){
                        min = a1[j];
                        r = j;
                    }
                }
            }
            res[index] = r;
            index++;
        }
        return res;
    }
}