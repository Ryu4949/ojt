package Part_02_02_OOP.ch14;

public class TakeTransTest {

    public static void main(String[] args) {
        StudentExample studentJ = new StudentExample("James", 5000);
        StudentExample studentT = new StudentExample("Tomas", 10000);

        BusExample bus100 = new BusExample(100);

        SubwayExample subwayGreen = new SubwayExample(2);


        studentJ.takeBus(bus100);
        studentT.takeSubway(subwayGreen);

        studentJ.showInfo();
        studentT.showInfo();

        bus100.showBusInfo();

        subwayGreen.showSubwayInfo();
    }

}

