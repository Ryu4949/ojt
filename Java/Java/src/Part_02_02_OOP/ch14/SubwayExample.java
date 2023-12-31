package Part_02_02_OOP.ch14;

public class SubwayExample {

    int lineNumber;
    int passengerCount;
    int money;

    public SubwayExample(int lineNumber) {
        this.lineNumber = lineNumber;
    }

    public void take(int money) {
        this.money += money;
        passengerCount++;
    }

    public void showSubwayInfo() {
        System.out.println(lineNumber + "번 지하철의 승객은 " + passengerCount + "명 이고, 수입은 " + money + "원 입니다");
    }
}
