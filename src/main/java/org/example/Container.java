package org.example;

import java.util.Scanner;

public class Container {

    private static Scanner sc = new Scanner(System.in);

    private static void init()
    {
        sc = new Scanner(System.in);
    }

    public static Scanner getSc()
    {
        return sc;
    }

    private static void close()
    {
        sc.close();
    }

}
