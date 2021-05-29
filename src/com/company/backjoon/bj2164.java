package com.company.backjoon;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class bj2164 {

    public void Solution() {
        int n, res=1;
        Queue<Integer> queue = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(int i=1;i<=n ;i++)
        {
            queue.add(i);
        }
        int i=0;
        while(queue.size() != 0)
        {
            if(i%2 == 0)
            {
                res = queue.remove();

            }else{
                res = queue.remove();
                queue.add(res);

            }
            i++;
        }
        System.out.println(res);
    }
}
