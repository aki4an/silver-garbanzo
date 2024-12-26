public class Car {
    public String brand;
    public String model;
    public int numberOfSeat;
    public int horsePower;
    public double engineCapacity;

    public Car(String brand, String model, int numberOfSeat, int horsePower, double engineCapacity) {
        this.brand = brand;
        this.model = model;
        this.numberOfSeat = numberOfSeat;
        this.horsePower = horsePower;
        this.engineCapacity = engineCapacity;
    }

    public String outputInfo() {
        return String.format("Brand: %s \nModel: %s \nNumber of seat: %d \nHorse power: %d \nEngine capacity: %s",
                brand, model, numberOfSeat, horsePower, engineCapacity);
    }

    public String drive() {
        return String.format("vroom-vroom, come sit in my %s %s", brand, model);
    }
}
