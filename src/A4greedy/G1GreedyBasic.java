package A4greedy;

public class G1GreedyBasic {
    static int min = Integer.MAX_VALUE;
    public static void main(String[] args) {
        //1,5,10,20 숫잘ㄹ 조합하여 99를 만들 수 있는 조합중 가장짧으 조합의 길이
        int[] arr = {1,5,10,20};
        //dfs? bfs?
        //dfs(arr,0,0);

        //greedy: 현재로써 최적의 해를 선택했을 때, 전체의 최적의 해를 보장

    }
    //시간 너무 오래걸림
//    static void dfs(int[] arr, int temp, int count){
//        if (temp==99){
//            if (min>count)
//                min = count;
//            return;
//        }
//        for (int i = 0; i <arr.length; i++) {
//            dfs(arr, temp+arr[i],count+1);
//        }
//    }
}
