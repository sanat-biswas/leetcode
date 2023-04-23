package arrays;

public class RightRotateArray {

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9};

        rotateArray(arr, 2, arr.length);
    }

    public static void rotateArray(int[] arr, int k, int n) {
        k = k % n;

        for (int i = 0; i < n; i++) {
            if (i < k) {
                System.out.print(arr[n + i - k] + " ");
            } else {
                System.out.print(arr[i - k] + " ");
            }
        }
        System.out.println();
    }
}
