package Part_02_02_OOP.ch15;

public class TaxiTest {
    public static void main(String[] args) {
        Passenger passenger = new Passenger("Edward", 20000);
        Taxi taxi = new Taxi("잘나간다 운수");

        passenger.rideTaxi(taxi, 10000);
    }
}
