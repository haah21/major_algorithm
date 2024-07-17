package Programmers.피로도_clean;
import java.util.*;
public class Main {
    private static int[][] dun;
    private static int ans = 0;

    public static void main(String[] args) {
        int[][]dungeons = {{80, 20}, {50, 40}, {30, 10}};
        int k = 80;
        dun = dungeons;

        dfs(k, 0, new boolean[dungeons.length]);

        System.out.println(ans);
    }

    // permutation
    private static void dfs(int remain, int cnt, boolean[] vis) {
        ans = Math.max(cnt, ans);

        for(int i=0; i<dun.length; ++i) {
            if(vis[i]) continue;
            if(remain < dun[i][0] || remain < dun[i][1]) continue;

            vis[i] = true;
            dfs(remain - dun[i][1], cnt+1, vis);
            vis[i] = false;
        }
    }
}