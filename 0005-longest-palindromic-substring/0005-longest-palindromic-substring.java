class Solution {
    StringBuilder sb = new StringBuilder();
    public boolean check(String s){
        for(int i=0,j=s.length()-1; i<s.length() && j>i ; i++,j--){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
        }
        if( sb.length() < s.length() ){
            sb.setLength(0); sb.append(s);
        }
        return true;
    }
    
    public String longestPalindrome(String s) {

        if( s.length() <= 1){
            return s;
        }
        if( s.length() == 2 ){
            if( s.charAt(0)== s.charAt(1) ){ return s;}
            else{
                sb.append(s.charAt(0));
                return sb.toString();
            }
        }
        for(int i=0; i<s.length();i++){
            String t = "";  int j=i+1;
            char ch= s.charAt(i); t += ch;
             boolean bool = false;
            while(j <= s.length()-1 & j <s.length() )
            {
                t +=s.charAt(j);
                if( ch == s.charAt(j) ){
                    bool = check(t); 
                    if(bool == true && j==s.length()-1)
                    {
                        break;
                    }
                }
                j++;
            }
            if(bool == true && j==s.length()-1)
            {
                 break;
            }
            // check(t); j=s.length()-1;
        }
        if( sb.length() == 0 ){
            sb.append(s.charAt(0));
        }
        return sb.toString();
    }
}