package arrays;

public class ArrayReverse {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        printArray(arr, arr.length);

        reverseArray(arr, 0, arr.length - 1);

        printArray(arr, arr.length);
    }


    /**
     * for reversing the array
     * @param arr Array
     * @param start integer
     * @param end integer
     */
    public static void reverseArray(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    /**
     * for printing the array
     * @param arr Array
     * @param size integer
     */
    public static void printArray(int[] arr, int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
