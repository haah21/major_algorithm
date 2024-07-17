package Programmers.등굣길;

public class Solution {
    public static void main(String[] args) {
        int m = 4;
        int n = 3;
        int mod = 1000000007;
        int[][] puddles = {{2,2}};

        //1,1 부터 시작하므로
        int[][]street = new int[m+1][n+1];

        //물 웅덩이인 곳 -1로 표시
        for (int i = 0; i < puddles.length; i++) {
            street[puddles[i][1]][puddles[i][0]] = -1;
        }

        //시작점은 방문
        street[1][1] = 1;
        //1부터 방문하므로
        for (int i = 1; i < n+1; i++) {
            for (int j = 1; j < m+1; j++) {
                //물웅덩이면 넘어감
                if (street[i][j] == -1) continue;
                // 1번이상 지나간 길
                if (street[i-1][j]>0) street[i][j] += street[i-1][j] %mod;
                if (street[i][j-1]>0) street[i][j] += street[i][j-1] %mod;
            }
        }
        System.out.println(street[n][m] % mod);

    }
}
