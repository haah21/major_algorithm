package A6투포인터;
import java.util.*;
public class T3숫자의표현 {
    public static void main(String[] args) {
        int n=15;
        int start=1;
        int end=1;
        int sum;
        List<int[]> list = new ArrayList<>();
        while(start<=end && end<=n){
            sum=(end*(end+1))/2 - ((start-1)*(start))/2;

            if(sum==n) list.add(new int[]{start++,end});
            else if(sum<n) end++;
            else if(sum>n) start++;

        }
        System.out.println(list.size());

    }
}
