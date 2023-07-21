package Part_02_02_OOP.ch19;

public class CarFactory {

    private int carNumber = 10001;
    private static CarFactory instance = new CarFactory();
    private CarFactory() {
    }

    public static CarFactory getInstance() {
        if (instance == null) {
            instance = new CarFactory();
        }

        return instance;
    }

    public Car createCar() {
        Car newCar = new Car(carNumber++);
        return newCar;
    }
}
