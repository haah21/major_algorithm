package A6투포인터;

import java.util.*;

public class T1Basic {
    public static void main(String[] args) {
//        // 아래 배열에서 target이 될 수 있는 두 수의 조합 값을 모두 찾아라
//        int[] nums = {7, 8, 9, 2, 4, 5, 1, 3, 6};
//        int target = 10;
//
//        // 2중 for문 구현 : 복잡도 Math.pow(n,2)
//        List<int[]> list = new ArrayList<>();
//        for(int i=0;i< nums.length;i++){
//            for(int j=i+1;j< nums.length;j++){
//                if(nums[i]+nums[j]==target){
//                    list.add(new int[]{nums[i], nums[j]});
//                }
//            }
//        }
//        for(int[] a:list) System.out.println(Arrays.toString(a));
//
//        // 투포인터 구현 : 복잡도 nlogn
//        // 이 코드 외워주기
//        Arrays.sort(nums);
//        // 1,2,3,4,5,6,7,8,9
//        int start = 0;
//        int end = nums.length-1;
//        list = new ArrayList<>();
////         종료 조건 : start와 end가 같거나 넘어서게 되면 종료, start와 end가 같아지면 한수가 두번 더해지는 꼴
//        while(start<end){
//            if(nums[start]+nums[end] == target){
//                list.add(new int[]{nums[start],nums[end]});
//                start++;
//                // 같은 거 있는 지 체크 후 있으면 다른쪽??
//            }
//            else if(nums[start]+nums[end] > target){
//                end --;
//            }
//            else{
//                start++;
//            }
//        }
//        for(int[] a:list) System.out.println(Arrays.toString(a));





        //구간의 합이 target이 되는 배열의 index의 처음과 끝을 리스트에 담기
        int[] nums = {7, 8, 9, 2, 4, 5, 1, 3, 6};
        int target = 10;
        int start = 0;
        int end  = 0;
        int sum = nums[0];
        List<int[]> list = new ArrayList<>();
        while (start<=end && end<nums.length){
            if(sum == target){
                list.add(new int[]{start,end});
                sum-=nums[start];
                start++;
            }else if(sum  < target && end<nums.length-1){
                end ++;
                sum += nums[end];
            }else {
                sum -= nums[start];
                start++;
            }
        }

        // 내 코드
//        int start = 0;
//        int end=0;
//        int sum;
//        List<int[]> list = new ArrayList<>();
//        // 구간의 합인데 한 요소가 10일 수 있으니까 start=end일 경우도 추가
//        while(start<=end && end<nums.length){
//            sum=0;
//            for(int i = start;i<=end;i++) sum+=nums[i];
//            if(sum==target) list.add(new int[]{start++,end});
//            else if(sum<target) end++;
//            else start++;
//        }
//        for(int[] a:list) System.out.println(Arrays.toString(a));
    }
}
