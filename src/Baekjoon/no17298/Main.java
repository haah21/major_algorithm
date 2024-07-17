package Baekjoon.no17298;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N]; //원본배열
        int[] result = new int[N]; //결과값
        int[] arr2 = new int[N]; //인덱스로 스택처럼 사용
        int top = -1; //스택처럼 구현, 최상위 인덱스

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            result[i] = -1; //결과값 저장하는 배열 -1로 초기화
        }

        for (int i = 0; i < N; i++) {
            while (top >= 0 && arr[arr2[top]] < arr[i]) { //현재 원소 > 최상단 원소
                result[arr2[top--]] = arr[i];
            }
            arr2[++top] = i;    //현재 인덱스에 추가
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(result[i]).append(" ");
        }

        System.out.println(sb.toString());
    }
}
