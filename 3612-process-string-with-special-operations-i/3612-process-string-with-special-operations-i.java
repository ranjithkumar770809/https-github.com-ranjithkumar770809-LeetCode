class Solution {
    StringBuilder sb = new StringBuilder();
    public String processStr(String s) {
        StringBuilder sb = new StringBuilder();
        for(char c : s.toCharArray()){
            if(c == '#'){
                sb = sb.append(sb);  
            }
            else if( c == '%'){
                sb = sb.reverse();
            }
            else if( c== '*'){
                if(sb.length() >0){
                    sb= sb.deleteCharAt(sb.length()-1);
                }
            }
            else{
                sb = sb.append(c);
            }
        }
        return sb.toString();
    }
}