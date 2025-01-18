public class ArrayOperation {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("Original Array ");
        printArray(array);
        array = addElement(array, 6);
        System.out.println("After adding 6");
        printArray(array);
        array[2] = 10;
        System.out.println("After editing index 2 to 10: ");
        printArray(array);
        array = deleteElement(array, 3);
        System.out.println("After deleting element at index 3: ");
        printArray(array);
    }
    public static int[] addElement(int[] array, int newElement) {
        int[] newArray = new int[array.length + 1];
        System.arraycopy(array, 0, newArray, 0, array.length);
        newArray[newArray.length - 1] = newElement;
        return newArray;
    }
    public static int[] deleteElement(int[] array, int indexToDelete) {
        if (indexToDelete < 0 || indexToDelete >= array.length) {
            System.out.println("Invalid index");
            return array;
        }
        int[] newArray = new int[array.length - 1];
        for (int i = 0, j = 0; i < array.length; i++) {
            if (i != indexToDelete) {
                newArray[j++] = array[i];
            }
        }
        return newArray;
    }
    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
