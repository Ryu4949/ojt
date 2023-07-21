package Part_02_OOP.ch17;

public class EmployeeTest {

    public static void main(String[] args) {

        System.out.println(Employee.getSerialNum());
        Employee.setSerialNum(1003);
        System.out.println(Employee.getSerialNum());

    }
}
