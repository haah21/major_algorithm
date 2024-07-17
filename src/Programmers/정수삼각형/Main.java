package Programmers.정수삼각형;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] triangle = {{7},{3, 8},{8, 1, 0},{2, 7, 4, 4},{4, 5, 2, 6, 5}};
        int[][] answerArr = new int[triangle.length][];//가변배열

        //answerArr[0] = triangle[0];
        answerArr[0] = Arrays.copyOf(triangle[0],triangle[0].length);

        for (int i = 0; i < triangle.length-1; i++) {
            answerArr[i+1] = new int[triangle[i+1].length];
            for (int j = 0; j < triangle[i].length; j++) {
                if((answerArr[i][j] + triangle[i+1][j])>answerArr[i+1][j]){
                    answerArr[i+1][j] = answerArr[i][j] + triangle[i+1][j];
                }
                if ((answerArr[i][j] + triangle[i+1][j+1]) > answerArr[i+1][j+1]){
                    answerArr[i+1][j+1] = answerArr[i][j] + triangle[i+1][j+1];
                }
            }
        }
        System.out.println(Arrays.deepToString(answerArr));
    }

}
class Solution {
    public int solution(int[][] triangle) {
        int[][] dp = new int[triangle.length][triangle.length];
        dp[0][0] = triangle[0][0];

        for (int i = 1; i < triangle.length; i++) {
            // 맨 왼쪽
            dp[i][0] = dp[i - 1][0] + triangle[i][0];

            // 중간
            for (int j = 1; j <= i; j++) {
                dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - 1]) + triangle[i][j];
            }

            // 맨 오른쪽
            dp[i][i] = dp[i - 1][i - 1] + triangle[i][i];
        }

        int answer = 0;

        for (int i = 0; i < triangle.length; i++) {
            answer = Math.max(answer, dp[triangle.length - 1][i]);
        }

        return answer;
    }
}