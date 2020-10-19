package zuoyer;

import java.util.Scanner;

public class eee {
    public static void main(String[] args) {
//        int sun=0;
//        for (int i=1;i<=100;i++){
//            sun=sun+i;
//        }
//        System.out.println(sun);

//
//        Scanner in=new Scanner(System.in);
//        System.out.print("请输入周1的学习时间:");
//        int a=in.nextInt();
//        System.out.print("请输入周2的学习时间:");
//        int b=in.nextInt();
//        System.out.print("请输入周3的学习时间:");
//        int c=in.nextInt();
//        System.out.print("请输入周4的学习时间:");
//        int d=in.nextInt();
//        System.out.print("请输入周5的学习时间:");
//        int e=in.nextInt();
//        double sum=(double)(a+b+c+d+e)/5;
//        System.out.println("周一~周5学习平均为:"+sum+"小时！");


//
//        double a=10000.0;
//        for (int i = 0; i <5 ; i++) {
//            a=a+a*0.003;
//        }
//        System.out.println("五年后本金是："+a);



//        for (int i=1;i<=100;i++){
//            if(i%3==0&&i%5==0){
//                System.out.println("FlipFlop!");
//            }else if (i%3==0){
//                System.out.println("Flip");
//            }else if (i%5==0){
//                System.out.println("Flop");
//            }else{
//                System.out.println(i);
//            }
//        }

//        int a=0;
//        for (int i=100;i<1000;i++){
//            int b=i%10;
//            int c=i/10%10;
//            int d=i/100%10;
//            if (i==(b*b*b)+(c*c*c)+(d*d*d)){
//                i=(b*b*b)+(c*c*c)+(d*d*d);
//                a=a+1;
//            }
//        }
//        System.out.println(a);


//        Scanner in =new Scanner(System.in);
//        System.out.print("请输入一个整数（输入0结束）：");
//        int a=in.nextInt();
//        int max=a;
//        int min=a;
//        do {
//            System.out.print("请输入一个整数（输入0结束）：");
//            a=in.nextInt();
//            if (a==0){
//                break;
//            }else if(a<min){
//                min=a;
//            }else if (a>max){
//                max=a;
//            }
//        }while (a!=0);
//        System.out.println("最大值："+max+"\t"+"最小值："+min);
        int a;
        String b;
        do {
            Scanner in =new Scanner(System.in);
            System.out.print("请输入0-2的整数：");
            a=in.nextInt();
            switch (a){
                case 1:
                    System.out.println("你出的是石头");
                    break;
                case 2:
                    System.out.println("你出的是剪刀");
                    break;
                case 3:
                    System.out.println("你出的是布");
                    break;
                    default:
                        System.out.println("输入错误");
                        break;
            }
            System.out.print("是否要继续出拳(y/n)");
            b=in.next();
        }while ("y".equals(b));
    }
}