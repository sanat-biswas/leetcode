package leetcode;

import java.util.Arrays;
import java.util.List;

public class RunningSum {

    public static void main(String[] args) {

        int[] nums = new int[]{1, 2, 3, 4, 5};

        int[] sum = runningSum(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(sum[i] + " ");
        }
        System.out.println();

    }

    public static int[] runningSum(int[] nums) {
        int[] sumArray = new int[nums.length];

        sumArray[0] = nums[0];
        for(int i = 1; i < nums.length; i++) {
            sumArray[i] = sumArray[i - 1] + nums[i];
        }

        return sumArray;
    }
}
