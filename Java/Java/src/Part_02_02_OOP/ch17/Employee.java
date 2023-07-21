package Part_02_02_OOP.ch17;

public class Employee {

    private static int serialNum = 1000;

    private int employeeId;
    private String employeeName;
    private String department;

    public Employee() {

        serialNum ++;
        employeeId = serialNum;

    }

    public static int getSerialNum() {
        int i = 0; // 지역변수는 상관 X

//        employeeName = "Lee"; // 이 static 메서드가 호출될 시점에 employeeName이라는 멤버변수는 존재하지 않을 수 있기 때문에 오류

        return serialNum;
    }

    public static void setSerialNum(int serialNum) {
        Employee.serialNum = serialNum;
    }

    public int getEmployeeId() {
        return employeeId;
    }
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }
    public String getEmployeeName() {
        return employeeName;
    }
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }

}
