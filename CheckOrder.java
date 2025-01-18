import java.util.Scanner;
public class CheckOrder{
    public static String checkOrder(int num1, int num2, int num3) {
        if (num1 < num2 && num2 < num3) {
            return "increasing";
        } else if (num1 > num2 && num2 > num3) {
            return "decreasing";
        } else {
            return "Neither increasing nor decreasing order";
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number:\n ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number:\n");
        int num2 = scanner.nextInt();
        System.out.print("Enter the third number:\n");
        int num3 = scanner.nextInt();
        String result = checkOrder(num1, num2, num3);
        System.out.println(result);
        scanner.close();
    }
}
