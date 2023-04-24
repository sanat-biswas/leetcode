package arrays;

public class BinarySearchRecursive {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 10, 40};

        int x = 80;

        int result = binarySearch(arr, 0, arr.length - 1, x);
        if(result == -1) {
            System.out.println("Element not found in the array");
        } else {
            System.out.println("Element found at index " + result);
        }

    }

    /**
     * recursive binary search
     *
     * @param arr Array
     * @param l   integer left
     * @param r   integer right
     * @param x   integer value to be searched
     * @return integer
     */
    public static int binarySearch(int[] arr, int l, int r, int x) {
        if (r >= l) {
            int mid = l + (r - l) / 2;

            if (arr[mid] == x)
                return mid;
            if (arr[mid] < x)
                return binarySearch(arr, mid + 1, r, x);
            else
                return binarySearch(arr, l, mid - 1, x);
        }

        return -1;
    }
}
