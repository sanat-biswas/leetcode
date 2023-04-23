package arrays;

public class ArrayReverseRecursive {

    public static void main(String[] args) {
       int[] arr = {1, 2, 3};

       reverseArray(arr, 0, arr.length - 1);

       printArray(arr, arr.length);
    }

    public static void reverseArray(int[] arr, int start, int end) {

        if(start >= end)
            return;

        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        reverseArray(arr, start + 1, end - 1);
    }

    public static void printArray(int[] arr, int size) {
        for(int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
