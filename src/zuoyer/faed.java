package zuoyer;

import java.util.Arrays;

public class faed {
    public static void main(String[] args) {
//        int a[]={68,45,72,56,94,12};
//        System.out.println("******冒泡排序前*****");
//        System.out.println(Arrays.toString(a));
//        for (int i = 0; i <a.length-1; i++) {
//            for (int j = 0; j <a.length-1-i ; j++) {
//                if (a[j] > a[j + 1]) {
//                    int tem = a[j];
//                    a[j] = a[j + 1];
//                    a[j + 1] = tem;
//                }
//            }
//        }
//        System.out.println("*****冒泡排序后*****");
//        System.out.println(Arrays.toString(a));


        System.out.println("-----equals(a,b)------");
        int a[]={45,56,89,48};
        int b[]={45,56,89,48};
        int c[]={35,54,49,78};
        System.out.println("判断两位数组是否相等");
        System.out.println("a与b:"+Arrays.equals(a,b));
        System.out.println("a与c:"+Arrays.equals(a,c));
        System.out.println();
        System.out.println("-----toString(a)-----");
        System.out.println("将a数组转换成字符串:"+Arrays.toString(a));
        System.out.println();
        System.out.println("-----fill(d,val)-----");
        int d[]={10,90,40,50};
        Arrays.fill(d,88);
        System.out.println("将d的数组元素替换成新的内容："+Arrays.toString(d));
        Arrays.fill(a,2,3,99);
        System.out.println("将a的数组元素下标2-3之间的数替换成新的内容："+Arrays.toString(a));
        System.out.println();
        System.out.println("-----copyOf(e,length)-----");
        int e[]={45,47,89,62};
        int f[]=Arrays.copyOf(e,4);
        int g[]=Arrays.copyOf(e,3);
        int j[]=Arrays.copyOf(e,6);
        System.out.println("将e中的数组元素复制到f新的数组："+Arrays.toString(f));
        System.out.println("将e中的数组元素复制到g新的数组："+Arrays.toString(g));
        System.out.println("将e中的数组元素复制到j新的数组："+Arrays.toString(j));
        System.out.println();
        System.out.println("-----binarySearch(k,val)-----");
        int k[]={12,45,23,85};
        Arrays.sort(k);
        int inr=Arrays.binarySearch(k,99);
        System.out.println("查询排序后12的下标是："+inr);
    }
}
