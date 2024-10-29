import java.io.*;

class GFG {
    static void insertElement(int arr[], int n, int x, int pos) {
        if (pos < 0 || pos > n) {
            System.out.println("Invalid position");
            return;
        }
        for (int i = n - 1; i >= pos; i--) {
            arr[i + 1] = arr[i];
        }
        arr[pos] = x;
    }

    public static void main(String[] args) {
        int[] arr = new int[20];
        int n = 5;
        arr[0] = 12;
        arr[1] = 34;
        arr[2] = 10;
        arr[3] = 6;
        arr[4] = 40;

        System.out.println("Array before insertion:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        int x = 26;
        int pos = 2;
        insertElement(arr, n, x, pos);
        n++;

        System.out.println("\n\nArray after insertion:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
