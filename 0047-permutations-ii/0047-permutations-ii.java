class Solution {

    public void backtrack(List<List<Integer>> result, List<Integer> temp, int[] nums,boolean[] visited)
    {
        if(temp.size()==nums.length)
        {
            if(!result.contains(temp))
            {
                result.add(new ArrayList<>(temp));
                return;
            }
        }

        for (int i=0 ;i<nums.length;i++)
        {
            if(!visited[i])
            {
                temp.add(nums[i]);
                visited[i] = true;
                backtrack(result,temp,nums,visited);
                temp.remove(temp.size()-1); // Backtrack
                visited[i] = false;
            }
        }
    }

    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        boolean[] visited = new boolean[nums.length];
        backtrack(result,temp,nums,visited);
        return result;
    }

}