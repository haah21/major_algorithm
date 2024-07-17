package Programmers.게임맵최단거리;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//bfs
public class Solution2 {
    static int[] distance;
    static List<List<Integer>> adjList;
    public static void main(String[] args) {
        int[][] map = {{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,1},{0,0,0,0,1}};
        Queue<int[]>queue = new LinkedList<>();
        queue.add(new int[]{0,0,0}); //시작 좌표 삽입 x,y,distance
        int[] dx = {-1,1,0,0};
        int[] dy = {-0,0,-1,1};
        map[0][0] = -1;
        int answer = -1;

        while (!queue.isEmpty()){
            int[] current = queue.poll(); //map의 x,y
            //타켓을 기준으로 visited check
            for (int i=0; i<4; i++){
                //앞으로 가야할 곳의 좌표
                int nx = current[0]+dx[i];
                int ny = current[1]+dy[i];
                //조건체크
                if(nx>=0 && nx< map.length && ny>=0 && ny< map[0].length){
                    if (map[nx][ny] == 1){
                        queue.add(new int[]{nx,ny,current[2]+1}); //새로운 x,y좌표, distance +1
                        map[nx][ny] = -1; //방문 했음을 표시 //원본을 변경해버림
                        if (nx==map.length-1 && ny == map[0].length-1){
                            answer = current[2]+1;
                            break;
                        }
                    }
                }
            }
        }
        System.out.println(answer);
    }
}
