package com.company;

//import java.util.Scanner;

import java.util.Scanner;

public class xunhuan {
    public static void main(String[] args) {
//        int i,j;
//        Scanner in =new Scanner(System.in);
//        System.out.print("输入一个整数：");
//        int a=in.nextInt();
//        System.out.println("***********************");
//        for (i=0,j=a;i<=a;i++,j--){
//            System.out.println(i+"+"+j+"="+(i+j));
//        }
//
        for (int e=1;e<=5;e++){//等腰三角形
            for (int k=1;k<=5-e;k++){
                System.out.print(" ");
            }
            for (int s=1;s<=2*e-1;s++){
                System.out.print("*");
            }
            System.out.println();
        }

//
//
//        for (int e=1;e<=5;e++){//平行三角形
//            for (int k=1;k<=5-e;k++){
//                System.out.print(" ");
//            }
//            for (int s=1;s<=5;s++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }


//        for (int e=1;e<=9;e++){//直角三角形
//            for (int s=1;s<=e;s++){
//                System.out.print(s+"x"+e+"="+s*e+"\t");
//            }
//            System.out.println();
//        }
//
//        for (int e=1;e<=5;e++){//矩形
//            for (int s=1;s<=5;s++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//
//        for (int i = 1; i <=5; i++) {
//            for (int j = i; j <=5; j++) {
//                System.out.print(" ");
//            }
//            for (int s = 1; s <=2*i-1 ; s++) {
//                if (s==1||s==2*i-1){
//                    System.out.print("*");
//                }else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
//        for(int i1 = 0;i1 < 4;i1++){	                    //空心菱形的下半部分的行数比上半部分少一行；比如上	    					//半部分是5行，下半部分为4行才能构成菱形
//            for(int j1 = 0;j1 < (i1+2);j1++){               //j控制每行"*"前面的空格数
//                System.out.print(" ");
//            }
//            for(int k1 = 0;k1 < 2*(4-i1)-1;k1++){	        //k控制要打印的"*"的个数
//                if(i1 == 3){                                //如果是最后一行则将"*"全部打印
//                    System.out.print("*");
//                }else if(k1 == 0||k1 == 2*(3-i1)){          //如果要打印的"*"是第一个或最后一个	      							//则打印出来
//                    System.out.print("*");
//                }else{                                      //如果要打印的"*"不是第一个或最后一个则打印空格
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
//
//        int num=0;
//        for (int i = 1; i <=100 ; i++) {
//            if (i%7==0) {
//                num=num+i;
//            }
//        }
//        System.out.println(num);


//        Scanner in =new Scanner(System.in);
//        for (int i = 2; i >=0 ;i++) {
//            System.out.println("请输入用户名：");
//            String a=in.next();
//            System.out.println("请输入密码：");
//            String b=in.next();

//         if (a!="admin"||b!="123456"){
//             System.out.println("你还有"+i+"次机会请重新输入：");
//         }else {
//             System.out.println("登录成功欢迎进入二次元系统！");
//
//         }
//        }

//        String a="admin";
//        String b="123456";
//        int i;
//            for (i=3;i>1;i--){
//                System.out.println("请输入用户名：");
//                String aa=in.next();
//                System.out.println("请输入密码：");
//                String bb=in.next();
//                if (!aa.equals(a)||!bb.equals(b)){
//                    System.out.println("用户名或密码错误！");
//                    System.out.println("你还有"+(i-1)+"次机会请重新输入：");
//                }else {
//                    System.out.println("登录成功欢迎进入二次元系统！");
//                    break;
//                }
//            }



//       int s;
//        int sum=0;
//        int avg;
//        boolean io=false;
//        Scanner in=new Scanner(System.in);
//        System.out.print("请输入学生姓名：");
//        String na=in.next();
//        for (int i = 0; i <5 ; i++) {
//            System.out.println("请输入第"+(i+1)+"门课成绩！");
//            s=in.nextInt();
//            if (s<0){
//                io=true;
//                break;
//            }
//            sum+=s;
//        }
//        if (io) {
//            System.out.println("抱歉分数录入错误,请重新输入!");
//        }else {
//            avg=sum/5;
//            System.out.println(na+"平均分是"+avg);
//        }


//        int s;
//        int sum;
//        int num=0;
//        Scanner in=new Scanner(System.in);
//        System.out.print("请输入班级总人数：");
//        sum=in.nextInt();
//        for (int i = 0; i <sum ; i++) {
//            System.out.println("请输入第"+(i+1)+"位学生的成绩！");
//            s=in.nextInt();
//            if (s<80){
//                continue;
//            }
//            num++;
//        }
//        System.out.println("成绩大于80的学生人数是："+num);
//        double nat=(double)num/sum*100;
//        System.out.println("80分以上的学生所占的比例为："+nat+"%");

        int x=1;
        int total=1;
        while ( x<=100 )
            total +=x;
        ++x;
        System.out.println(total);




    }
}
