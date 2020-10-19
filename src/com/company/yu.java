package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class yu {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int[] a = new int[]{8, 4, 2, 1, 23, 344, 12};
//        int num = 0;
//        System.out.println("循环数组值是：");
//        for (int i = 0; i < a.length; i++) {
//            System.out.print(a[i] + "\t");
//        }
//        for (int i = 0; i < a.length; i++) {
//            num += a[i];
//        }
//        System.out.println();
//        System.out.println("数值的和是：" + num);
//        System.out.print("输入一个整数：");
//        int b = in.nextInt();
//        boolean dan = false;
//        for (int i = 0; i < a.length; i++) {
//            if (b == a[i]) {
//                dan = true;
//                break;
//            }
//        }
//        if (dan) {
//            System.out.println("Yes");
//        } else {
//            System.out.println("No");
//        }

//        int[] a = new int[6];
//        a[0] = 89;
//        a[1] = 98;
//        a[2] = 76;
//        a[3] = 82;
//        a[4] = 45;
//        System.out.println("输入前的成绩：");
//        System.out.println("89\t98\t76\t82\t45");
//        System.out.print("输入一个学生成绩：");
//        int clas = in.nextInt();
//        int xb=a.length-1;
//        for (int i = 0; i < a.length; i++) {
//            if (clas>a[i]){
//                xb=i;
//                break;
//            }
//        }
//        for (int i =a.length-1; i>xb; i--) {
//            a[i]=a[i-1];
//        }
//        a[xb]=clas;
//        System.out.println("插入的下标是："+xb);
//        System.out.println("插入之后的成绩是：");
//        for (int b:a){l
//            System.out.print(b+"\t");
//        }


//        int a[] = {45, 56, 78, 21, 45, 36, 12, 4};
//        System.out.println("*********冒泡排序前**********");
//        System.out.println(Arrays.toString(a) + "\t");
//        for (int i = 0; i < a.length - 1; i++) {
//            for (int j = 0; j < a.length - 1 - i; j++) {
//                if (a[j] < a[j + 1]) {
//                    int tem = a[j];
//                    a[j] = a[j + 1];
//                    a[j + 1] = tem;
//                }
//            }
//        }
//        System.out.println("*********冒泡排序后**********");
//        System.out.println(Arrays.toString(a));
     /*答：
     1.创建一个静态数组
     2.写第一个for循环条件：a数组下标减1第二个for循环条件：a的下标减1减去i
     3.在双重循环里判断当前的a数组元素是否小于后一个数组元素
     4.判断成立后设置第三个变量把当前数组元素与后一个数组元素进行替换
     5.然后循环输出

        * */


//        int a[] = {8, 7, 3, 9, 5, 4, 1};
//        System.out.println("*********数组数列**********");
//        System.out.println(Arrays.toString(a) + "\t");
//        int max = a[0];
//        for (int i : a) {
//            if (max < i) {
//                max = i;
//            }
//        }
//        int xb=a.length-1;
//        for (int i = 0; i <a.length ; i++) {
//            if (a[i]== max){
//                xb=i;
//                break;
//            }
//        }
//        System.out.println("**************************");
//        System.out.println("最大值是：" + max);
//        System.out.println("下标是："+xb);


//        int a[]=new int[10];
//        for (int i = 0; i < a.length; i++) {
//            int num = (int) (100 * Math.random());
//            int b=num%10;
//            a[i] = b;
//        }
//        System.out.println("*********升降排序前**********");
//        System.out.println(Arrays.toString(a) + "\t");
//        System.out.println();
//        for (int i = 0; i < a.length - 1; i++) {
//            for (int j = 0; j < a.length - 1 - i; j++) {
//                if (a[j] < a[j + 1]) {
//                    int tem = a[j];
//                    a[j] = a[j + 1];
//                    a[j + 1] = tem;
//                }
//            }
//        }
//        System.out.println("*********降序排序后**********");
//        System.out.println(Arrays.toString(a));
//        System.out.println();
//        for (int i = 0; i < a.length - 1; i++) {
//            for (int j = 0; j < a.length - 1 - i; j++) {
//                if (a[j] > a[j + 1]) {
//                    int tem = a[j];
//                    a[j] = a[j + 1];
//                    a[j + 1] = tem;
//                }
//            }
//        }
//        System.out.println("*********升序排序后**********");
//        System.out.println(Arrays.toString(a));
//        System.out.println();
//        int sum=0;
//        for (int i:a){
//            sum+=i;
//        }
//        double avg=(double) sum/a.length;
//        System.out.println("总和是："+sum);
//        System.out.println("平均数是："+avg);


//        int a[] = new int[10];
//        int b[] = new int[10];
//        for (int i = 0; i < a.length; i++) {
//            int num = (int) (100 * Math.random());
//            int c = num % 10;
//            a[i] = c;
//        }
//        System.out.println("随机出现的数字");
//        System.out.println(Arrays.toString(a));
//        for (int i = 0; i < a.length; i++) {
//            for (int j = 0; j < b.length; j++) {
//                if (a[i] == j) {
//                    b[j] += 1;
//                }
//            }
//        }
//        int max = 0;
//        System.out.println("下面各个数字出现次数");
//        for (int i = 0; i < b.length; i++) {
//            System.out.println("数字" + i + "出现了：" + b[i] + "次\t");
//        }
//        for (int i : b) {
//            if (max < i) {
//                max = i;
//            }
//        }
//        System.out.print("出现最多的是: ");
//        int xb;
//        for (int i = 0; i < b.length; i++) {
//            if (b[i] == max) {
//                xb = i;
//                System.out.print(xb + "  ");
//            }
//        }
//        System.out.println();
//        for (int i = 0; i <b.length ; i++) {
//            if (b[i]==1){
//                System.out.println("出现一次最小的数字是:"+i);
//                break;
//            }
//        }


//        int a[]={7,1,5,2};//倒置数组元素
//        int i=0;
//        int j=a.length-1;
//        int tem;
//        while (i<j){
//            tem=a[i];
//            a[i]=a[j];
//            a[j]=tem;
//            i++;
//            j--;
//        }
//        System.out.println(Arrays.toString(a));
    }
}
