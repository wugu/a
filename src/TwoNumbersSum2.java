import java.util.Arrays;

public class TwoNumbersSum2 { // 两数之和，返回数组下标，有序数组
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSearch(new int[]{1,2,3,4,5,6}, 10)));
        System.out.println(Arrays.toString(twoPoint(new int[]{1,2,3,4,5,6}, 10)));
    }

    private static int[] twoPoint(int[] nums, int target) {// 双指针
        int low = 0, high = nums.length - 1;
        while (low < high){
            int sum = nums[low] + nums[high];
            if (sum == target){
                return new int[]{low, high};
            }else if (sum > target){
                high--;
            }else {
                low++;
            }
        }
        return new int[0];
    }

    private static int[] twoSearch(int[] nums, int target) {// 二分查找
        for (int i = 0; i < nums.length; i++){
            int low = i, high = nums.length - 1;
            while (low <= high){
                int mid = (high - low)/2 + low;
                if (nums[mid] == target - nums[i]){
                    return new int[]{i, mid};
                }else if (nums[mid] > target - nums[i]){
                    high = mid - 1;
                }else {
                    low = mid + 1;
                }
            }
        }
        return new int[0];
    }
}
