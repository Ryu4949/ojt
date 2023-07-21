package Part_02_02_OOP.ch08;


public class ReviewTest {
    public static void main(String[] args) {
        UserRepeat userTomas = new UserRepeat("Tomas", 37, 180, 78);
        System.out.println(userTomas.showUserInfo());
        System.out.println("----------------------------------------");

        Order orderInfo = new Order("202011020003", "01023450001", "서울시 강남구 역삼동 111-333", "20201102", "130258", 35000, "0003");
        System.out.println(orderInfo.showOrderInfo());
    }

}
