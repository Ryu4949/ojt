package Part_02_02_OOP.ch18;

public class CompanyTest {

    public static void main(String[] args) {

        Company company1 = Company.getInstance(); // getInstance 메서드가 static 메서드가 아니라면 오류가 발생함
        Company company2 = Company.getInstance();

        System.out.println(company1);
        System.out.println(company2);

    }
}
