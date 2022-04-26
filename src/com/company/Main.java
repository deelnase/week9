package com.company;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size");
        int s = sc.nextInt();
        ArrayList l = new ArrayList();
        System.out.println("tnter array elements");
        for(int i = 0; i<s; i++) {
            l.add(sc.next());
        }
        Comparable r = max(l);
        System.out.println("max element: " + r) ;
    }
    public static <E extends Comparable<E>> E max(ArrayList<E> l) {
        return Collections.max(l);
    }
}
