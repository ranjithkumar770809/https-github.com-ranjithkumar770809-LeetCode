class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if (image[sr][sc] == color) return image;
        int val = image[sr][sc];
        return backtrack(image,sr,sc,color,val);

    }

    private int[][] backtrack(int[][] image, int sr, int sc, int color,int val) {
        if (sr < 0 || sr >= image.length || sc < 0 || sc >= image[0].length || image[sr][sc]!=val){
            return image;
        }
            image[sr][sc] = color;
            backtrack(image, sr + 1, sc, color,val);
            backtrack(image, sr, sc + 1, color,val);
            backtrack(image, sr - 1, sc, color,val);
            backtrack(image, sr, sc - 1, color,val);

        return image;
    }
}