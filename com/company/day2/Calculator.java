package com.company.day2;

public class Calculator {

    public static void main(String[] args) {
        int Addition = add(10,10);
        int Subtraction = subtract(5,10);
        int Multiplication = multiply(10,10);
        float Division = divide(45,2);

        System.out.println(Addition);
        System.out.println(Subtraction);
        System.out.println(Multiplication);
        System.out.println(Division);
    }

    public static int add(int c, int d) {
        return c + d ;
    }
    public static int subtract(int c, int d){
        return c - d;
    }

    public static int multiply(int c, int d){
        return c * d;
    }

    public static float divide(float c, float d){
        return c / d;
    }
}


