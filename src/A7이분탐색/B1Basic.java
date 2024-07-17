package A7이분탐색;

import java.util.Arrays;

public class B1Basic {
    public static void main(String[] args) {
        // 이분탐색은 사전에 오름차순 정렬이 되어 있어야 가능한 알고리즘
        int[] arr = {1, 2, 5, 7, 9, 11, 13, 15, 17, 19};
        int target = 17;

        // 강사님 코드
        int index = -1;

        int start = 0;
        int end = arr.length-1;
        Arrays.sort(arr);

        while (start<=end){
            int mid = (start+end)/2;
            if (arr[mid]==target){
                index = mid;
                break;
            } else if (arr[mid] > target) {
                end = mid-1;
            }else {
                start = mid+1;
            }
        }


        // 내 코드
//        int start=0;
//        int end=arr.length-1;
//        int middle=0;
//        while(start<=end){
//            middle = (int)(start+end)/2;
//            if(arr[middle]<target) start=middle+1;
//            else if(arr[middle]>target) end=middle-1;
//            else if(arr[middle]==target) break;
//        }
//        System.out.println(middle);


    }
}
