package com.company.backjoon.dp;

import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;


public class bj2294 {

    public void Solution() {
        int n,k;
        int[] dp= new int[10001];
        int[] coin = new int[101];
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        Arrays.fill(dp, 100001);
        Arrays.fill(coin, 100001);
        for(int i=0; i<n; i++)
        {
            coin[i] = sc.nextInt();
        }
        Arrays.sort(coin);
        dp[0] = 0;
        for(int i = 0; i<n; i++)
        {
            for(int j=coin[i];j<=k;j++)
            {
                dp[j] = Math.min(dp[j],dp[j-coin[i]] + 1);
            }
        }
        System.out.println(dp[k] == 100001 ? -1 : dp[k]); sc.close();

    }
}
