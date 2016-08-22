public class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0;i < numCourses; i++){
            graph.add(new ArrayList<Integer>());
        }
        int[] visited = new int[numCourses];
        for(int i = 0; i < prerequisites.length; i++){
            graph.get(prerequisites[i][1]).add(prerequisites[i][0]);
        }
        
        for(int i = 0; i < numCourses; i++){
            if(!dfs(i, graph,visited)){
                return false;
            }
        }
        return true;
    }
    
    public boolean dfs(int i, List<List<Integer>> graph, int[] visited){
        if(visited[i] == 2){
            return true;
        }
        visited[i] = 1;
        List<Integer> adjs = graph.get(i);
        for(int adj:adjs){
            if(visited[adj] == 1) return false;
            if(visited[adj] == 0){
                if(!dfs(adj,graph,visited)){
                    return false;
                }
            }
        }
        visited[i] = 2;
        return true;
    }
}