package com.varun;

import java.util.Scanner;

public class nestedSwitch {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int empID = in.nextInt();
        String Department = in.next();
        switch (empID){
            case 1:
                System.out.println("Varun Kumar");
                break;
            case 2:
                System.out.println("Sibiraj");
                break;
            case 3:
                switch (Department){
                    case "IT":
                        System.out.println("IT department");
                        break;
                    case "Management":
                        System.out.println("Management");
                        break;
                    case"sales":
                        System.out.println("sales");
                        break;
                    default:
                        System.out.println("department not found");
                }
                break;
            default:
                System.out.println("Enter proper EMP id please!! ");

        }
    }
}
