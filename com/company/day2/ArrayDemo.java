package com.company.day2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
//Declare an array to hold 10 decimal values and calculate sum of this values
public class ArrayDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float values [] = new float[3];
        System.out.println("enter 3 decimal values :");
        float sum =0;
        for(int i=0;i<values.length;i++){
            values[i]  = sc.nextFloat();
            sum = sum + values[i];
        }
        System.out.println("sum is : "+ sum);






    /*    Scanner sc = new Scanner(System.in);
        String[] arr1 = new String[3];    // or String [] arr1 ={"radhika" , "", "lele"};   another syntax
        arr1[0] = "radhika";
        arr1[1] = "";
        arr1[2] = "lele";
        System.out.println(arr1[0]);     */


      /*  int marks[] = new int[5];
        Random r = new Random();
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Enter marks of subject" +(i+1));
            marks[i] = r.nextInt();

        }
        int sum = 0;
        for (int i = 0; i < marks.length; i++) {
            sum = marks[i] + i;

        }
        System.out.println("Total marks = " + sum);
    /*    int arr[] = new int[5];         // int [] marks1 = new int[]{1,5,4,3};    another syntax  OR int [] marks = {1,4,3,2}
        for (int i = 0; i <= 4; i++) {

            System.out.println("enter marks");
            arr[i] = sc.nextInt();
        }
        System.out.println( Arrays.toString(arr));  //utility
        for (int i = 0; i <= 4; i++) {
            System.out.print(arr[i]+" ");

        }
    }*/


    }
}