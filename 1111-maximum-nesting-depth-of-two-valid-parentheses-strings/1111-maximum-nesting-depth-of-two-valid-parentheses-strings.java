class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        int[] res = new int[seq.length()];
        int depth = 0;
        for(int i=0;i<seq.length();i++){
            char c = seq.charAt(i);
            if( c == '('){
                depth++;
                res[i] = depth%2;
            }
            else{
                res[i] = depth%2;
                depth--;
            }
            if(res[i]==0){  res[i]=1; }
            else{   res[i] = 0; }
        }
        return res;
    }
}