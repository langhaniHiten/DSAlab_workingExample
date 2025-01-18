public class SecondMaxValue {
    public static void main(String[] args) {
        int[] array = {7, 2, 3, 5, 1, 4};
        int secondMax = findSecondMax(array);
        if (secondMax == Integer.MIN_VALUE) {
            System.out.println("Array does not have a second maximum value.");
        } else {
            System.out.println("The second maximum value is: " + secondMax);
        }
    }
    public static int findSecondMax(int[] array) {
        if (array.length < 2) {
            return Integer.MIN_VALUE;
        }
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int num : array) {
            if (num > max) {
                secondMax = max;
                max = num;
            } else if (num > secondMax && num < max) {
                secondMax = num;
            }
        }
        return secondMax;
    }
}
