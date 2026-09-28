class Solution {
    public String[] findWords(String[] words) {
        List<String> res = new ArrayList<>();
        String first_row="qwertyuiop",  second_row="asdfghjkl", third_row="zxcvbnm";

        for( String i:words){
            String s= i.toLowerCase();
            boolean isValid = true;
            if( first_row.contains(s.charAt(0)+"")){
                for( char c:s.toCharArray()){
                    if( !first_row.contains(c+"")) { isValid=false;  break; }
                }
            }
            else if( second_row.contains(s.charAt(0)+"")){
                for( char c:s.toCharArray()){
                    if( !second_row.contains(c+"")){ isValid=false;  break; }
                }
            }
            else{
                for( char c:s.toCharArray()){
                    if( !third_row.contains(c+"")){ isValid=false; break; }
                }
            }
            if( isValid ){
                res.add(i);
            }
        }
        return res.toArray(new String[0]);
    }
}