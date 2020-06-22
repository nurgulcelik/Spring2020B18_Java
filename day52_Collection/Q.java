package day52_Collection;

import java.util.PriorityQueue;
import java.util.Queue;

public class Q {
    public static void main(String[] args) {
        Queue <String> q= new PriorityQueue<>();
        q.add("ay");
        q.add("ey");
        q.add("iy");
        q.add("ze");
        System.out.println(q);
      String str= q.poll();
        System.out.println(str);
        System.out.println(q);

    }
}
