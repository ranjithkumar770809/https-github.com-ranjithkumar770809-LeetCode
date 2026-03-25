class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0;i<numCourses;i++){           // Step:1 { ArrayList }
            adj.add(new ArrayList<>());
        }
        for(int[] edge: prerequisites){
            adj.get(edge[1]).add(edge[0]);
        }
        int[] ind = new int[numCourses];         // Step:2 { Indegree }
        for(int i=0;i<numCourses;i++){
            for (int n : adj.get(i)){
                ind[n]++;
            }
        }
        Queue<Integer> q = new LinkedList<>();  // Step:3 { Queue }
        for (int i = 0; i <numCourses; i++) {
            if (ind[i] == 0) {
                q.add(i);
            }
        }
        ArrayList<Integer> res = new  ArrayList<>();
        int count = 0;
        while(!q.isEmpty()){                    // Step:4 { BFS }
            int vertex = q.poll();
            count++;
            res.add(vertex);
            for(int nei : adj.get(vertex)){
                ind[nei]--;
                if(ind[nei]==0){
                    q.add(nei);
                }
            }
        }
        if(count==numCourses){
            return true;
        }
        return false;
    }
}