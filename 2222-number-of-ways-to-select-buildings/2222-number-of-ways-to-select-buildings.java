class Solution {
    public long numberOfWays(String s) {
        long res = 0;
        long left0 =0, right0=0,  left1=0, right1=0;

        for( char i: s.toCharArray()){
            if( i == '0'){   right0++;  }
            else{   right1++;  }
        }
// System.out.println(right0+" "+right1);
        for( char i:s.toCharArray()){
            int count=0;
            if( i == '0'){
                res += (left1*right1);  
                left0++;right0--;
            }
            else{
                res += (left0 * right0);
                left1++;right1--;
            }
            // if( i == '1'){
            //     System.out.println(left1+" "+right1);
            // }
        }
        return res;
    }
}