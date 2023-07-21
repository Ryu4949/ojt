package Part_02_02_OOP.ch14;

public class BusExample {

    int busNumber;
    int passengerCount;
    int money;

    public BusExample(int busNumber) {
        this.busNumber = busNumber;
    }

    public void take(int money) {  //승차
        this.money += money;
        passengerCount++;
    }

    public void showBusInfo() {
        System.out.println(busNumber + "번 버스의 승객은 " + passengerCount + "명 이고, 수입은 " + money + "원 입니다");
    }
}

