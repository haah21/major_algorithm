package Baekjoon.no17086_y;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] maze = new int[n][m];
        Queue<int[]> queue = new LinkedList<>();

        //맵 그리기
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                maze[i][j] = Integer.parseInt(st.nextToken());
                if (maze[i][j] == 1) {
                    queue.offer(new int[]{i, j}); // 상어 위치를 먼저 추가함
                }
            }
        }

        System.out.println( bfs(maze, queue, n, m));

    }

    public static int bfs(int[][] maze, Queue<int[]> queue, int n, int m) {
        int[] dx = {-1, 1, 0, 0, -1, -1, 1, 1};
        int[] dy = {0, 0, -1, 1, -1, 1, -1, 1};

        int distance = 0;

        while (!queue.isEmpty()) {
            int[] temp = queue.poll(); //상어 위치부터 출발
            for (int i = 0; i < 8; i++) {
                int nx = temp[0] + dx[i];
                int ny = temp[1] + dy[i];

                if (nx >= 0 && ny >= 0 && nx < n && ny < m && maze[nx][ny] == 0) { //maze가 0인거만 방문
                    queue.offer(new int[]{nx, ny});
                    maze[nx][ny] = maze[temp[0]][temp[1]] + 1;  //방문한 좌표 나의 값+1
                    if (maze[nx][ny] > distance) {
                        distance = maze[nx][ny];
                    }
                }
            }
        }

        return distance - 1;
    }
}