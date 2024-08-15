public class SqrtX { // x的平方根
    public static void main(String[] args) {
        System.out.println(bf(6)); // 暴力算法
        System.out.println(binarySearch(6)); // 二分法
        System.out.println(newton(6)); // 牛顿迭代
    }

    private static int bf(int x) { // 暴力算法
        if (x < 0) {
            throw new IllegalArgumentException("num must be non-negative.");
        }
        int i = 0;
        while (true) {
            if ((long) i * i > x) {
                return i - 1;
            }
            i++;
        }
    }

    private static int binarySearch(int x) { // 二分查找
        int index = -1, l = 0, r = x;
        while (l <= r){
            int mid = l + (r - l)/2;
            if (mid * mid <= x){
                index = mid;
                l = mid + 1;
            }else {
                r = mid - 1;
            }
        }
        return index;
    }

    // 牛顿迭代
    private static int newton(int x) {
        if (x <= 0) {
            throw new IllegalArgumentException("num must be non-negative.");
        }
        return (int) sqrt(x, x);
    }

    // 递归函数
    public static double sqrt(double i, int x){
        double res = (i + x/i)/2;
        if (res == i){
            return i;
        }else {
            return sqrt(res, x);
        }
    }

}
