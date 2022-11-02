package com.company.day6;

public class Fibonacci {
    public static void main(String[] args) {
        int n1=0,n2=1,i,n3=0;
        System.out.println(n1+" "+n2);
        for(i=2;i<=15;i++){
            n3 = n1 + n2;
            n1=n2;
            n2=n3;
        }
        System.out.println(n3);
        System.out.println("jump 5 times");
        System.out.println("This is Radhika Feature");

    }
}
