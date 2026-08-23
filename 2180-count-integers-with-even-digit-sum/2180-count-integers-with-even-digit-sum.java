class Solution {
    public int countEven(int num) {
        int res = 0;
        int n = num;
        if(num <=1) return 0;
        if( num <=3)return 1;
        while(num > 0){
            int temp = num%10;
            res+=temp;
            num/=10;
        }
        if( (res & 1) == 0 ){
            return n/2;
        }
        return (n-1)/2;
    }
}