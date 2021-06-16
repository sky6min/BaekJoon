package com.company.backjoon.greedy;

import java.util.Scanner;

public class bj4796 {

    public static void main(String[] args) {
        int l,p,v;
        int res;
        Scanner sc = new Scanner(System.in);
        l = sc.nextInt();
        p = sc.nextInt();
        v = sc.nextInt();
        for(int i =1; l != 0 || p != 0 || v != 0; i++)
        {
            res = 0;
            while(v / p > 0)
            {
                v = v - p;
                res = res + l;
            }
            res = res + v;
            System.out.println("Case "+i+": "+res);
            l = sc.nextInt();
            p = sc.nextInt();
            v = sc.nextInt();
        }
    }
}
