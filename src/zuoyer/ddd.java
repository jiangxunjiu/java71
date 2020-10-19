package zuoyer;

import java.util.Scanner;

public class ddd {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
//        System.out.println("Monday，Tuesday、Wednesday、Thursday、Friday、Saturday 、Sunday");
//        System.out.print("请输入第一个英文字母：");
//        String a=in.next();
//        switch(a){
//            case "M":
//            case "m":
//                System.out.println("请输入第二个字母");
//                String z = in.next();
//                if (z.equals("o")|| z.equals("O") )
//                System.out.println("星期一");
//                break;
//            case "T":
//            case "t":
//                System.out.print("请输入第二个字母：");
//                String b=in.next();
//                if (b.equals("U")|| b.equals("u") ){
//                    System.out.println("星期二");
//                }else  if (b.equals("H")|| b.equals("h") ){
//                    System.out.println("星期四");
//                }else {
//                    System.out.println("你输入不存在！");
//                }
//                break;
//            case "W":
//            case "w":
//                System.out.println("请输入第二个字母");
//                String s = in.next();
//                if (s.equals("E")|| s.equals("e") )
//                    System.out.println("星期三");
//                break;
//            case "F":
//            case "f":
//                System.out.print("请输入第二个字母");
//                String g = in.next();
//                if (g.equals("r")|| g.equals("R") )
//                    System.out.println("星期五");
//                break;
//            case "S":
//            case "s":
//                System.out.print("请输入第二个字母：");
//                String c=in.next();
//                if (c.equals("U")|| c.equals("u") ){
//                    System.out.println("星期日");
//                }else  if (c.equals("A")|| c.equals("a") ){
//                    System.out.println("星期六");
//                }else {
//                    System.out.println("你输入不存在！");
//                }
//                break;
//                default:
//                    System.out.println("输入不存在或者你输入存在错误");
//                    break;
//        }


//        Scanner in =new Scanner(System.in);
//        int num=5000;
//        System.out.print("请输入你定几月的机票：");
//        int a=in.nextInt();
//        if (a >=4 && a <= 10 && a!=0){
//            System.out.println("1.头等舱");
//            System.out.println("2.商务舱");
//            System.out.println("3.经济舱");
//            System.out.println("请选择你的舱位：");
//            int b=in.nextInt();
//            switch (b){
//                case 1:
//                    System.out.println("你的机票价格是："+num*0.9);
//                    break;
//                case 2:
//                    System.out.println("你的机票价格是："+num*0.8);
//                    break;
//                case 3:
//                    System.out.println("你的机票价格是："+num*0.7);
//                    break;
//                    default:
//                        System.out.println("请正确选择你的舱位！");
//                        break;
//            }
//        }else if (a<4 && a >=1 || a >10 && a <=12 ){
//            System.out.println("1.头等舱");
//            System.out.println("2.商务舱");
//            System.out.println("3.经济舱");
//            System.out.println("请选择你的舱位：");
//            int d=in.nextInt();
//            switch (d){
//                case 1:
//                    System.out.println("你的机票价格是："+num*0.5);
//                    break;
//                case 2:
//                    System.out.println("你的机票价格是："+num*0.4);
//                    break;
//                case 3:
//                    System.out.println("你的机票价格是："+num*0.3);
//                    break;
//                default:
//                    System.out.println("请正确选择你的舱位！");
//                    break;
//            }
//        }else {
//            System.out.println("请正确输入月份。");
//        }



//        Scanner in=new Scanner(System.in);
//        System.out.print("请输入一个月份:");
//        int a=in.nextInt();
//        switch (a){
//            case 3:
//            case 4:
//            case 5:
//                System.out.println("这是春天");
//                break;
//            case 6:
//            case 7:
//            case 8:
//                System.out.println("这是夏天");
//                break;
//            case 9:
//            case 10:
//            case 11:
//                System.out.println("这是秋天");
//                break;
//            case 12:
//            case 1:
//            case 2:
//                System.out.println("这是冬天");
//                break;
//                default:
//                    System.out.println("请正确输入");
//                    break;
//        }


//        Scanner in=new Scanner(System.in);
//        System.out.print("输入第一个数：");
//        int a=in.nextInt();
//        System.out.print("输入第二个数：");
//        int b=in.nextInt();
//        System.out.println("1.+\t2.-\t3.*\t4./");
//        System.out.print("请选择运算符号：");
//        int c=in.nextInt();
//        switch (c){
//            case 1:
//                System.out.println("算式："+a+"+"+b+"="+(a+b));
//                break;
//            case 2:
//                System.out.println("算式："+a+"-"+b+"="+(a-b));
//                break;
//            case 3:
//                System.out.println("算式："+a+"*"+b+"="+(a*b));
//                break;
//            case 4:
//                System.out.println("算式："+a+"/"+b+"="+(a/b));
//                break;
//        }



//        Scanner in=new Scanner(System.in);
//        System.out.print("输入一个数：");
//        int a=in.nextInt();
//        if (a%2==0){
//            System.out.println("这是偶数");
//        }else {
//            System.out.println("这是奇数");
//        }



//        Scanner in=new Scanner(System.in);
//        System.out.print("输入第一个数：");
//        int a=in.nextInt();
//        System.out.print("输入第二个数：");
//        int b=in.nextInt();
//        System.out.print("输入第三个数：");
//        int c=in.nextInt();
//        int temp;
//        if(a>b){
//            temp=a;a=b;b=temp;
//            if(b>c){
//                temp=b;b=c;c=temp;
//                System.out.println(a+"<"+b+"<"+c);
//            }else{
//                System.out.println(+a+"<"+b+"<"+c);
//            }
//        }else{
//            if(b>c){
//                temp=b;b=c;c=temp;
//                System.out.println(+a+"<"+b+"<"+c);
//            }else{
//                System.out.println(+a+"<"+b+"<"+c);
//            }
//        }

////
//        Scanner in=new Scanner(System.in);
//        System.out.print("输入第一个数：");
//        double a=in.nextDouble();
//        System.out.print("输入第二个数：");
//        double b=in.nextDouble();
//        double num;
//        if (a>10.0&&b<20.0){
//            num=a+b;
//        }else {
//            num=a*b;
//        }
//        System.out.println(num);



//
//        Scanner in=new Scanner(System.in);
//        System.out.print("输入小明的成绩：");
//        int a=in.nextInt();
//        if (a==100){
//            System.out.println("想干啥就啥");
//        }else if (a>=90&&a<100){
//            System.out.println("看电视、吃零食");
//        }else if (a>=60&&a<90){
//            System.out.println("看书，写作业");
//        }else if (a>=0&&a<60){
//            System.out.println("做家务、洗碗、拖地");
//        }else {
//            System.out.println("请正确输入成绩");
//        }




//        Scanner in=new Scanner(System.in);
//        System.out.print("输入你的工资：");
//        double a=in.nextInt();
//        double b;
//        if (a-3000<3000){
//            b=(a-3000)*0.03;
//            System.out.println("你需要缴税："+b);
//        }else if (a-3000>3000||a-3000<12000){
//            b=(a-3000)*0.1-210;
//            System.out.println("你需要缴税："+b);
//        }else if (a-12000>12000||a-12000<=25000){
//            b=(a-12000)*0.2-1410;
//            System.out.println("你需要缴税："+b);
//        }else if (a-25000>25000||a-25000<=35000){
//            b=(a-25000)*0.25-2660;
//            System.out.println("你需要缴税："+b);
//        }else if (a-35000>35000||a-35000<=55000){
//            b=(a-35000)*0.3-4410;
//            System.out.println("你需要缴税："+b);
//        }else if (a-55000>55000||a-55000<=80000){
//            b=(a-55000)*0.35-7160;
//            System.out.println("你需要缴税："+b);
//        }else if (a-80000>80000){
//            b=(a-80000)*0.45-15160;
//            System.out.println("你需要缴税："+b);
//        }
    }
}
