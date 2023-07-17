package Part_02_OOP.ch08;

public class Order {

    public String orderNumber;
    public String phoneNumber;
    public String userAddress;
    public String orderDate;
    public String orderTime;
    public int orderPrice;
    public String menuNumber;

    public Order(String orderNumber, String phoneNumber, String userAddress, String orderDate, String orderTime, int orderPrice, String menuNumber) {
        this.orderNumber = orderNumber;
        this.phoneNumber = phoneNumber;
        this.userAddress = userAddress;
        this.orderDate = orderDate;
        this.orderTime = orderTime;
        this.orderPrice = orderPrice;
        this.menuNumber = menuNumber;
    }

    public String showOrderInfo() {
        return "주문 접수 번호 : " + orderNumber + "\n주문 핸드폰 번호 : " + phoneNumber + "\n주문 집 주소 : " + userAddress
                + "\n주문 날짜 : " + orderDate + "\n주문 시간 : " + orderTime + "\n주문 가격 : " + orderPrice + "\n메뉴 번호 : " + menuNumber;
    }

}
