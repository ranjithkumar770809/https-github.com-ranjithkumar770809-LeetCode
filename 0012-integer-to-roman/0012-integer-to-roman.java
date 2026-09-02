class Solution {
    public String intToRoman(int num) {
        StringBuilder res = new StringBuilder();
        if( num == 0 ){
            return res.toString();
        }
        int[] val = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] roman = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I",};
        for( int i=0; i<val.length; i++ ){
            while( num >= val[i] ){
                res.append(roman[i]);
                num -= val[i];
            }
        }
        return res.toString();
    }
}