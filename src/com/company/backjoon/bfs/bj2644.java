package com.company.backjoon.bfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class bj2644 {

    int ary[][];
    int obj1, obj2;
    int pnum;
    public void Solution() {
        Scanner sc = new Scanner(System.in);
        int x, y;
        int rnum;
        pnum = sc.nextInt();
        obj1 = sc.nextInt();
        obj2 = sc.nextInt();
        rnum = sc.nextInt();
        ary = new int[pnum+1][pnum+1];

        for(int i=0; i<rnum; i++)
        {
            x= sc.nextInt();
            y= sc.nextInt();
            ary[x][y] = 1;
            ary[y][x] = 1;
        }
        int result = bfs();
        System.out.println(result);
    }

    public int bfs()
    {
        Queue<Person> queue = new LinkedList<>();
        queue.offer(new Person(obj1, 0));
        while(!queue.isEmpty()) {
            Person person = queue.poll();
            if(person.x == obj2)
            {
                return person.cnt;
            }

            for (int i = 1; i <= pnum; i++) {
                if (ary[person.x][i] == 1) {
                    queue.offer(new Person(i,person.cnt+1));
                    ary[person.x][i] = 0;
                    ary[i][person.x] = 0;
                }
            }

        }

        return -1;
    }

    private static class Person {
        int x;
        int cnt;
        public Person(int x, int cnt) {
            this.x = x;
            this.cnt = cnt;
        }
    }
}

