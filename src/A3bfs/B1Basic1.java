package A3bfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class B1Basic1 {
    static List<List<Integer>> adjList;
    static boolean[] visited;
    public static void main(String[] args) {
        int[][] arr = {{0,1},{0,2},{1,3},{2,3},{2,4}};
        //0번에서 갈 수 있는 곳? = for문으로 돌리기 = 안좋음 => list에 담아둠
        adjList = new ArrayList<>();
        visited = new boolean[5];
        for (int i=0; i<5; i++){ //node의 개수까지 반복
            adjList.add(new ArrayList<>());
        }
        for (int[] a : arr) {
            adjList.get(a[0]).add(a[1]);
        }

        //bfs로 나오는 각 노드 방문하고 출력
        Queue<Integer> queue = new LinkedList<>();
        queue.add(0);
        visited[0] = true;
        while (!queue.isEmpty()){
            visited[0]=true;
            int temp = queue.poll();
            //visited[temp] = true; //이건 안됨 -> 꺼내고나서 true 하면 안됨
            System.out.println(temp);
            for (int target : adjList.get(temp)){
                if (!visited[target]){
                    queue.add(target);
                    //target을 queue에 add하기 전에 true로 세팅
                    visited[target] = true;
                }
            }
        }


    }

}
