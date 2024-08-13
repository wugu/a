public class SuShu {
    public static void main(String[] args) {
        System.out.println(bf(100));
        System.out.println(eratosthenes(100));
    }

    // 暴力算法
    public static int bf(int n){
        int count = 0;
        for (int i = 2; i < n; i++){
            count += isPrime(i) ? 1 : 0;
        }
        return count;
    }

    // 埃筛法
    public static int eratosthenes(int n){
        boolean[] isPrime = new boolean[n]; // 默认都是false，代表素数
        int count = 0;
        for (int i = 2; i < n; i++){
            if (!isPrime[i]){
                count ++;
                for (int j = 2 * i; j < n; j+=i){// j就是合数的标记位  j+=i 表示将i进行递增
                    //可以优化为int j = i * i; j < n; j+=i
                    isPrime[j] = true;
                }
            }
        }
        return count;
    }

    private static boolean isPrime(int x) {
        for (int i = 2; i <= Math.sqrt(x); i++){ // 小于根号x就行，因为乘法交换律，以遍减少循环次数
        // for (int i = 2; i * i<= x; i++)
            if (x % i == 0){
                return false;
            }
        }
        return true;
    }
}
