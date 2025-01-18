import java.util.Scanner;
public class LeftRightDiagonalSum {
    public static int leftDiagonalSum(int[][] matrix, int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += matrix[i][i];
        }
        return sum;
    }
    public static int rightDiagonalSum(int[][] matrix, int n) {
        int sum = 0;
        for (int i =0; i <n; i++) {
            sum += matrix[i][n - i - 1];
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);;
        int n = scanner.nextInt();
        int[][] matrix = new int[n][n];
        System.out.println("Enter the elements of the matrix");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Element at position(" + i + "," + j + "): ");
                matrix[i][j] = scanner.nextInt();
            }
        }
        int leftSum = leftDiagonalSum(matrix, n);
        int rightSum = rightDiagonalSum(matrix, n);
        System.out.println("Left Diagonal Sum" +leftSum);
        System.out.println("Right Diagonal Sum" +rightSum);
        scanner.close();
    }
}

