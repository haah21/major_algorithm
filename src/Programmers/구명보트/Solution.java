package Programmers.구명보트;

import org.w3c.dom.ls.LSOutput;

import java.util.*;

//무거운 사람부터 태우기 2명씩 태워야하기 때문
public class Solution {
    public static void main(String[] args) {
        int[] people = {70,50,80,50};
        Arrays.sort(people);
        int limit=100;

        Arrays.sort(people);
        Deque<Integer> deque = new ArrayDeque<>();
        for (int p : people){
            deque.add(p);
        }
        int answer = 0;
        while (!deque.isEmpty()){
            int last = deque.pollLast();
            answer++;
            //deque에 하나만 들어있을때 = nulllpointexception 생김 => deque.size()>=1 추가
            if(deque.size()>=1 && last + deque.peekFirst() <= limit){
                deque.pollFirst();
            }
        }
        System.out.println(answer);
//        int index = 0;
//
//        for (int i = people.length-1; i>= index; i--) {
//            if (people[i] + people[index] <= limit){
//                index++;
//                answer++;
//            }
//            else answer++;
//        }
//
//        System.out.println(answer);

    }

}
