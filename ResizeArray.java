import java.util.Arrays;
public class ResizeArray {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5};
        System.out.println("Original Array: " + Arrays.toString(originalArray));
        int newSize = 8;
        int[] resizedArray = resizeArray(originalArray, newSize);
        System.out.println("Resized Array: " + Arrays.toString(resizedArray));
    }
    public static int[] resizeArray(int[] oldArray, int newSize) {
        int[] newArray = new int[newSize];
        for (int i = 0; i < oldArray.length; i++) {
            newArray[i] = oldArray[i];
        }
        return newArray;
    }
}
