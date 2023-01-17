package org.example;

public class Main {
    public static void main(String[] args) {
       String x = " water";
       String y = " juice";
       String mix;
       mix = x ;
       x = y ;
       y = mix;
        System.out.println("x" + x);
        System.out.println("y" + y);

    }
}