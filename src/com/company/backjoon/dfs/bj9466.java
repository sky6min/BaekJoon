package com.company.backjoon.dfs;

import java.util.Scanner;

public class bj9466 {
        int count = 0;
        int ary[];
        boolean visited[];
        boolean finished[];
   public void Solution() {
       int tc = 0, snum = 0;
       Scanner sc = new Scanner(System.in);
       tc = sc.nextInt();
       for(int j=0; j<tc; j++) {
           ary = new int [100001];
           visited = new boolean [100001];
           finished = new boolean[100001];
           count = 0;
           snum = sc.nextInt();
           for (int i = 1; i <= snum; i++) {
               ary[i] = sc.nextInt();
           }
           for (int i = 1; i <= snum; i++) {
               dfs(i);
           }
           System.out.println(snum - count);
       }
    }

    void dfs(int now)
    {
        if(visited[now] == true)
        {
            return;
        }
        visited[now] = true;
        int next = ary[now];

        if(visited[next] == false)
        {
            dfs(next);
        }else{
            if(finished[next] == false) {

                count++;
                for (int i = next; i != now; i = ary[i]) {
                    count++;
                }
            }
        }
        finished[now] = true;
    }

}
