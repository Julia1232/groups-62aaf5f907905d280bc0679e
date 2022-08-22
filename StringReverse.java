public class StringReverse {
    public static void main(String[] args) {
        stringReverse("java");
    }

    static void stringReverse(String str) {
        String reversedString = new StringBuffer(str).reverse().toString();
        System.out.println(reversedString);
        return;
    }
}
