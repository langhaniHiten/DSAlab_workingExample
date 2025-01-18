public class Minvalue{
    public static void main(String[] args) {
        int[] array = {7, 2, 3, 5, 8, 4};
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("The minimum value is: " +min);
    }
}
