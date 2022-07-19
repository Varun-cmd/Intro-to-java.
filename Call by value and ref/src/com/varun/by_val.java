package com.varun;

import java.util.Scanner;

public class by_val {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter the first number:");
            int a = in.nextInt();
            System.out.println("Enter the second number:");
            int b = in.nextInt();
            System.out.println("Before swapping");
            System.out.print("a="+a);
            System.out.println("b="+b);
            swap(a,b);
            System.out.println("after swapping");
            System.out.print("a="+a);
            System.out.print("b="+b);

        }

        public static void swap(int x,int y){
            int temp;
            temp = x;
            x =y;
            y = temp;

        }

    }



