package zuoyer;

import java.util.Scanner;

public class fff {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int s;
//        int sum = 0;
//        double avg;
//        int max = 0;
//        int min = 0;
//        for (int i = 1; i <= 3; i++) {
//            System.out.println("输入三(" + i + ")班学生成绩");
//            boolean io = false;
//            int j=0;
//            while (j<5){
//                System.out.print("请输入第" + (j + 1) + "学生成绩:");
//                s = in.nextInt();
//                    sum += s;
//                if (j==1){
//                    min=s;
//                }
//                if (s < min) {
//                    min = s;
//                }
//                if (s > max) {
//                    max = s;
//                }
//                j++;
//            }
//            if (io) {
//                System.out.println("抱歉分数录入错误,请重新输入!");
//            } else {
//                avg = (double) sum / 5;
//                System.out.println("三(" + i + ")班总分是" + sum);
//                System.out.println("三(" + i + ")班平均分是" + avg);
//                System.out.println("三(" + i + ")班最大值是" + max);
//                System.out.println("三(" + i + ")班最小值是" + min);
//                System.out.println("**************************");
//            }
//        }


//        for (int i = 2; i <=100 ; i++) {
//            for (int j=2;j<=i;j++){
//                if(i%j==0){
//                    break;
//                }
//            }
//        }
//        for (int i = 2; i <= 100; i++) {//1不是质数,直接从2开始
//            int j;
//            for (j = 2; j <= i; j++) {
//                if (i % j == 0) {
//                    break;
//                }
//            }
//            if (i == j) {
//                System.out.print(i + "\t");
//            }
//        }


//        for (int i = 100; i>=5 ;i-=5) {
//            System.out.print(i+" ");
//        }


//        for (int e=1;e<=5;e++){//等腰三角形
//            int a=0;
//            for (int i = 0; i <e ; i++) {
//                a=a+1;
//            }
//            for (int k=1;k<=5-e;k++){
//                System.out.print(" ");
//            }
//            for (int s=1;s<=2*e-1;s++){
//                System.out.print(a);
//            }
//            System.out.println();
//        }


//        System.out.print("输入一个数：");
//        int a=in.nextInt();
//            switch (a){
//                case 1:
//                    System.out.println("星期一");
//                    break;
//                case 2:
//                    System.out.println("星期二");
//                    break;
//                case 3:
//                    System.out.println("星期三");
//                    break;
//                case 4:
//                    System.out.println("星期四");
//                    break;
//                case 5:
//                    System.out.println("星期五");
//                    break;
//                case 6:
//                    System.out.println("星期六");
//                    break;
//                case 7:
//                    System.out.println("星期日");
//                    break;
//                    default:
//                        System.out.println("输入错误！");
//                        break;
//        }


//        System.out.print("请输入一个学生的成绩：");
//        double a=in.nextInt();
//        a=(a+a*0.2);
//        System.out.println("增加20%的成绩是："+a);


//        System.out.print("输入你消费金额：");
//        double a=in.nextInt();
//        System.out.print("输入你打的折数：");
//        int b=in.nextInt();
//        if (b!=0){
//           a=b*0.1*a;
//            System.out.println("打"+b+"折后消费金额是："+a+"元");
//        }else {
//            System.out.println("你未打折消费："+a+"元");
//        }


//        System.out.print("输入你在商场消费的金额：");
//        int a=in.nextInt();
//        if (a*0.8>=1000){
//            System.out.println("恭喜你获得200元代金卷一张.");
//        }else {
//            System.out.println("不好意思你消费金额不满足活动需求。");
//        }

//        System.out.print("请输入一个年份：");
//        int a=in.nextInt();
//        if (a%4==0&&a%100!=0||a%400==0){
//            System.out.println("这是闰年");
//        }else {
//            System.out.println("这是平年");
//        }


//        System.out.print("输入你的会员号：");
//        String a=in.next();
//        if (a.length()==4){
//            System.out.println("登陆成功");
//        }else {
//            System.out.println("你输入会员号有误！");
//        }


//        System.out.print("请输入一个年份：");
//        int a = in.nextInt();
//        System.out.print("输入一个月份：");
//        int b = in.nextInt();
//        switch (b) {
//            case 1:
//            case 3:
//            case 5:
//            case 7:
//            case 8:
//            case 10:
//            case 12:
//                System.out.println("这个月31天。");
//                break;
//            case 4:
//            case 6:
//            case 9:
//            case 11:
//                System.out.println("这个月30天。");
//                break;
//            case 2:
//                if (a % 4 == 0 && a % 100 != 0 || a % 400 == 0) {
//                    System.out.println("这个月29天。");
//                } else {
//                    System.out.println("这个月28天。");
//                }
//                break;
//             }

//        int num=0;
//        System.out.print("输入一个年份：");
//        int a=in.nextInt();
//        System.out.print("输入一个月份：");
//        int b=in.nextInt();
//        System.out.print("输入多少号 ：");
//        int c=in.nextInt();
//        for (int i = 1; i <= b; i++) {//把这些小于等于输入的月份的天数循环相加
//            switch (i) {
//                case 1:
//                case 3:
//                case 5:
//                case 7:
//                case 8:
//                case 10:
//                case 12:
//                    num+=31;
//                    break;
//                case 4:
//                case 6:
//                case 9:
//                case 11:
//                    num+=30;
//                    break;
//            }
//        }
//        if (a % 4 == 0 && a % 100 != 0 || a % 400 == 0) {// 判断是闰年还是平年加上二月天数
//            num+=29;
//        } else {
//            num+=28;
//        }
//        switch (b) {//根据输入的月份减去这个月剩下的天数
//            case 1:
//            case 3:
//            case 5:
//            case 7:
//            case 8:
//            case 10:
//            case 12:
//                num-=31-c;
//                break;
//            case 4:
//            case 6:
//            case 9:
//            case 11:
//                num-=30-c;
//                break;
//        }
//        System.out.println(num);

//        int num=0;
//        for (int i = 1; i <= 100; i++) {
//            if (i % 7 != 0) {
//                num += i;
//            }
//        }
//        System.out.println(num);

//        double a=1;
//        int num=0;
//        do {
//            a += a * 0.5;
//            num+=1;
//        } while (a <= 10);
//        System.out.println("他存到第"+num+"天");


//        double a=1;
//        for (int i = 0; i < 30; i++) {
//            a+=a*0.5;
//        }
//        System.out.println("一个月后他存了："+a+"元");


//        double a=0;
//        int num=0;
//        do {
//            a=a+5-3.5;
//            num+=1;
//        } while (a <= 56.7);
//        System.out.println("他爬"+num+"天");

//        int a = 1;
//        for (int i = 0; i < 10; i++) {
//            a = (a + 1) * 2;
//        }
//        System.out.println("猴子一共摘了"+a);



//        int num=0;
//        for (int i = 0; i <= 100; i++) {//循环公鸡的数量
//            for (int j = 0; j <= 100; j++) {//循环母鸡的数量
//                if ((i*5+j*3+(100-i-j)/3)==100) {
//                    System.out.println("公鸡个数："+i);
//                    System.out.println("母鸡个数："+j);
//                    System.out.println("小鸡个数："+(100-i-j));
//                    System.out.println("*************************");
//                    num++;
//                }
//            }
//        }
//        System.out.println("总共有"+num+"种买法");

    }
}
