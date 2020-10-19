package zuoyer;

import java.util.Arrays;

public class kkk {
    public static void main(String[] args) {
//        for(int i=1;i<=9;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print(j+"*"+i+"="+i*j+"\t");
//            }
//            System.out.println();
//
//        }
//    }

//
        int a[] = {12, 25, 89, 47, 65};
        System.out.println("冒泡排序前：");
        System.out.println(Arrays.toString(a));
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] < a[j + 1]) {
                    int tem = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tem;
                }
            }
        }
        System.out.println("冒泡排序后：");
        System.out.println(Arrays.toString(a));


//        int b[] = {45, 56, 78, 21, 45, 36, 12, 4};
//        System.out.println("*********冒泡排序前**********");
//        System.out.println(Arrays.toString(b) + "\t");
//        for (int i = 0; i < b.length; i++) {
//            for (int j = 0; j < b.length - 1 - i; j++) {
//                if (b[j] < b[j + 1]) {
//                    int tem = b[j];
//                    b[j] = b[j + 1];
//                    b[j + 1] = tem;
//                }
//            }
//        }
//        System.out.println("*********冒泡排序后**********");
//        System.out.println(Arrays.toString(b));
    }
}
