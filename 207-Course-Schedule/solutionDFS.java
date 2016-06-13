public class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> graph = new ArrayList<>(numCourses);
        for(int i=0;i<numCourses;i++){
            graph.add(new ArrayList<Integer>());
        }
        boolean[] visited=new boolean[numCourses];
        
        for(int i=0;i<prerequisites.length;i++){
            graph.get(prerequisites[i][1]).add(prerequisites[i][0]);
        }
        
        for(int i=0;i<numCourses;i++){
            if(!dfs(graph,visited,i)) return false;
        }
        return true;
    }      
        public boolean dfs(List<List<Integer>> graph,boolean[] visited,int index){
           if(visited[index]==true){
               return false;
           }
           
            visited[index]=true;
            
            List<Integer> courses=graph.get(index);
            for(int i=0;i<courses.size();i++){
                int course=courses.get(i).intValue();
                if(!dfs(graph,visited,course)) return false;
            }
            visited[index]=false;
            return true;
        }
    
}