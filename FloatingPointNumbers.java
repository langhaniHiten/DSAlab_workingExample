import java.util.Scanner;
public class FloatingPointNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first floating-point number:\n");
        float num1 = scanner.nextFloat();
        System.out.print("Enter the second floating-point number:\n");
        float num2 = scanner.nextFloat();
        if (Math.round(num1 * 1000.0) == Math.round(num2 * 1000.0)) {
            System.out.println("The numbers are the same up to three decimal places.");
        } else {
            System.out.println("The numbers are different up to three decimal places.");
        }
        scanner.close();
    }
}
