public class Main {
    public static void main(String[] args) {
        Car carOne = new Car ("Daewoo", "Matiz", 4, 60, 0.8);
        Car carTwo = new Car ("Mazda", "Miata", 2, 131, 2.0);
        Car carThree = new Car ("Lamborghini", "Revuelto", 2, 1015, 6.5);
        System.out.println(carOne.outputInfo());
        System.out.println(carTwo.outputInfo());
        System.out.println(carThree.outputInfo());
        System.out.println(carOne.drive());
    }
}