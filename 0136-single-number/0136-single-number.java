class Solution {
    public int singleNumber(int[] arr) {

        int a=0;

        for(int ele : arr){
        a=a^ele;
        }

        return a;
    }
}