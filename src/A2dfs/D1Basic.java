package A2dfs;
import java.util.*;
public class D1Basic {
    static List<List<Integer>> adjList;
    static boolean[] visited;
    public static void main(String[] args) {
        //방문할 수 있는 정점이 여러개인 경우, 정점번호가 작은 것을 먼저 방문하는
        //dfs알고리즘 형식의 방문순서를 출력하라
        //01324
        int[][] arr = {{0,1},{0,2},{1,3},{2,3},{2,4}};
        //0번에서 갈 수 있는 곳? = for문으로 돌리기 = 안좋음 => list에 담아둠
        adjList = new ArrayList<>();
        for (int i=0; i<5; i++){ //node의 개수까지 반복
            adjList.add(new ArrayList<>());
        }
        for (int[] a : arr){
            adjList.get(a[0]).add(a[1]); //.get(a[0]) = 출발지 받아옴 -> .add(a[1]) = 도착지 받아옴
            //양방향인 경우 : 아래까지 같이 써줘야함
            //adjList.get(a[1]).add(a[0]);
            //result : [[1,2],[3],[3,4]]
        }
        // -> 이렇게 하면 adjList1, adjList2, adjList3 ...이렇게 많이 만들어야함
        //해결방법 : list내 list 담아버리기

        visited = new boolean[5];
        dfs(0); //0부터 시작해서 인접 노드 찾아감


    }

    //외우기
    static void dfs(int start){
        System.out.println(start);
        visited[start] = true;
        for (int target : adjList.get(start)){ //start : 0 -> target : 1,2
            //재귀 호출
            //dfs(target); //한번 방문한 노드 재방문 할 수 있음
            if (visited[target]==false){
                dfs(target);
            }
        }
    }
}
