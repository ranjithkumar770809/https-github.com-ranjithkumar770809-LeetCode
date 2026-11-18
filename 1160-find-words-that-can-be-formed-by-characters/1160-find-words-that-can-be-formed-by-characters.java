class Solution {
    public int check(String s,String chars){
        int count = 0;
        for( int i=0;i<s.length();i++){
            if(!chars.contains(s.charAt(i)+"")){
                break;
            }
            chars = chars.replaceFirst(s.charAt(i)+"","");
            
            count++;
        }
        if( count == s.length() ) return count;
        return 0;
    }
    public int countCharacters(String[] words, String chars) {
        int res = 0;
        for(int i=0;i<words.length;i++)
        {
            String s = new String(words[i]);
            res += check(s,chars);
        }
        return res;
    }
}