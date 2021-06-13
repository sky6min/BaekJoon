package com.company.backjoon.dp;

import java.util.Scanner;

import static java.lang.Math.max;


public class bj1912 {

    public static void main(String[] args) {
        int num, max=0, temp;
        int ary[], dp[];
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        ary = new int[num];
        dp = new int[num];
        for(int i=0; i<num; i++)
        {
            ary[i] = sc.nextInt();
        }

        dp[0] = ary[0];
        max = ary[0];
        for(int i=1; i<num; i++)
        {
            dp[i] = max(ary[i], dp[i-1] + ary[i]);
            max = max(max, dp[i]);
        }
        System.out.print(max);
    }
}
