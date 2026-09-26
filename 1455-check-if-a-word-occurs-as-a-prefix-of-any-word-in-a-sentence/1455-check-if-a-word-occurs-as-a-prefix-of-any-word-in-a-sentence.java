class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        int res = -1;
        String word[] = sentence.split(" ");
        for(int i=0; i<word.length;i++){
            if( word[i].startsWith(searchWord)){
                res = i+1;
                break;
            }
        }
        return res;
    }
}