package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class zsgc {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        //增
        int aa[]={32,58,96,74,0,12,65,14};
        System.out.print("请输入要添加的数字：");
        int a=in.nextInt();
        int b=-1;
        for (int i = 0; i < aa.length; i++) {
            if (aa[i]==0){
                b=i;
                break;
            }
        }
        System.out.println("b下标是"+b);
        if (b!=-1){
            aa[b]=a;
        }else {
            System.out.println("数组已满，无法添加！");
        }
        System.out.print("添加后数组：");
        System.out.println(Arrays.toString(aa));



        //删
        String bb[]={"ajvac","cbtui","scdev","dsfds","sfsdff","ffd"};
        System.out.print("输入要删除的名字：");
        String de=in.next();
        int ber=-1;
        for (int i = 0; i <bb.length ; i++) {
            if (de.equalsIgnoreCase(bb[i])){
                ber=i;
            }
        }
        System.out.println("ber下标是"+ber);
        if (b!=-1){
            for (int i = ber; i <bb.length-1; i++) {
                bb[i]=bb[i+1];
            }
            System.out.println(Arrays.toString(bb));
            bb[bb.length-1]=null;
        }else {
            System.out.println("抱歉没有你要删除的名字！");
        }
        System.out.print("删除后人员姓名是：");
        for (int i = 0; i < bb.length-1; i++) {
            System.out.print(bb[i]+"\t");
        }





    }
}
