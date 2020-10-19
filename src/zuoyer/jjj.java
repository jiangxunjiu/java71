package zuoyer;

import java.util.Arrays;
import java.util.Scanner;

public class jjj {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        char[] chars = {'a','c','u','b','e','p','f','z'};
//        Arrays.sort(chars);
//        System.out.println(Arrays.toString(chars));
//        System.out.print("输入你要查询的字母：");
//        char a=in.next().charAt(0);
//        int b=Arrays.binarySearch(chars,a);
//        System.out.println("你要查询的字母下标是:"+b);


//        String[] a = new String[5];
//        for (int i = 0;i < a.length; i++){
//            System.out.print("请输入第" + (i + 1) + "水果：");
//            a[i] = in.next();
//        }
//        Arrays.sort(a);
//        System.out.println("这些水果在字典中出现的顺序是：");
//        for (String j:a){
//            System.out.print(j + "\t");
//        }


        int oldArr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 3, 2, 4, 5, 6, 7, 4, 32, 2, 1, 1, 4, 6, 3};
        int a[] = new int[0];
        System.out.println("原来的数组");
        for (int i : oldArr) {
            System.out.print(i + "\t");
        }
        boolean s = false;
        int ind = 0;
        System.out.println();
        for (int i = 0; i < oldArr.length; i++) {
            s = false;
            for (int k = i + 1; k < oldArr.length; k++) {
                if (oldArr[i] == oldArr[k]) {
                    s = true;
                    break;
                }
            }
            if (!s) {
                a = Arrays.copyOf(a, a.length + 1);
                a[ind++] = oldArr[i];
            }
        }
        System.out.println("去重复的数组");
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));


    }
}

