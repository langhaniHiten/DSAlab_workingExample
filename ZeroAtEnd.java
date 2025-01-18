import java.util.Arrays;
public class ZeroAtEnd {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 0, 4, 3, 0};
        System.out.println("Original Array" + Arrays.toString(arr));
        moveZeroes(arr);
        System.out.println("Array after moving zeroes: " + Arrays.toString(arr));
    }
    public static void moveZeroes(int[] arr) {
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[index++] = arr[i];
            }
        }
        while (index < arr.length) {
            arr[index++] = 0;
        }
    }
}
