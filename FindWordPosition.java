import java.util.Scanner;

public class FindWordPosition {
    public static void main(String[] args) {
        findWordPosition("Apollo", "pollo");
    }
    public static void findWordPosition(String source, String target) {
        System.out.println("Проверка является ли target частью строки source, введите вначале Source, потом Target:");
        System.out.println("Source - " + source);
        System.out.println("Target - " + target);
        int value = source.indexOf(target);
        System.out.println(value);
    }
}
