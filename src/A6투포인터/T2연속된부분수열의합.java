package A6투포인터;

import java.util.*;

public class T2연속된부분수열의합 {
    public static void main(String[] args) {
        int[] sequence = {1, 2, 3, 4, 5};
        int k = 7;
        int start = 0;
        int end = 0;
        int sum = sequence[0];
        List<int[]> list = new ArrayList<>();
        while ( start <= end && end < sequence.length) {
            if( sum == k ){
                list.add(new int[]{start, end});
                sum -= sequence[start];
                start++;
            }else if( sum < k && end < sequence.length - 1){
                end++;
                sum += sequence[end];
            } else {
                sum -= sequence[start];
                start++;
            }
        }

        list.sort(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return (o1[1] - o2[0]) - (o2[1] - o1[0]);
            }
        });

        int[] answer = list.get(0);
        System.out.println(Arrays.toString(answer));
    }
}
