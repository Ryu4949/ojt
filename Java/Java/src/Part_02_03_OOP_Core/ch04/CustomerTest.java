package Part_02_03_OOP_Core.ch04;

public class CustomerTest {

    public static void main(String[] args) {
//        Customer customerLee = new Customer(10010, "이순신");
//        customerLee.setCustomerName("이순신");
//        customerLee.setCustomerId(10010);
//        customerLee.bonusPoint = 1000;
//        System.out.println(customerLee.showCustomerInfo());

//        VIPCustomer customerKim = new VIPCustomer();
//        customerKim.setCustomerName("김유신");
//        customerKim.setCustomerId(10020);
//        customerKim.bonusPoint = 10000;
//        System.out.println(customerKim.showCustomerInfo());


        Customer customerLee = new Customer(10010, "이순신");
        customerLee.bonusPoint = 1000;
        System.out.println(customerLee.showCustomerInfo());

        VIPCustomer customerKim = new VIPCustomer(10020, "김유신");
        customerKim.bonusPoint = 10000;
        System.out.println(customerKim.showCustomerInfo());

        int priceLee = customerLee.calcPrice(10000);
        int priceKim = customerKim.calcPrice(10000);

        System.out.println(customerLee.showCustomerInfo() + " 지불금액은 " + priceLee + "원 입니다.");
        System.out.println(customerKim.showCustomerInfo() + " 지불금액은 " + priceKim + "원 입니다.");

        Customer customerNo = new VIPCustomer(10030, "나몰라");
        customerNo.bonusPoint = 10000;
        int priceNo = customerNo.calcPrice(10000);
        System.out.println(customerNo.showCustomerInfo() + " 지불금액은 " + priceNo + "원 입니다.");

    }
}
