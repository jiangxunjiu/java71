package zuoyer;

public class qqq {
    public static int souyer(int[] a, int num) {
        int min = 0;
        int max = a.length - 1;
        for (int i = 0; i < a.length; i++) {
            int sum = (min + max) / 2;
            if (num >= min) {
                min = sum + 1;
            } else if (num < max) {
                max = sum - 1;
            } else {
                return sum;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int a[] = {0, 1, 2, 3, 4, 5, 6, 7};
        int inx = souyer(a, 6);
        System.out.println("二分查找算法测试为：");
        System.out.println("num的下标为：" + inx);
    }
}
