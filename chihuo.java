package com.company;

import java.util.Scanner;

public class jiejian {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//
        //初始化存储数组
        String names[] = new String[4];			//姓名
        String dishMegs[] = new String[4];		//菜名
        int dishNum[] = new int[4];			//菜品编号
        int times[] = new int[4];			//送餐时间
        String addresses[] = new String[4];		//地址
        int states[] = new int[4];			//订单状态
        double sumPrices[] = new double[4];		//总价
        String dishNames[] = new String[] {"红烧带鱼", "鱼香肉丝", "时令鲜蔬"};
        double prices[] = new double[] {38.0, 20.0, 10.0};
        int praiseNums[] = new int[3];			//点赞数
        //判断用户输入的是否为0，退出系统
        int num = -1;

        //判断是否结束程序
        boolean isExit = false;

        //初始化两条订单信息
        //第1条
        names[0] = "张晴";
        dishMegs[0] = "红烧带鱼";
        dishNum[0] = 2;
        times[0] = 12;
        addresses[0] = "天成路207号";
        states[0] = 1;
        sumPrices[0] = 76.0;
        //第2条
        names[1] = "张晴";
        dishMegs[1] = "鱼香肉丝";
        dishNum[1] = 2;
        times[1] = 18;
        addresses[1] = "天成路207号";
        states[1] = 0;
        sumPrices[1] = 45.0;


        //界面初始化
        System.out.println("欢迎使用“吃货联盟订餐系统”");

