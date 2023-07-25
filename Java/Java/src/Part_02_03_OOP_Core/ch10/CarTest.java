package Part_02_03_OOP_Core.ch10;

public class CarTest {
    public static void main(String[] args) {
        Car aiCar = new AICar();
        aiCar.run();
        System.out.println("------------------------------------");
        Car manualCar = new ManualCar();
        manualCar.run();
    }
}
