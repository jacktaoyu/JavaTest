package com.ty.basic.com.ty.Scanner;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要输入的字符串:");
        if(scanner.hasNext()){
            String str=scanner.next();
            System.out.println(str);
        }
        scanner.close();
    }
}
