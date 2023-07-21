package Part_02_02_OOP.ch06;

public class StudentTest {

    public static void main(String[] args) {
        Student studentLee = new Student(1, "Peter", 90);

        System.out.println(studentLee.showStudentInfo());

        Student studentKim = new Student(123456, "Kim", 75);
        System.out.println(studentKim.showStudentInfo());
    }
}
