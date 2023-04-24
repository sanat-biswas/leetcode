package arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 10, 40};
        int x = 10;

        int result = search(arr, x);
        if(result == -1)
            System.out.println("element not present in the array");
        System.out.println("element found at index " + result);
    }

    /**
     * linear search
     *
     * @param arr Arrays
     * @param x   integer
     * @return integer
     */
    public static int search(int[] arr, int x) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }
}
