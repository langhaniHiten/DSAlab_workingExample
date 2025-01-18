import java.util.Arrays;
public class SortedArray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        System.out.println("Original array:"  +Arrays.toString(arr));
        int keyToSearch = 30;
        int searchResult = binarySearch(arr, keyToSearch);
        System.out.println("Search result for " + keyToSearch + ": " + (searchResult != -1 ? "Found at index " + searchResult : "Not found"));
        int elementToInsert = 35;
        arr = insertElement(arr, elementToInsert);
        System.out.println("Array after inserting " + elementToInsert + ": " + Arrays.toString(arr));
        int elementToDelete = 40;
        arr = deleteElement(arr, elementToDelete);
        System.out.println("Array after deleting " + elementToDelete + ": " + Arrays.toString(arr));
    }
    public static int binarySearch(int[] arr, int key) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) /2;
            if (arr[mid] == key) {
                return mid;
            }
            if (arr[mid] < key) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
    public static int[] insertElement(int[] arr, int element) {
        int n = arr.length;
        int[] newArr = new int[n + 1];
        int i = 0;
        while (i < n && arr[i] < element) {
            newArr[i] = arr[i];
            i++;
        }
        newArr[i] = element;
        while (i < n) {
            newArr[i + 1] = arr[i];
            i++;
        }
        return newArr;
    }
    public static int[] deleteElement(int[] arr, int element) {
        int n = arr.length;
        int indexToDelete = binarySearch(arr, element);
        if (indexToDelete == -1) {
            System.out.println("Element " + element + " not found in the array.");
            return arr;
        }
        int[] newArr = new int[n - 1];
        for (int i = 0, j = 0; i < n; i++) {
            if (arr[i] != element) {
                newArr[j++] = arr[i];
            }
        }
        return newArr;
    }
}
