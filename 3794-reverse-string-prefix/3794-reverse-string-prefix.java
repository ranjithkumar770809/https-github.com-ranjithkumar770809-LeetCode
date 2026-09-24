class Solution {
    public String reversePrefix(String s, int k) {
        
        if( k == 1 || s == "" ){ return s; }
        StringBuilder str = new StringBuilder(s);
        for( int i=0;i<1;i++){
            StringBuilder temp = new StringBuilder(str.substring(i,k));
            str.delete(i,k);
            str = str.insert(0,temp.reverse());
        }
        return str.toString();
    }
}