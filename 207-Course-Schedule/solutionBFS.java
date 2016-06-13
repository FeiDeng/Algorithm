public class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> graph = new ArrayList<>(numCourses);
        int[] degrees=new int[numCourses];
        
        Queue<Integer> queue=new LinkedList<>();
        
        
        for(int i=0;i<numCourses;i++){
            graph.add(new ArrayList<Integer>());
        }
        boolean[] visited=new boolean[numCourses];
        
        for(int i=0;i<prerequisites.length;i++){
            degrees[prerequisites[i][0]]++;
            graph.get(prerequisites[i][1]).add(prerequisites[i][0]);
        }
        
        int count=0;
        for(int i=0;i<numCourses;i++){
            if(degrees[i]==0){
                queue.offer(i);
                count++;
            }
        }
        
        while(queue.size()!=0){
            int cur=queue.poll();
            List<Integer> adjs=graph.get(cur);
            for(int i=0;i<adjs.size();i++){
                int adj=adjs.get(i);
                degrees[adj]--;
                if(degrees[adj]==0){
                    queue.offer(adj);
                    count++;
                }
            }
        }
        if(count==numCourses) return true;
        return false;
    }      
        
    
}