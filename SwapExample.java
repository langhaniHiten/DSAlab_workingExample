public class SwapExample {
    int a;
    int b;
    public SwapExample(int a,int b) {
        this.a = a;
        this.b = b;
    }
    public void swap() {
        a=a +b;
        b=a -b;
        a=a -b;
    }
    @Override
    public String toString() {
        return "a ="+ a+ ",b =" +b;
    }
    public static void main(String[] args) {
        SwapExample example1 = new SwapExample(10, 20);
        System.out.println("Before swapping:" +example1);
        example1.swap();
        System.out.println("After swapping:" +example1);
    }
}
