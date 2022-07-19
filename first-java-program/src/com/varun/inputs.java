package com.varun;

import java.util.Scanner;

public class inputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your roll number:");
        int rollno =input.nextInt();
        System.out.println("Your roll number is "+rollno);
        System.out.println("Enter the student marks");
        float marks = input.nextFloat();
        System.out.println(marks);


    }
}
