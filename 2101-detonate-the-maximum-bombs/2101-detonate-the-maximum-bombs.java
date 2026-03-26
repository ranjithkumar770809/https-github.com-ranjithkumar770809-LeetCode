class Solution {
    public int maximumDetonation(int[][] bombs) {
        int n = bombs.length;
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < n; i++) {
            graph.get(i).add(i);
            long x1= bombs[i][0];
            long y1= bombs[i][1];
            long r1 = bombs[i][2];

            for (int j = 0 ; j < n; j++) {
                long x2 = bombs[j][0];
                long y2 = bombs[j][1];
                long dx = x1-x2;
                long yx = y1-y2;
                if (dx*dx + yx*yx <= r1*r1)
                {
                    graph.get(i).add(j);
                }
            }
        }

        int max = 0;
        for (int i = 0; i < n; i++) {
            boolean[] visited = new boolean[n];
            int count = dfs(graph,visited,i);
            max = Math.max(max,count);
        }
        return max;
    }

    int dfs(List<List<Integer>> graph, boolean[] visited, int i) {
        visited[i] = true;
        int count = 1;
        for (Integer v : graph.get(i)) {
            if (!visited[v]) {
                count += dfs(graph,visited,v);
            }
        }
        return count;
    }
}
