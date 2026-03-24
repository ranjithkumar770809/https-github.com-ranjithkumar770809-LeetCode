class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int area = 0;
        if (grid == null || grid.length == 0 || grid[0].length == 0) return 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    int c = backtrack(grid, i, j);
                    area = Math.max(c, area);
                }
            }
        }
        return area;
    }

    public int backtrack(int[][] grid ,int row,int col)
    {
        if(row<0 || row>=grid.length || col<0 || col>=grid[0].length || grid[row][col]==0){
            return 0;
        }
        grid[row][col] = 0;
        return 1+
            backtrack(grid,row+1,col)+
            backtrack(grid,row,col+1)+
            backtrack(grid,row-1,col)+
            backtrack(grid,row,col-1);
    }
}