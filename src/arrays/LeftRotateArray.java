package arrays;

public class LeftRotateArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int d = 3;
        rotateArray(arr, d);
        printArray(arr, arr.length);
    }

    /**
     * left rotating the array
     *
     * @param arr Array
     * @param d   integer the number of rotation
     */
    public static void rotateArray(int[] arr, int d) {
        int[] temp = new int[arr.length];

        int k = 0;

        //for storing the elements after d in temp
        for (int i = d; i < arr.length; i++) {
            temp[k] = arr[i];
            k++;
        }

        // for storing the d elements in temp
        for (int i = 0; i < d; i++) {
            temp[k] = arr[i];
            k++;
        }

        // for copying all the elements from temp to original array
        System.arraycopy(temp, 0, arr, 0, arr.length);
    }

    /**
     * for printing the array
     *
     * @param arr  Array
     * @param size integer
     */
    public static void printArray(int[] arr, int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
