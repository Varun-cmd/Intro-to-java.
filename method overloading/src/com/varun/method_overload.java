package com.varun;

public class method_overload {
    public static void main(String[] args) {
        int x = 10;
        fun(x);
        fun("varun");


    }
    static void fun(int x ){
        x+=10;
        System.out.println(x);
    }
    static  void fun (String name){
        System.out.println(name);
    }
}
