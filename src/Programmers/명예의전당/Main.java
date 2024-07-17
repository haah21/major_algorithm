package Programmers.명예의전당;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int k = 3;
        int[] score = {10, 100, 20, 150, 1, 100, 200};
        int[] answer = new int[score.length];

        Queue<Integer> pQ = new PriorityQueue<>();
        for (int i = 0; i < score.length; i++) {
            pQ.add(score[i]);
            if (pQ.size() >k){
                pQ.poll();
            }
            answer[i] = pQ.peek();
        }
        System.out.println(Arrays.toString(answer));

    }
}
