import java.util.Scanner;

public class FindWordPosition {
    public static void main(String[] args) {
        String str = "java";
        String reversedString = new StringBuffer(str).reverse().toString();
        System.out.println(reversedString);
        strRecursion();
        findWordPosition();
    }
    public static void strRecursion() {
        String myString = "java";
        StringBuffer buffer = new StringBuffer(myString);
        buffer.reverse();
        String data = buffer.toString();
        if (myString.equals(data)) {
            System.out.println(myString + "- true");
        } else {
            System.out.println(myString + "- false");
        }
    }
    public static void findWordPosition() {
        System.out.println("Проверка является ли target частью строки source, введите вначале Source, потом Targe:");
        Scanner scanner = new Scanner(System.in);
        String source = scanner.next();
        System.out.println("Source - " + source);
        String target = scanner.next();
        System.out.println("Target - " + target);
        boolean a = source.contains(target);
        if (a = true) {
            System.out.println("Result: 1");
        } else {
            System.out.println("Result: -1");
        }
    }
}
