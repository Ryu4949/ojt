package Part_02_02_OOP.ch04;

public class StudentTest {
    public static void main(String[] args) {

        Student studentLee = new Student();

        studentLee.setStudentName("lee dae ho");
        studentLee.address = "마포구 마포대로24길16";
        studentLee.showStudentInfo();

        Student studentKim = new Student();

        studentKim.setStudentName("kim sang soo");
        studentKim.address = "의왕 모란길24";
        studentKim.showStudentInfo();
    }
}
