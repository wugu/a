import java.util.Arrays;
import java.util.HashMap;

public class ArrayCenterIndex { // 求数组的中心下标 左边元素和=右边元素和
    public static void main(String[] args) {
        System.out.println(pivotIndex(new int[]{1, 7, 3, 6, 5, 6}));
    }

    private static int pivotIndex(int[] nums) {
        HashMap<Object, Object> map = new HashMap<>();
        map.put("1", 1);
        int sum = Arrays.stream(nums).sum();
        int total = 0;
        for (int i = 0; i < nums.length; i++) {
            total += nums[i];
            if (total == sum){
                return i;
            }
            sum = sum - nums[i];
        }
        return -1;
    }
}
