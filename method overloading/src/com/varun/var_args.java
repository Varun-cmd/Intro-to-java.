package com.varun;

import java.util.Arrays;

public class var_args {
    public static void main(String[] args) {
        func(1,2,4);
    }
    static void func(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
