package Part_02_OOP.ch14;

public class TransTest {

    public static void main(String[] args) {
        Student studentJames = new Student("James", 5000);
        Student studentTomas = new Student("Tomas", 10000);

        Bus bus = new Bus(100, 1000);
        Subway subway = new Subway("초록", 1200);

        studentJames.rideBus(bus);
        studentTomas.rideSubway(subway);
    }
}
