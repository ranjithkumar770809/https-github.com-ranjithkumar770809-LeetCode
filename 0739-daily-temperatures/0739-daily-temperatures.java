class Solution {
    public int[] dailyTemperatures(int[] t) {
        Stack<Integer> s = new Stack<>();
        int[] ans = new int[t.length];
        for(int i=0;i<t.length;i++)
        {
            while(!s.isEmpty() && t[s.peek()] < t[i])
            {
                int index = s.pop();
                ans[index] = i-index;
            }
            s.push(i);
        }
        return ans;
    }
}