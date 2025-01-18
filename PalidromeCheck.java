public class PalidromeCheck {
    public static void main(String[] args) {
        String str = "kumar";
        boolean isPalindrome = isPalindrome(str);
        if (isPalindrome) {
            System.out.println(str + "is a palindrome.");
        } else {
            System.out.println(str + "is not a palindrome.");
        }
    }
    public static boolean isPalindrome(String str) {
        str = str.toLowerCase();
        String reversedStr = new StringBuilder(str).reverse().toString();
        return str.equals(reversedStr);
    }
}
