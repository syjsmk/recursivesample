package com.github.syjsmk.recursivesample;

/**
 * Created by syjsmk on 2016-02-10.
 */
public class Main {

    public static void main(String[] args) {

        Fibonacci fibonacci = new Fibonacci();

        int n = 13;
        for (int i = 0; i < n; i++)
            System.out.println(i + ": " + fibonacci.calculation(i));
    }

}
