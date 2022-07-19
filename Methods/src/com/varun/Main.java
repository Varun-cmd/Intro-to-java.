package com.varun;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a = in.nextInt();
        System.out.println("Enter the second number");
        int b = in.nextInt();
        int answer= sum(a,b);
        System.out.println("Sum of two numebr is:"+answer);



    }

    public static int sum(int x,int y){
        int ans;
        ans=x+y;
        return ans;
    }
}
