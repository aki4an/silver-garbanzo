import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        ArrayList<Car> cars = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Select an action (0 - Exit. 1 - Add car. 2 - Output cars): ");
            n = scanner.nextInt();

            switch (n) {
                case 0:
                    System.out.println("Exit...");
                    break;
                case 1:
                    System.out.print("Select a car (1 - Limousine. 2 - Pickup. 3 - Cabriolet): ");
                    int a = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter brand: ");
                    String valueBrand = scanner.nextLine();
                    System.out.print("Enter model: ");
                    String valueModel = scanner.nextLine();
                    System.out.print("Enter number of seat: ");
                    int valueNumberOfSeat = scanner.nextInt();
                    System.out.print("Enter horse power: ");
                    int valueHorsePower = scanner.nextInt();
                    System.out.print("Enter engine capacity: ");
                    double valueEngineCapacity = scanner.nextDouble();
                    scanner.nextLine();

                    if (a == 1) {
                        System.out.print("Enter body length: ");
                        int valueBodyLength = scanner.nextInt();
                        cars.add(new Limousine(valueBrand, valueModel, valueNumberOfSeat, valueHorsePower,
                                valueEngineCapacity, valueBodyLength));
                    } else if (a == 2) {
                        System.out.print("Enter trunk volume: ");
                        int valueTrunkVolume = scanner.nextInt();
                        cars.add(new Pickup(valueBrand, valueModel, valueNumberOfSeat, valueHorsePower,
                                valueEngineCapacity, valueTrunkVolume));
                    } else if (a == 3) {
                        System.out.print("Enter roof view: ");
                        String valueRoofView = scanner.nextLine();
                        cars.add(new Cabriolet(valueBrand, valueModel, valueNumberOfSeat, valueHorsePower,
                                valueEngineCapacity, valueRoofView));
                    }
                    break;
                case 2:
                    for (Car car : cars) {
                        System.out.println(car);
                    }
                    break;
                default:
                    System.out.println("There is no such action!");
                    break;
            }
        } while (n != 0);
    }
}