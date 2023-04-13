package leetcode;

public class PivotIndex {

    public static void main(String[] args) {

        int[] nums = new int[]{1, 7, 3, 6, 5, 6};

        int pivot = pivotIndex(nums);
        System.out.println(pivot);
    }

    /**
     * Given an array of integers nums, calculate the pivot index of this array.
     * <p>
     * The pivot index is the index where the sum of all the numbers strictly to the left of the index is equal to the sum of all the numbers strictly to the index's right.
     * <p>
     * If the index is on the left edge of the array, then the left sum is 0 because there are no elements to the left. This also applies to the right edge of the array.
     * <p>
     * Return the leftmost pivot index. If no such index exists, return -1.
     *
     * @param nums
     * @return
     */
    public static int pivotIndex(int[] nums) {

        //brute force method
//        if(nums == null || nums.length < 3) {
//            return -1;
//        }
//
//        for (int i = 0; i < nums.length; i++) {
//            int left = i - 1, right = i + 1;
//            int leftSum = 0, rightSum = 0;
//
//            while (left >= 0) {
//                leftSum += nums[left--];
//            }
//
//            while (right < nums.length) {
//                rightSum += nums[right++];
//            }
//
//            if (leftSum == rightSum) {
//                return i;
//            }
//        }

        int sum = 0, leftSum = 0;

        for(int x : nums) {
            sum += x;
        }

        for(int i = 0; i < nums.length; i++) {
            if(leftSum == (sum - leftSum - nums[i])) {
                return i;
            }
            leftSum += nums[i];
        }

        return -1;
    }
}
