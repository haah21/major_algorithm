package A1sort;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class S1HeapSort구현 {
    public static void main(String[] args) {
        //최대힙 //최소힙 : 등호 방향만 바뀌면 됨
        int[] arr = {7,6,5,8,3,5,9,1,6};
        //최초 힙구성
        for (int i=arr.length/2-1; i>=0; i--) {
            heapify(arr, arr.length-1, i);
        }
        //루트노드와 최하위 노드를 change하면서 heapify
        for (int i = arr.length-1; i > 0 ; i--) {
            int temp = arr[i];
            arr[i] = arr[0];
            arr[0] = temp;
            heapify(arr,i-1,0);
        }
        System.out.println(Arrays.toString(arr));

        //PQ의 add는 hip구조를 가지고 있을까? add : 상향식 heapify
        // poll : 햐향식 heapify (복잡도 :logn -> 다 꺼내면 nlogn)
        //PQ = 힙 자료주조를 가지고 있는 queue
        int[] arr2 = {7,6,5,8,3,5,9,1,6};
        Queue<Integer> pq = new PriorityQueue<>();
        for (int a: arr2) {
            pq.add(a);
        }
        System.out.println(pq);
    }
    static void heapify(int[] arr, int arrlength, int node){
        //왼쪽노드 : node*2+1 오른쪽 노드 node*2+2
        //check 1 : 왼쪽, 오른쪽 노드가 배열의 길이보다 짧아야함
        //check 2  node, left, right 세개중 가장 작은 노드(node 제외)로 다시 heapify
        int left = node *2 +1;
        int right = node *2 +2;
        if (left > arrlength) return;
        if (right > arrlength){
            //node와 left 비교
            if (arr[node] > arr[left]){
                int temp = arr[node];
                arr[node]=arr[left];
                arr[left]=temp;
                heapify(arr, arrlength, left);
            }
        }else {
            //node, Left, right 모두 비교
            int index = 0;
            if (arr[node] > arr[left] || arr[node] > arr[right]){
                //제일 작은수?
                if (arr[left]>arr[right]){
                    index = right;
                }else {
                    index = left;
                }
                //index node 자리체인지, heapify(index)
                int temp = arr[node];
                arr[node] = arr[index];
                arr[index] = temp;
                heapify(arr, arrlength,index);
            }
        }

        //문제풀이 : 명예의 전당
    }
}
