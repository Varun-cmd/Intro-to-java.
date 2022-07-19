package com.varun;

import java.util.Scanner;

public class addtion {
    public static void main(String[] args) {
        System.out.printf("Enter two numbers to be added");
        Scanner input= new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = a+b;
        System.out.println("The sum is:"  + c);
    }
}
