public class ArrangeCoin {  // 排列硬币
    public static void main(String[] args) {
        System.out.println(arrangeCoins(10));
        System.out.println(arrangeCoins2(10));
        System.out.println(arrangeCoins3(10));
    }

    private static int arrangeCoins(int n) { // 迭代
        for (int i = 1; i <= n; i++){
            n = n - i; // 剩下的硬币
            if (n <= i){
                return i;
            }
        }
        return 0;
    }

    private static int arrangeCoins2(int n) { // 二分查找
        int low = 0, high = n;
        while (low <= high){
            int mid = (high - low)/2 +low;
            int cost = ((mid + 1) * mid)/2;
            if (cost == n){
                return mid;
            }else if (cost > n){
                high = mid - 1;
            }else {
                low = mid + 1;
            }
        }
        return high;
    }

    private static int arrangeCoins3(int n) { // 牛顿迭代
        if (n == 0){
            return 0;
        }
        return (int) sqrt(n, n);
    }

    private static double sqrt(double x, int n) { // 解  数量
        double res = (x + (2*n - x)/x)/2;
        if (res == x){
            return x;
        }else {
            return sqrt(res, n);
        }
    }
}
