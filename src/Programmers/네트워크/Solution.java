package Programmers.네트워크;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int n = 3; //컴퓨터 개수
        int[][] computers = {{1, 1, 0}, {1, 1, 1}, {0, 1, 1}}; //연결된 간선
        System.out.println(solution.solution(n, computers));
    }


    public int solution(int n, int[][] computers) {
        boolean[] visited = new boolean[n];
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                dfs(computers, visited, i);
                cnt++;
            }
        }
        return cnt; //네트워크수 반환
    }

    public void dfs(int[][] computers, boolean[] visited, int start) {
        visited[start] = true;
        for (int i = 0; i < computers.length; i++) {
            if (computers[start][i] == 1 && !visited[i]) {
                dfs(computers, visited, i);
            }
        }
    }
}
