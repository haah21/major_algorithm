package Programmers.야근지수;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int n = 4;
        int[] works = {4,3,3};
        long answer = 0;

        Queue<Integer> pQ = new PriorityQueue<>(Comparator.reverseOrder());
        for (int i : works){
            pQ.add(i);
        }

        while(n>0) {
            int value = pQ.poll();
            pQ.offer(value > 0 ? value - 1 : value);

            n--;
        }

        for(int value: pQ) {
            if(value == 0) {
                continue;
            }
            answer += Math.pow(value,2);
        }

        System.out.println(answer);
    }
}

/*
import java.util.*;

class Solution {



        // 우선 순위 큐? 제일 큰 값을 줄여나가면 된다.
        // 최댓값을 추출해서 1을 제거해준다.
        w
    }
}
 */