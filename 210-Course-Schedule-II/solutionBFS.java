public class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<List<Integer>> graph=new ArrayList<>();
        int[] degree=new int[numCourses];
        for(int i=0;i<numCourses;i++){
            graph.add(new ArrayList<Integer>());
        }
        
       for (int[] edge : prerequisites) {
           degree[edge[0]]++;
           graph.get(edge[1]).add(edge[0]);
       }
       
       int[] order=new int[numCourses];
       Queue<Integer> queue=new LinkedList<>();
       for(int j=0;j<numCourses;j++){
           if(degree[j]==0) queue.offer(j);
       }
       
       
       int visit=0;
       while(queue.size()!=0){
           int cur=queue.poll();
           order[visit]=cur;
           visit++;
           
           for(int adj:graph.get(cur)){
               degree[adj]--;
               if(degree[adj]==0){
                   queue.offer(adj);
               }
           }
       }
       return visit==numCourses?order:new int[0];
    }
}