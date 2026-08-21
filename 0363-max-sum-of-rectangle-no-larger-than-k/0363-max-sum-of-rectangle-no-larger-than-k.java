// class Solution {
//     public int maxSumSubmatrix(int[][] matrix, int k) {
//         int res = 0;
//         int row =matrix.length;
//         int col = matrix[0].length;
//         System.out.println(row+" "+col);

//         if( row == 1 ){ 
//                 if( col == k ){
//                     int max = 0;
//                 for( int i=0;i<row ; i++)
//                 { 
//                     for(int j=0;j<k+i;j++){
//                     max+= matrix[0][j];
//                     }
//                 }
//                 return max;
//                 // res = Math.max(res,max);
//             }
//             else{
//                 // int max = 0;
//                 for(int i=0;i<row ; i++){
//                     res = Math.max(matrix[0][i],res);
//                 }
//             }
//              return res;
//         }
//         if( col == 1 ){
//             for( int i=0;i<col-1; i++){
//                 res+= matrix[i][0];
//             }
//             // res = Math.max(res,max);
//             return res;
//         }

//         // System.out.println("Exe"+row+" "+col);
//         for(int ii = 0;ii<row-1 ;ii++){
//             for(int jj=0;jj<col-1 ;jj++){
//                 System.out.println("Exe");
//                 int max = 0;
//                 for(int i=ii;i<k+ii;i++){
//                     for(int j=jj;j<k+jj;j++){
//                         max +=matrix[i][j];
//                     }
//                 }
//                 res = Math.max(res,max);
//             }
//         }
//         return res;
//     }
// }
import java.util.TreeSet;

class Solution {
    public int maxSumSubmatrix(int[][] matrix, int k) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int max = Integer.MIN_VALUE;

        for (int l = 0; l < cols; l++) {
            int[] rowSums = new int[rows];

            for (int r = l; r < cols; r++) {
                for (int i = 0; i < rows; i++) {
                    rowSums[i] += matrix[i][r];
                }

                TreeSet<Integer> sumSet = new TreeSet<>();
                sumSet.add(0);
                int currentSum = 0;

                for (int sum : rowSums) {
                    currentSum += sum;
                    Integer target = sumSet.ceiling(currentSum - k);
                    if (target != null) {
                        max = Math.max(max, currentSum - target);
                    }
                    sumSet.add(currentSum);
                }
            }
        }

        return max;
    }
}