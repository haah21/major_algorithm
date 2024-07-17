package A3bfs;

import java.util.*;

public class B3Basic3 {
    static List<List<Integer>> adjList;
    static boolean[] visited;
    static int[] distance;

    public static void main(String[] args) {
        int[][] arr = {{0, 1}, {0, 2}, {1, 3}, {2, 3}, {2, 4}};
        //0번에서 갈 수 있는 곳? = for문으로 돌리기 = 안좋음 => list에 담아둠
        adjList = new ArrayList<>();
        visited = new boolean[5];
        distance = new int[5];
        for (int i = 0; i < 5; i++) { //node의 개수까지 반복
            adjList.add(new ArrayList<>());
        }
        for (int[] a : arr) {
            adjList.get(a[0]).add(a[1]);
        }

        int start = 0;
        int end = 3;
        int minDistance = bfs(start, end);
        System.out.println(start + "번 노드와 " + end+"번  노드사이의 거리 : "+ minDistance);

    }

    static int bfs(int start, int end) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        visited[0] = true;
        while (!queue.isEmpty()) {
            int temp = queue.poll(); // 꺼내기
            for (int target : adjList.get(temp)) {
                // target을 queue에 add 하기 전에 true로 세팅
                if (!visited[target]) {
                    queue.add(target);
                    distance[target] = distance[temp] + 1;
                    visited[target] = true;
                    if (target == end) { // target이 end까지 오면 그만 해라
                        return distance[target];
                    }
                }
            }
        }
        return -1;
    }
}