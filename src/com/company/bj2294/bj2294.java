package com.company.bj2294;

import java.util.Arrays;
import java.util.Scanner;

public class bj2294 {
    public static final int INF = 1000000;
    int[] dp= new int[10001];
    int[] val = new int[101];

    public void Solution() {
        int n,k;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        for(int i=0; i<n; i++)
        {
            val[i] = sc.nextInt();
        }
        Arrays.sort(val);


    }
}
