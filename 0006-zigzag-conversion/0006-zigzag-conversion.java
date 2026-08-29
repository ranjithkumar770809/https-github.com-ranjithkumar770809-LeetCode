class Solution {
    public String convert(String s, int numRows) {
        if( numRows <=1 || s.length() < numRows ){
            return s;
        }
        char[][] arr = new char[numRows][s.length()];
        int i=0;
        int row = 0;int col=0;
        while(i < s.length() ){

            if( row == 0 ){
                while( row <numRows && i < s.length() ){
                    arr[row][col] = s.charAt(i++);
                    row++;
                } 
                row= row-2;
                col++;
            }
            if( row == numRows-2|| row>0){
                while( row > 0  && i < s.length()) {
                    arr[row][col] = s.charAt(i++);
                    row--; col++;
                } 
            }
        }
        System.out.println(arr);
        StringBuilder result = new StringBuilder();
        for (int r = 0; r < numRows; r++) {
            for (int c = 0; c <  s.length(); c++) {
                if (arr[r][c] != '\0') {
                    result.append(arr[r][c]);
                }
            }
        }
        return result.toString();
    }
}