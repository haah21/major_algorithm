package A7이분탐색;

import java.util.Arrays;

public class B3입국심사 {
    public static void main(String[] args) {
        int n = 6;
        int[] times = {7,10};

        long start = 1;
        long end = times[times.length-1]*n;
        long answer = end;

        Arrays.sort(times);

        while(start <= end){
            int p = 0;
            long mid = (start + end) / 2;

            for(int t : times){
                p += mid/t;
            }
            if(p >= n){
                answer=mid;
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        System.out.println(answer);
    }
}