        //界面需要0返回主界面
        //所以需要先显示界面再判断
        //所以用do-while循环，无论如何执行一次循环体
        while(true){
            System.out.println("**************************************************");
            System.out.println("1.我要订餐");
            System.out.println("2.查看餐袋");
            System.out.println("3.签收订单");
            System.out.println("4.删除订单");
            System.out.println("5.我要点赞");
            System.out.println("6.退出系统");
            System.out.println("**************************************************");

            System.out.println("请选择：");

            boolean legal = true;


            num = in.nextInt();

            //主界面输入选择
            switch(num) {
                case 1:
                    System.out.println("***我要订餐***");
                    boolean isAdd = false;
                    for(int j = 0; j < names.length; j++) {
                        if(names[j] == null) {
                            isAdd = true;
                            System.out.println("请输入订餐人姓名:");
                            String name = in.next();
                            System.out.println("序号" + "\t" + "菜名" + "\t"
                                    + "单价" + "\t" + "点赞数");
                            for(int i = 0; i < dishNames.length; i++) {
                                String price = prices[i]+"元";
                                String priaiseNum = (praiseNums[i]) > 0
                                        ? praiseNums[i] + "赞" : "0";
                                System.out.println(i + 1 + "\t" + dishNames[i]
                                        + "\t" + price + "\t" + priaiseNum);
                            }
                            System.out.println("请选择您要点的菜品编号：");
                            int chooseDish = in.nextInt();
                            System.out.println("请选择您需要的份数：");
                            int chooseNumber = in.nextInt();
                            String dishMeg = dishNames[chooseDish -1]
                                    + " " + chooseNumber + "份";
                            double sumPrice =
                                    prices[chooseDish - 1] * chooseNumber;
                            //订餐费满50，减5元配送费
                            double deliCharge = (sumPrice >= 50) ? 0 : 5;
                            System.out.println("请输入送餐时间(送餐时间是10点到20点整点送餐)：");
                            int time = in.nextInt();
                            while(time < 10 || time > 20) {
                                System.out.println("您输入的时间有误，请输入10~20间的整数！");
                                time = in.nextInt();
                            }
                            System.out.println("请输入送餐地址：");
                            String address = in.next();
                            //默认是0
                            System.out.println("订餐成功！");
                            System.out.println("您订的是：" + dishMeg);
                            System.out.println("送餐时间：" + time + "点");
                            System.out.println("餐费："+ sumPrice
                                    + "元，送餐费" + deliCharge + "元， 总计："
                                    + (sumPrice + deliCharge) + "元。");
                            //添加数据
                            names[j] = name;
                            dishMegs[j] = dishMeg;
                            times[j] = time;
                            addresses[j] = address;
                            sumPrices[j] = sumPrice+ deliCharge;
                            break;
                        }
                    }
                    if(!isAdd) {
                        System.out.println("对不起，您的餐袋已满！");
                    }
                    break;
                case 2:
                    System.out.println("***查看餐袋***");
                    System.out.println("序号\t订餐人\t餐品信息\t送餐日期\t送餐地址\t\t总金额\t订单状态");
                    for(int i = 0; i < names.length; i++) {
                        if(names[i] != null) {
                            String state = (states[i] == 0)
                                    ? "已预定" : "已完成";
                            String date = times[i] + "日";
                            String sumPrice = sumPrices[i] + "元";
                            System.out.println((i + 1) + "\t"
                                    + names[i] + "\t" + dishMegs[i] + "\t" + date + "\t"
                                    + addresses[i] + "\t" + sumPrice + "\t" + state);
                        }
                    }
                    break;
                case 3:
                    System.out.println("***签收订单***");
                    boolean isSignFind = false;
                    System.out.println("请选择要签收的订单序号：");
                    int signOrderId = in.nextInt();
                    for(int i = 0; i < names.length; i++) {
                        if(names[i] != null && states[i] == 0
                                && signOrderId == i+1) {
                            states[i] = 1;
                            System.out.println("定单签收成功！");
                            isSignFind = true;
                        }else if(names[i] != null && states[i] == 1
                                && signOrderId == i+1) {
                            System.out.println("您选择的订单已完成签收，不能再次签收！");
                                    isSignFind = true;
                        }
                    }
                    if(! isSignFind) {
                        System.out.println("您选择的订单不存在！");
                    }
                    break;
                case 4:
                    System.out.println("***删除订单***");
                    boolean isDelFind = false;
                    System.out.println("请输入要删除的订单序号：");
                    int delId = in.nextInt();
                    for(int i = 0; i < names.length; i++) {
                        if(names[i] != null && states[i] == 1
                                && delId == i + 1) {
                            isDelFind = true;
                            for(int j = delId-1;
                                j < names.length - 1; j++) {
                                names[j] = names[j+1];
                                dishMegs[j] = dishMegs[j+1];
                                times[j] = times[j+1];
                                addresses[j] = addresses[j+1];
                                states[j] = states[j+1];
                                sumPrices[j] = sumPrices[j+1];
                            }
                            int endIndex = names.length - 1;
                            names[endIndex] = null;
                            dishMegs[endIndex] = null;
                            times[endIndex] = 0;
                            addresses[endIndex] = null;
                            states[endIndex] = 0;
                            sumPrices[endIndex] = 0;
                            System.out.println("删除订单成功！");
                            break;
                        }else if(names[i] != null
                                && states[i] == 0 && delId == i + 1) {
                            System.out.println("您选择的订单未签收，不能删除！");
                                    isDelFind = true;
                            break;
                        }
                    }
                    if(! isDelFind) {
                        System.out.println("您要删除的订单不存在！");
                    }
                    break;
                case 5:
                    System.out.println("***我要点赞***");
                    System.out.println("序号\t" + "菜名\t"
                            + "单价\t" + "点赞数\t");
                    for(int i = 0; i < dishNames.length; i++) {
                        String price = prices[i] + "元";
                        String priaiseNum =
                                (praiseNums[i] >= 0)? praiseNums[i]+ "赞": "";
                        System.out.println((i+1)+ "\t"
                                + dishNames[i]+ "\t"+ price+ "\t"+ priaiseNum);
                    }
                    System.out.println("请选择您要点赞的菜品序号：");
                    int priaiseNum = in.nextInt();
                    if(priaiseNum > 3 || priaiseNum < 0) {
                        System.out.println("输入的序号有误！");
                        break;
                    }
                    praiseNums[priaiseNum-1]++;
                    System.out.println("点赞成功！");
                    break;
                case 6:
                    isExit = true;
                    break;
                default:
                    System.out.println("输入有误，请重新输入!");
                    legal = false;
                    break;
            }
            if(!legal) {
                continue;
            }
            if(!isExit) {
                System.out.println("输入0返回：");
                num = in.nextInt();
            }else {
                break;
            }
        }
        in.close();
    }


//        System.out.print("请输入一个字母：");
//        char a = in.next().charAt(0);
//        //小写字母的值范为97-122
//        //大写字母的值范65-90
//        if (a >= 97 && a <= 122) {//判断是否是小写字母
//            System.out.println("你输入的是小写字母.");
//            a = (char)(a - 32);//如果是小写则转为大写
//            System.out.println("该字母的大写字母是:"+a);
//        } else {
//            System.out.println("该字母是大写字母。");
//        }
//    }
}
