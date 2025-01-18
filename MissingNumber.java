public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 3, 7, 8};
        int missingNumber = findMissingNumber(arr);
        System.out.println("The missing number is"  +missingNumber);
    }
    public static int findMissingNumber(int[] arr) {
        int n = arr.length + 1;
        int sumExpected = n * (n + 1) / 2;
        int sumActual = 0;
        for (int num : arr) {
            sumActual += num;
        }
        return sumExpected - sumActual;
    }
}
