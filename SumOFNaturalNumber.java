import java.util.Scanner;
class SumOfNaturalNumbers{
    public static void main(String[] args){
        Scanner Scanner =new Scanner(System.in);
        System.out.println("Enter a positive integer");
        int n=Scanner.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            sum +=i;
        }
        System.out.println("the sum of natural number is"+sum);

    }
}