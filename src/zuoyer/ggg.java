package zuoyer;

import java.util.Scanner;

public class ggg {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        String caim[] = new String[4];
        int hao[] = new int[]{1, 2, 3, 4};                       //菜品序号
        String caiName[] = new String[]{"鱼香肉丝", "红烧鸡腿", "可乐鸡翅", "土豆烧肉"};             //显示的菜名
        double jge[] = new double[]{15.5, 16.0, 15.2, 12.0};                                    //价格
        int dian[] = new int[4];                      //点赞


        String Names[] = new String[4];               //订餐人姓名
        int time[] = new int[4];                      //订餐时间
        String diz[] = new String[4];                 //订餐地址
        double jine[] = new double[4];                //总金额
        int zTai[] = new int[4];

        boolean tiao = false;                         //跳出循环
        int fanh = -1;                                  //返回界面

        do {
            System.out.println("欢迎使用“吃货联盟订餐系统”");
            System.out.println("****************************************");
            System.out.println("1.我要订餐");
            System.out.println("2.查看餐袋");
            System.out.println("3.签收订单");
            System.out.println("4.删除订单");
            System.out.println("5.我要点赞");
            System.out.println("6.退出系统");
            System.out.println("****************************************");
            System.out.print("请选择：");
            int a = in.nextInt();
            switch (a) {
                case 1:
                    System.out.println("*******我要订餐******");
                    for (int j = 0; j < Names.length; j++) {
                        if (Names[j] == null) {                 //循环名字下标为空就添加；不然会覆盖
                            System.out.print("请输入订餐人姓名：");
                            String name = in.next();
                            System.out.println("序号\t\t菜名\t\t单价\t\t点赞");
                            for (int i = 0; i < caiName.length; i++) {          //根据菜名下标循环
                                System.out.println(hao[i] + "\t   " + caiName[i] + "\t" + jge[i] + "元" + "\t" + dian[i] + "赞");
                            }
                            System.out.print("请选择你要点的菜品序号：");
                            int caiHao = in.nextInt();
                            System.out.print("请输入你需要的菜品份数：");
                            int fen = in.nextInt();
                            String caiFen = caiName[caiHao - 1] + fen + "份";            //选中的菜品多少份；数组下标减1
                            double caiJa = jge[caiHao - 1] * fen;

                            int soTime = in.nextInt();
                            while (soTime < 7 || soTime > 22) {        //7点到22点的时间判断循环
                                System.out.println("您输入的时间有误，请输入7~22间的整数！");
                                System.out.print("请重新输入送餐时间：");
                                soTime = in.nextInt();
                            }
                            System.out.print("请输入你送餐的地址：");
                            String soDiz = in.next();
                            System.out.println("订餐成功！");
                            System.out.println("您订的是：" + caiFen);
                            System.out.println("送餐时间：" + soTime + "点");
                            System.out.println("总金额：" + caiJa);
                            Names[j] = name;        //给订餐人赋值
                            caim[j] = caiFen;       //给菜品信息赋值
                            time[j] = soTime;       //  送餐日期
                            diz[j] = soDiz;         //  送餐地址
                            jine[j] = caiJa;        //  总金额
                            break;
                        }
                    }
                    break;
                case 2:
                    System.out.println("******查看餐袋******");
                    System.out.println("序号\t\t订餐人\t\t餐品信息\t\t送餐日期" +
                            "\t\t送餐地址\t\t\t总金额\t\t订单状态");
                    for (int i = 0; i < Names.length; i++) {
                        String Ztai = (zTai[i] == 0) ? "配送中" : "已送达";//循环的状态等于0就是配送中，不然就是已送达
                        if (Names[i] != null) {
                            System.out.println((i + 1) + "\t\t" + Names[i] + "\t\t\t" + caim[i] + "\t"
                                    + time[i] + "小时" + "\t\t" + diz[i] + "\t\t" + jine[i]
                                    + "元" + "\t\t" + Ztai);
                        }
                    }
                    break;
                case 3:
                    System.out.println("*******签收订单*******");
                    System.out.print("请输入你要签收订单序号：");
                    int xHao = in.nextInt();
                    for (int i = 0; i < Names.length; i++) {
                        if (Names[i] != null && xHao == i + 1 && zTai[i] == 0) {
                            //判断名字不为空和输入序号加1（数组坐标从0开始所以加1），欢迎状态为配送中
                            zTai[i] = 1;//判断修改为已送达
                            System.out.println("你的订单已送达！");
                            break;
                        } else if (Names[i] != null && xHao == i + 1 && zTai[i] == 1) {
                            //判断名字不为空和输入序号加1（数组坐标从0开始所以加1），欢迎状态为配送中
                            System.out.println("你的订单已签收，不能重复签收！");
                            break;
                        }
                        if (Names[i] == null) {
                            System.out.println("你输入的订单不存在！");
                            break;
                        }
                    }
                    break;
                case 4:
                    System.out.print("输入你要删除的订单序号：");
                    int sHao = in.nextInt();
                    for (int i = 0; i < Names.length; i++) {
                        if (Names[i] != null && sHao == i + 1 && zTai[i] == 1) {    //判断必须是已送达的
                            for (int j = sHao - 1; j < Names.length - 1; j++) {     //输入序号是从1开始所以减一；数组下标减1类似重1开始
                                Names[j] = Names[j + 1];
                                caim[j] = caim[j + 1];
                                time[j] = time[j + 1];
                                diz[j] = diz[j + 1];
                                jine[j] = jine[j + 1];
                                zTai[j] = zTai[j + 1];
                            }
                            int sBao = Names.length - 1;
                            Names[sBao] = null;
                            caim[sBao] = null;
                            time[sBao] = 0;
                            diz[sBao] = null;
                            jine[sBao] = 0;
                            zTai[sBao] = 0;
                            System.out.println("订单已删除！");
                            break;
                        } else if (Names[i] != null && sHao == i + 1 && zTai[i] == 0) {
                            System.out.println("您选择的订单未签收，不能删除！");
                            break;
                        } else {
                            System.out.println("你要删除的订单不存在！");
                            break;
                        }
                    }
                    break;
                case 5:
                    System.out.println("******我要点赞******");
                    System.out.println("序号\t\t菜名\t\t单价\t\t点赞");
                    for (int i = 0; i < caim.length; i++) {
                        System.out.println(hao[i] + "\t   " + caiName[i] + "\t" +
                                jge[i] + "元" + "\t" + dian[i] + "赞");
                    }
                    System.out.print("输入餐品序号：");
                    int dZan = in.nextInt();
                    if (dZan > Names.length || dZan <= 0) {
                        System.out.println("输入正确的菜品序号！");
                        break;
                    }
                    dian[dZan - 1]++;
                    System.out.println("点赞成功！");
                    break;
                case 6:
                    break;
                    default:
                        System.out.println("输入错误，请重新输入！");
                        break;
            }
            if(a==6){
                break;              //退出系统
            }
            if (tiao != true) {
                System.out.print("输入0返回:");
                fanh = in.nextInt();
            }
        } while (fanh == 0);
    }
}
