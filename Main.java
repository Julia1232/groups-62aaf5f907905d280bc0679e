public class Main {
    public static void main(String[] args) {
        Dog Simon = new Dog();
        Simon.name = "Simon";
        Simon.dogRun(140);
        Simon.swim(5);
        int simonDog = 1;

        Dog Dex = new Dog();
        Dex.name = "Dex";
        Dex.dogRun(100);
        Dex.swim(7);
        int dexDog = 1;

        Cat Bars = new Cat();
        Bars.name = "Bars";
        Bars.catRun(44);


        Cat Soni = new Cat();
        Soni.name = "Soni";
        Soni.catRun(30);

        int summDog = simonDog + dexDog;
        System.out.println("Всего собак, которые принимают участия - " + summDog);
    }
}
