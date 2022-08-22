public class IsPalindrome {
    public static void main(String[] args) {
        isPalindrome("java");
    }

    public static void isPalindrome(String myString) {
        StringBuffer buffer = new StringBuffer(myString);
        buffer.reverse();
        String data = buffer.toString();
        if (myString.equals(data)) {
            System.out.println(myString + " - true");
        } else {
            System.out.println(myString + " - false");
        }
    }
}
