package A6투포인터;

public class T4슬라이딩윈도우 {
    public static void main(String[] args) {
        // 정수 배열 nums와 정수k가 주어졌을 때,
        // 깊이가 k인 연속된 부분 배열의 최대합을 구하기
        int[] nums={1,4,2,10,23,3,1,0,20};
        int k=4;
        int sum=0;
        // 강사님 코드
//        for(int i=0;i<k;i++){
//            sum+=nums[i];
//        }
//        int max = Integer.MIN_VALUE;
//        for(int i=k;i<nums.length;i++){
//            sum+=(nums[k]-nums[i-k]);
//            if(sum>max) max=sum;
//        }

        // 내코드
        int end=k;
        for(int i=0;i<k;i++) sum+=nums[i];
        while(end<nums.length){
            sum=Math.max(sum, sum-nums[end-k]+nums[end++]);
        }
        System.out.println(sum);
    }
}
