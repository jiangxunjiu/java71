package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class erweishuzu {
    public static void main(String[] args) {
//        int [][]a=new int[5][3];
        Scanner in = new Scanner(System.in);
//        for (int i = 0; i <a.length; i++) {
//            System.out.println("第"+(i+1)+"同学");
//            for (int j = 0; j <a[i].length ; j++) {
//                System.out.print("请输入第"+(i+1)+"个同学第"+(j+1)+"个成绩:");
//                a[i][j]=in.nextInt();
//            }
//        }
//        System.out.println("统计考试成绩：");
//        for (int i = 0; i <a.length ; i++) {
//            int sum=0;
//            int max=a[i][0];
//            int min=a[i][0];
//            for (int j = 0; j < a[i].length ; j++) {
//                sum+=a[i][j];
//                if (max<a[i][j]){
//                    max=a[i][j];
//                }
//                if (min>a[i][j]){
//                    min=a[i][j];
//                }
//            }
//            System.out.println("********************************");
//            System.out.println("第"+(i+1)+"个同学的总成绩是："+sum);
//            System.out.println("第"+(i+1)+"个同学的平均分是："+sum/3);
//            System.out.println("第"+(i+1)+"个同学的最高分是："+max);
//            System.out.println("第"+(i+1)+"个同学的最低分是："+min);

//        }


//        int[][] a = {{22, 66, 44}, {77, 33, 88}, {25, 45, 65}, {11, 66, 99}};
//        int b = 0;
//        for (int i = 0; i < a.length; i++) {
//            int sum = 0;
//            for (int j : a[i]) {
//                sum += j;
//            }
//            System.out.println("第" + (i + 1) + "季度：" + Arrays.toString(a[i]));
//            System.out.println("第" + (i + 1) + "季度相加后：" + sum);
//            b += sum;
//        }
//        System.out.println("一年赚了"+b+"万元");


//
//        int a[][]=new int[3][5];
//        int b[]=new int[3];
//        for (int i = 0; i <a.length ; i++) {
//            int sum=0;
//            System.out.println("第"+(i+1)+"同学");
//            for (int j = 0; j <a[i].length ; j++) {
//                a[i][j]=(int) (Math.random() * 100);
//                System.out.println("第"+(i+1)+"个同学第"+(j+1)+"门成绩:"+a[i][j]);
//                sum+=a[i][j];
//                b[i]=sum;
//            }
//        }
//        System.out.println("***********************");
//        System.out.println("每个学员的总分："+Arrays.toString(b));
//        System.out.println("***********************");
//        System.out.print("输入你要查的第几门平均分成绩：");
//        int e=in.nextInt();
//        int num=0;
//        for (int i = 0; i <a.length ; i++) {
//            num+=a[i][e-1];
//        }
//        System.out.println("所有同学第"+e+"门平均分成绩："+num/3);

        //杨辉三角
//        System.out.print("输入你要的杨辉三角的行数：");
//        int ne=in.nextInt();
//        int[][] arr=new int[ne][ne];
//        for(int i=0;i<arr.length; i++) {
//            //由于只是给杨辉三角内的位置赋值，所以是j<=i
//            for(int j=0;j<=i;j++) {
//                //根据规律，使用if else 赋值
//                if(j==0||j==i) {
//                    arr[i][j]=1;
//                }else {
//                    arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
//                }
//                System.out.print(arr[i][j]+"\t");
//            }
//            System.out.println();
//        }



        int [][]zu=new int[3][3];
        int a=0;
        int b=zu.length/2;
        zu[a][b]=1;
        for (int i = 2; i <=3*3 ; i++) {
            if (a==0){//列
                a=zu.length-1;
            }else if(a!=0){
                a-=1;
            }
            if (b<zu.length-1){
                b+=1;//行
            }else if(b==zu.length-1){
                b=0;
            }
            if(zu[a][b] ==0) {
                zu[a][b] = i;      //没有被占用
            }else {
                if (a<=zu.length-3){//列
                    a+=2;
                }else{
                    a=(a+2-zu.length);
                }
                if (b>0){//行
                    b-=1;
                }else if(b==0){
                    b=zu.length-1;
                }
                zu[a][b] = i;
            }
        }
        for (int x = 0; x < zu.length; x++) {
            for (int y = 0; y < zu.length; y++) {
                System.out.print(zu[x][y]+"\t");
            }
            System.out.println();
        }


//        System.out.print("输入这个数组的维数：");
//        int a=in.nextInt();
//        int su[][]=new int[a][a];
//        for (int i = 0; i <su.length ; i++) {
//            System.out.println("输入第"+(i+1)+"中一维数组元素");
//            for (int j = 0; j < su.length; j++) {
//                System.out.print("输入第"+(j+1)+"元素：");
//                su[i][j]=in.nextInt();
//            }
//        }
//        for (int i = 0; i <su.length ; i++) {
//            System.out.println(Arrays.toString(su[i]));
//        }
//        System.out.println("行列颠倒后：");
//        for (int i = su.length-1; i >=0 ; i--) {
//            for (int j = su.length-1; j >=0 ; j--) {
//                System.out.print(su[i][j]+"\t");
//            }
//            System.out.println();
//        }
    }
}
