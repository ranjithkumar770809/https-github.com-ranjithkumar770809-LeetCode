class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> res = new ArrayList<>();
        int max =0;
        for(int i: candies){ max = Math.max(i,max);}
        for(int i=0;i<candies.length;i++){
            if(extraCandies+candies[i] >= max){
                res.add(true);
            }
            else{
                res.add(false);
            }
        }
        return res;
    }
}