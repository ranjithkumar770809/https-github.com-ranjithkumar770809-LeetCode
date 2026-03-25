class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        
        // Step:1 { ArrayList }
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0;i<numCourses;i++)
        {  
            adj.add(new ArrayList<>());
        }

        for(int[] p: prerequisites)
        {
            adj.get(p[1]).add(p[0]);
        }

        // Step:2 { Indegree }
        int[] ind = new int[numCourses];        
        for(int i=0;i<numCourses;i++)
        {
            for (int n : adj.get(i))
            {
                ind[n]++;
            }
        }

        // Step:3 { Queue }
        Queue<Integer> q = new LinkedList<>(); 
        for (int i = 0; i <numCourses; i++) 
        {
            if (ind[i] == 0) {
                q.add(i);
            }
        }

        // Step:4 { BFS }
        int[] op = new int[numCourses];
        int index = 0;
        
        while(!q.isEmpty()){                    
            int vertex = q.poll();
            op[index++] = vertex;
            for(int nei : adj.get(vertex))
            {
                ind[nei]--;
                if(ind[nei]==0){ 
                    q.add(nei); 
                }
            }
        }
        
        if (index == numCourses) return op;
        return new int[]{};
    }
}