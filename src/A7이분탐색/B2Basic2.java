package A7이분탐색;

import java.util.Arrays;

public class B2Basic2 {
    public static void main(String[] args) {
        // target 찾되,
        // target이 없으면 target보다 큰 값중에 첫번째 값의 index를 찾아라
        int[] arr = {1,3,4,7,8,9};
        int target=6;
        int index=-1;
        int start =0;
        int end = arr.length-1;
        while(start<=end){
            int mid = (start+end)/2;

            if(target<=arr[mid]){
                index=mid;
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        System.out.println(index);

        // 가까운 값 찾기
        int[] arr2 = {10,20,30};
        System.out.println(Arrays.binarySearch(arr2,35));
        System.out.println(Arrays.binarySearch(arr2,25));
        System.out.println(Arrays.binarySearch(arr2,9));

        // binarySearch 메서드로 하기
        int index2 = Arrays.binarySearch(arr, target);
        if(index2<0){
            // target이 없으면 target보다 큰 값중에 첫번째 값의 index를 찾아라
            System.out.println(Math.abs(index2)-1);
            // target이 없으면 target보다 작은 값중에 마지막 값의 index를 찾아라
            System.out.println(Math.abs(index2)-2);
        }
        else{
            System.out.println(index2);
        }
    }
}
