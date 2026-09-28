class Solution {
    public int maxDepth(String s) {
        int res = 0, temp = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                temp++;
            }
            if (s.charAt(i) == ')') {
                res = Math.max(res, temp);
                temp--;
            }

        }
        return res;
    }
}