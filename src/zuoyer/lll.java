package zuoyer;

import java.util.Arrays;
import java.util.Scanner;

public class lll {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
//        String[]names={"Angelia","Alice","tome","sam","Jack","Ruby","Robin","Anne"};
//        System.out.println(Arrays.toString(names));
//        System.out.print("请输入要修改的元素：");
//        String a=in.next();
//        int b=-1;
//        for (int i = 0; i <names.length ; i++) {
//            if (a.equalsIgnoreCase(names[i])){
//                b=i;
//            }
//        }
//        System.out.println("修改的下标是"+b);
//        System.out.print("输入你要修改的内容：");
//        String xiu=in.next();
//        if (b!=-1){
//            names[b]=xiu;
//        }else {
//            System.out.println("抱歉没有你要修改的名字！");
//        }
//        System.out.print("修改后人员姓名是：");
//        for (int i = 0; i < names.length-1; i++) {
//            System.out.print(names[i]+"\t");
//        }



        String[]names={"Angelia","Alice","tome","sam","Jack","Ruby","Robin","Anne"};
        System.out.println(Arrays.toString(names));
        System.out.print("请输入查找的元素：");
        String a=in.next();
        int b=-1;
        for (int i = 0; i <names.length ; i++) {
            if (a.equalsIgnoreCase(names[i])){
                b=i;
            }
        }
        if (b!=-1){
            System.out.println("找到了！");
            System.out.println("查的下标是"+b);
        }else {
            System.out.println("未找到！");
        }


    }
}
