package com.company;

import java.util.Scanner;

public class quyu {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.print("一个四位数：");
        int a=in.nextInt();
        int b=a%10;
        int c=a/10%10;
        int d=a/100%10;
        int e=a/1000;
        int sum=b+c+d+e;
        System.out.println("4位数字各位之和是："+sum);
    }
}
