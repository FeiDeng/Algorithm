public class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        if (matrix == null || matrix.length == 0){
            return -1;
        }
        if (matrix.length * matrix[0].length < k){
            return -1;
        }
        
        PriorityQueue<Number> heap = new PriorityQueue<Number>(k, new NumComparator());
        boolean[][] visited = new boolean[matrix.length][matrix[0].length];
        heap.offer(new Number(0, 0, matrix[0][0]));
        visited[0][0] = true;
        
        for (int i = 0; i < k - 1; i++){
            Number cur = heap.poll();
            int curX = cur.x;
            int curY = cur.y;
            int curXd = curX + 1;
            int curYr = curY + 1;
            if (curXd < matrix.length && !visited[curXd][curY]){
                visited[curXd][curY] = true;
                heap.add(new Number(curXd, curY, matrix[curXd][curY]));
            }
            if (curYr < matrix[0].length && !visited[curX][curYr]){
                visited[curX][curYr] = true;
                heap.add(new Number(curX, curYr, matrix[curX][curYr]));
            }
        }
        return heap.peek().val;
    }
}

class Number{
    public int x, y, val;
    public Number(int x, int y, int val){
        this.x = x;
        this.y = y;
        this.val = val;
    }
}

class NumComparator implements Comparator<Number>{
    public int compare(Number a, Number b){
        return a.val - b.val;
    }
}