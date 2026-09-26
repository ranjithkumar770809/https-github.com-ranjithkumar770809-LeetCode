class Solution {
    public String reversePrefix(String word, char ch) {
        int index = word.indexOf(ch);
        String res = "";
        for(int i=index;i>=0;i--){
            res += word.charAt(i);
        }
        for( int i=index+1;i<word.length();i++){
            res += word.charAt(i);
        }
        return res;
    }
}