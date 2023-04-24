package arrays;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 10, 40};

        int x = 10;
        int result = binarySearch(arr, x);
        if(result == -1)
            System.out.println("Element not present in the array");
        System.out.println("Element found at index " + result);
    }

    public static int binarySearch(int[] arr, int x) {

        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;

            if (arr[mid] == x)
                return mid;
            if (arr[mid] < x)
                l = mid + 1;
            else
                r = mid - 1;
        }
        return -1;
    }
}
