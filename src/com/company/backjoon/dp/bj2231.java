package com.company.backjoon.dp;

import java.util.Scanner;

public class bj2231 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp=0;
        int sum = 0;
        int num = sc.nextInt();
        for(int i=0; i<=num; i++)
        {
            temp = i;
            sum = temp;
            do
            {
                sum = sum + temp % 10;
                temp = temp / 10;
            }while(temp>0);
            if(sum == num)
            {
                System.out.println(i);
                break;
            }else if(i==num){
                System.out.println("0");
            }
        }
    }
}
