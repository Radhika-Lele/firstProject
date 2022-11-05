package com.company.day2;

import java.util.Scanner;
//enter marks of 5 subjects and find out highest marks
public class Array1D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks[] = new int[5];
        System.out.println("enter marks of 5 subjects");

        int assumed = marks[0];
        for(int i=0;i<marks.length;i++){
            marks[i]=sc.nextInt();
            if(marks[i]>assumed){

                assumed = marks[i];
            }


        }
        System.out.println("largest number is "+ assumed);

    }

}
