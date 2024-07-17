package A2dfs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class D3Basic3 {
    static List<List<Integer>> adjList;
    public static void main(String[] args) {
        //0번부터 시작하지 않음 노드 : 1-10
        //방문경로 모두 list에 담기 : 1->2->4->8.., 1->2->5..
        //=> 배열 or 리스트 size +1
        //단방향
        int[][] arr = {{1,2},{1,3},{2,4},{2,5},{3,6},{3,7},{4,8},{4,9},{5,10}};

        adjList = new ArrayList<>();

        for (int i = 0; i < 11; i++) {
            adjList.add(new ArrayList<>());
        }

        for (int[] a : arr){
            adjList.get(a[0]).add(a[1]);
        }


        //방문경로 저장할 리스트
        List<List<Integer>> answer = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        //dfs 함수에서 temp에 1안담기므로 여기서 넣어줌
        temp.add(1);
        dfs(answer, temp,1);
        System.out.println(answer);

    }
    static void dfs(List<List<Integer>> answer, List<Integer> temp, int start) {
        if (adjList.get(start).isEmpty()){
            answer.add(new ArrayList<>(temp));
            return;
        }
        for (int target : adjList.get(start)){
            temp.add(target);
            //temp에 너무 많은 값 쌓이게 됨
            dfs(answer,temp,target);
            temp.remove(temp.size()-1);
        }

    }
}
