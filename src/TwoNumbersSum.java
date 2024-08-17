import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoNumbersSum { // 两数之和，返回数组下标，无序数组
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1,2,3,4,5,6}, 10)));
        System.out.println(Arrays.toString(solution1(new int[]{1,2,3,4,5,6}, 10)));
    }

    private static int[] solution(int[] nums, int target) { // 暴力算法
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++){
                if (nums[i] + nums[j] == target){
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }

    private static int[] solution1(int[] nums, int target) { // 通过map存储标记
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])){
                return new int[]{map.get(target - nums[i]), i};
            }
            map.put(nums[i], i);
        }
        return new int[0];
    }
}
