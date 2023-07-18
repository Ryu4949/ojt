package Part_02_OOP.ch14;

public class Student {

    String studentName;
    int studentMoney;

    public Student(String studentName, int studentMoney) {
        this.studentName = studentName;
        this.studentMoney = studentMoney;
    }

    public void rideBus(Bus bus) {
        if(studentMoney >= bus.busFee) {
            studentMoney -= bus.busFee;
            System.out.println(studentName + " 학생이 " + bus.busNumber + "번 버스에 탑승하여 " + bus.busFee + "원을 지불하고 " + studentMoney + "원이 남았습니다.");
        } else {
            System.out.println("잔액이 부족하여 탈 수 없습니다.");
        }

    }

    public void rideSubway(Subway subway) {
        if(studentMoney >= subway.subwayFee) {
            studentMoney -= subway.subwayFee;
            System.out.println(studentName + " 학생이 " + subway.subwayColor + "색 지하철에 탑승하여 " + subway.subwayFee + "원을 지불하고 " + studentMoney + "원이 남았습니다.");

        } else {
            System.out.println("잔액이 부족하여 탈 수 없습니다.");
        }
    }


}
