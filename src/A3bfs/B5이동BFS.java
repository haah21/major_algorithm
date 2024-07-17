package A3bfs;
import java.util.LinkedList;

import java.util.Queue;

public class B5이동BFS {
    public static void main(String[] args) {
        int start = 5;
        int target = 17;

        System.out.println(bfs(start,target));
    }

    private static int bfs(int start,int target) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[] {start,0});

        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            if (cur[0] == target) {
                return cur[1];
            }
            queue.add(new int[] {cur[0]-1, cur[1]+1});
            queue.add(new int[] {cur[0]+1, cur[1]+1});
            queue.add(new int[] {cur[0]*2, cur[1]+1});
        }
        return 0;
    }
}
