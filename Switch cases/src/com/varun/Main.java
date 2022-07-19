package com.varun;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the name of the fruit:");
        String fruit  = in.next();
        if (fruit.equals("mango")){
            System.out.println("it is the king of fruits");
        }
        else{
            System.out.println("just a normal fruit");
        }
        switch (fruit){
            case "mango":
                System.out.println("It is the king of fruits");
                break;
            case "apple":
                System.out.println("Sweet red fruit");
                break;
            case "strawberry":
                System.out.println("sour red fruit");
            case "banana":
                System.out.println("Long yellow fruit");
                break;
            default:
                System.out.println("IDK dude :(");
        }
//        int day =in.nextInt();
//        switch (day){
//            case 1 -> System.out.println("Monday");
//            case 2 -> System.out.println("Tuesday");
//            case 3 -> System.out.println("Wednesday");
//            case 4 -> System.out.println("Thursday");
//            case 5 -> System.out.println("Friday");
//        }


        }



    }

