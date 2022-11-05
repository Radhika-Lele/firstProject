package com.company.day6;
import java.util.*;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int  fact, n, i = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        fact = sc.nextInt();

        for (n = 1; n <= fact; n++) {
            i = n * i;
        }

        System.out.println("Factorial of number : " + i);
        System.out.println("vivek changes1");

    }
}
