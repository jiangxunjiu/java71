package zuoyer;

import java.util.Scanner;

public class ccc {
    public static void main(String[] args) {
//        Scanner in=new Scanner(System.in);
//        System.out.print("请输入圆柱的半径：");
//        int a=in.nextInt();
//        System.out.print("请输入圆柱的高：");
//        int b=in.nextInt();
//        double c=a*3.14*a*b;
//        System.out.println("圆柱的体积是："+c);

//        Scanner in=new Scanner(System.in);
//        System.out.print("请输入需要反转相加的数：");
//        int a=in.nextInt();
//        int b=a%10;
//        int c=a/10%10;
//        int d=a/100%10;
//        int e=a/1000;
//        int sum=b*1000+c*100+d*10+e;
//        System.out.println(a+sum);

//        int a=4;
//        int b=15;
//        int c=20;
//        int d=(b/a)+c;
//        int e=(c%b)*a-c;
//        System.out.println("表达式(b/a)+c答案为："+d);
//        System.out.println("表达式(c%b)*a-c答案为："+e);

//        Scanner in =new Scanner(System.in);
//        System.out.println("请输入你的java成绩：");
//        int a=in.nextInt();
//        System.out.println("请输入你的音乐成绩：");
//        int b=in.nextInt();
//        if((a>90&&b>80||a==100&&b>70)){
//            System.out.println("奖励一个星期没作业");
//        }else {
//            System.out.println("抄试卷");
//        }
//
//        Scanner in =new Scanner(System.in);
//        System.out.println("请输入你的年龄");
//        int a=in.nextInt();
//        if (a<=0){
//            System.out.println("请输入你正确的年龄");
//        }else if(a<18){
//            System.out.println("青少年时期");
//        }else if(a<35){
//            System.out.println("青壮年时期");
//        }else if(a<60){
//            System.out.println("中年时期");
//        }else if(a<100){
//            System.out.println("老年时期");
//        }else{
//            System.out.println("恭喜你成仙了");
//        }

        Scanner in =new Scanner(System.in);
        System.out.print("第一个数：");
        int a=in.nextInt();
        System.out.print("第二个数：");
        int b=in.nextInt();
        System.out.print("第三个数：");
        int c=in.nextInt();
        if (a>b&&a>c){
            System.out.println("最大的数是："+a);
        }else if(b>a&&b>c){
            System.out.println("最大的数是："+b);
        }else if(c>a&&c>b){
            System.out.println("最大的数是："+c);
        }else {
            System.out.println("一样大");
        }

    }

}