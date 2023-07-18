package Part_02_OOP.ch14;

public class StudentExample {

    String studentName;
    int grade;
    int money;

    public StudentExample(String studentName, int money) {
        this.studentName = studentName;
        this.money = money;
    }

    public void takeBus(BusExample bus) {
        bus.take(1000);
        this.money -= 1000;
    }

    public void takeSubway(SubwayExample subway) {
        subway.take(1200);
        this.money -= 1200;
    }

    public void showInfo() {
        System.out.println(studentName +"님의 남은 돈은 " + money + "원 입니다");
    }
}
