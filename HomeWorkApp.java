public class HomeWorkApp {
    public static void main(String[] args) {
        checkSumSign();
        printThreeWords();
        printColor();
        count();
        compareNumbers();
        negativePositive();
        trueFalse();
        method9();
        year(2020);
    }

    static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    static void checkSumSign() {
        int a = 76;
        int b = 59;
        int c = a + b;
        if (c >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    static void printColor() {
        int value = 79;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value <= 100 && value >= 0) {
            System.out.println("Желтый");
        } else if (value > 100) {
            System.out.println("Зеленый");
        }
    }

    static void count() {
        int a = 5;
        int b = 13;
        int c = a + b;
        if (c <= 20 && c >= 10) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    static void compareNumbers() {
        int a = 4;
        int b = 12;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    static void negativePositive() {
        int a = 100;
        if (a >= 0) {
            System.out.println("positive");
        } else {
            System.out.println("negative");
        }
    }

    static void trueFalse() {
        int a = 46;
        boolean b = a > 0;
        System.out.println(b);
    }

    static void method9() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Hello world!");
        }
    }

    static void year(int year) {
        if (year % 100 == 0 && year % 400 == 0 && year % 100 == 0) {
            System.out.println("Высокосный");
        } else {
            System.out.println("Невысокосный");
        }
    }
}


