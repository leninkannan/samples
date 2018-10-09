package com.company;

import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {

        method1();
        method2();
        method3();
        System.out.println(args[0]);
    }

    public static void method1()
    {
    System.out.println("Method1");
    }
    public  static void method2()
    {

        System.out.println("Method2");System.out.println("Method2");System.out.println("Method2");



    }
    public static void method3()
    {
        System.out.println("Method3");
        IntStream.rangeClosed(1, 10).mapToObj(i -> " I :" + i).forEach(System.out::println);
    }
}
