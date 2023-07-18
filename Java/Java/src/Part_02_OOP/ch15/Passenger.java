package Part_02_OOP.ch15;

public class Passenger {

    String passengerName;
    int passengerMoney;

    public Passenger(String passengerName, int passengerMoney) {
        this.passengerName = passengerName;
        this.passengerMoney = passengerMoney;
    }

    public void rideTaxi(Taxi taxi, int taxiCharge) {
        if(taxiCharge > passengerMoney) {
            System.out.println("돈이 부족하여 탑승하지 못했습니다.");
        } else {
            passengerMoney -= taxiCharge;
            taxi.taxiIncome += taxiCharge;

            System.out.println(String.format("%s님의 남은 돈은 %d원 입니다.", passengerName, passengerMoney));
            System.out.println(String.format("%s택시 수입은 %d원 입니다.", taxi.taxiName, taxi.taxiIncome));
        }
    }

}
