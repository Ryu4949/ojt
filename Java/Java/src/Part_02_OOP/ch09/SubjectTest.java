package Part_02_OOP.ch09;

public class SubjectTest {
    public static void main(String[] args) {

        Student studentLee = new Student(100, "lee");
        studentLee.setKoreaSubject("국어", 100);
        studentLee.setMathSubject("수학", 99);

        Student studentKim = new Student(200, "kim");
        studentKim.setKoreaSubject("국어", 50);
        studentKim.setMathSubject("수학", 65);

        studentLee.showScoreInfo();
        studentKim.showScoreInfo();
    }
}
