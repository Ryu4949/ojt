package Part_02_02_OOP.ch24;

import java.util.ArrayList;

public class Student {
    int studentNumber;
    String studentName;
    ArrayList<Subject> subjectArrayList;

    public Student(int studentNumber, String studentName) {
        this.studentNumber = studentNumber;
        this.studentName = studentName;

        subjectArrayList = new ArrayList<Subject>();
    }

    public void addSubject(String subjectName, int subjectScore) {
        Subject newSubject = new Subject(subjectName, subjectScore);
        subjectArrayList.add(newSubject);
    }

    public void showStudentInfo() {
        int totalScore = 0;
        int totalSubjectCount = subjectArrayList.size();

        for (int i=0; i<totalSubjectCount; i++) {
            Subject nowSubject = subjectArrayList.get(i);
            totalScore += nowSubject.subjectScore;
            System.out.println("학생 " + studentName + "의 " + nowSubject.subjectName + " 과목 성적은 " + nowSubject.subjectScore +"입니다.");
        }

        System.out.println("학생 " + studentName + "의 총점은 " + totalScore + "입니다.");
    }
}
