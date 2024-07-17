package Programmers.멀리뛰기;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        //기억하기 방식
        int n=4;
        //f(n) = f(n-1)+f(n-2)
        int[] arr = new int[n+1];
        arr[1]=1;   //1칸씩 올라가기
        arr[2]=2;   //2칸씩 올라가기
        for (int i = 3; i <=n; i++) {
            arr[i] = arr[i-1]+arr[i-2];
        }
        //중복 연산이 발생하지 않음
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[n]);
    }
}

/*
*
* public static long solution(int n) {
        long[] answer = new long[2001];
        answer[1] = 1;
        answer[2] = 2;

        for (int i = 3; i < 2001; i++) {
            answer[i] = (answer[i - 1] + answer[i - 2]) % 1234567;
        }

        return answer[n];
    }
    *
    * */