package com.company;

import java.util.Scanner;

public class Main {

        public static void main(String[] args) {
            Scanner in=new Scanner(System.in);
//            System.out.print("你叫什么名字：");
//            String a=in.next();
//            System.out.print("输入你的卡号：");
//            int b=in.nextInt();
//            System.out.println("用户名："+a);
//            System.out.println("卡号：："+b);
            System.out.println("你的语文多少分：");
            double a=in.nextDouble();
            System.out.println("你的数学多少分：");
            double b=in.nextDouble();
            System.out.println("你的英语多少分：");
            double c=in.nextDouble();
            System.out.println("你的体育多少分：");
            double d=in.nextDouble();
            System.out.println("你第一次的平均分是多少：");
            double e=in.nextDouble();
            System.out.println("语文:"+a);
            System.out.println("数学:"+b);
            System.out.println("英语:"+c);
            System.out.println("体育:"+d);
            System.out.println("你的平均分是："+(a+b+c+d)/4);
            System.out.println("你第一次平均分和这次平均分差是："+(e-(a+b+c+d)/4));

        }
}
