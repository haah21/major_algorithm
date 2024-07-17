package Programmers.타겟넘버;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    static int answer=0;

    public static void main(String[] args)  {
        int[] numbers={1, 1, 1, 1, 1};
        int target=3;
        dfs(0,numbers,target,0);
        System.out.println(answer);

    }
    static void dfs(int length, int[] numbers, int target, int total) {
        if(length==numbers.length && total == target ) {
            answer++;
        }
        dfs(length+1, numbers, target,total+numbers[length]);
        dfs(length+1, numbers, target,total-numbers[length]);

    }

}
