package com.varun;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("calculator");
        System.out.println("Enter two numbers:");
        int a=input.nextInt();
        int b=input.nextInt();
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        System.out.println("Enter your option:");
        int choice =input.nextInt();
        if (choice==1){
            int ans=a+b;
            System.out.println("answer is :"+ans);
        }
        else if (choice==2)
        {
            int ans=a-b;
            System.out.println("answer is :"+ans);
        }
        else if (choice==3)
        {
            int ans=a*b;
            System.out.println("answer is :"+ans);
        }
        else if (choice==4)
        {
            int ans=a/b;
            System.out.println("answer is :"+ans);
        }


    }
}
