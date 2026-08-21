class Solution {
    public boolean backspaceCompare(String s, String t) {
        StringBuilder s1 = new StringBuilder();
        StringBuilder t1 = new StringBuilder();
        for(char i: s.toCharArray()){
            if( i == '#'){
                if(s1.length()>0)
                  s1.deleteCharAt(s1.length()-1);
            }
            else{
                s1.append(i);
            }
        }
        for(char i: t.toCharArray()){
            if( i == '#'){
                if(t1.length()>0)
                    t1.deleteCharAt(t1.length()-1);
            }
            else{
                t1.append(i);
            }
        }
        return s1.toString().equals(t1.toString());
    }
}