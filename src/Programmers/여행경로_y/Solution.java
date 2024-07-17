package Programmers.여행경로_y;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        String[][] tickets = {{"ICN", "SFO"}, {"ICN", "ATL"}, {"SFO", "ATL"}, {"ATL", "ICN"},{"ATL","SFO"}};
        System.out.println(Arrays.toString(solution(tickets)));
    }
    public static String[] solution(String[][] tickets) {
        Map<String, PriorityQueue<String>> plane = new HashMap<>(); //key 출발지 value 도착지
        List<String> result = new ArrayList<>(); //최적경로
        Stack<String> s = new Stack<>();

        for (String[] t : tickets) {
            plane.computeIfAbsent(t[0], a -> new PriorityQueue<>()).add(t[1]);
        }

        s.push("ICN");
        //dfs 반복문
        //재귀함수 쓰지 않는 방법
        while (!s.isEmpty()) {
            String top = s.peek();
            if (plane.containsKey(top) && !plane.get(top).isEmpty()) {
                //현재 공항에서 갈 수 있는 다른 공항이 있는 경우
                //다른 공항 스택 안에 넣음
                s.push(plane.get(top).poll());
            } else {
                //현재 공항에서 갈 수 있는 다른 공항이 없는 경우 => 스택안에 저장된 경로 출력
                result.add(0, s.pop());
            }
        }
        return result.toArray(new String[0]);
    }
}
