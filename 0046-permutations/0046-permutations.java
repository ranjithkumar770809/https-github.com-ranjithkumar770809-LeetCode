class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        backtrack(result,temp,nums);
        return result;
    }

    public void backtrack(List<List<Integer>> result, List<Integer> temp, int[] num)
    {
        if(temp.size()==num.length)
        {
            result.add(new ArrayList<>(temp));
            return;
        }
        for (int i=0;i<num.length;i++)
        {
            if (temp.contains(num[i]))
            {
                continue;
            }
            else {
                temp.add(num[i]);
                backtrack(result,temp,num);
                temp.remove(temp.size()-1);
            }
        }
    }
}