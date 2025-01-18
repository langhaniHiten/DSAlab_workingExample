import java.util.Scanner;
class SumOFNaturalNumber {
    public static void main(String[] args) {
        System.out.println("Enter an number");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 1; i < 11; i++) {
            System.out.println(i * n);
        }
    }
}
