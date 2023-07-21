package Part_02_OOP.ch24;

import java.util.ArrayList;

public class StudentAnswer {
    int studentID;
    String studentName;
    ArrayList<SubjectAnswer> subjectList;

    public StudentAnswer(int studentID, String studentName){
        this.studentID = studentID;
        this.studentName = studentName;

        subjectList = new ArrayList<SubjectAnswer>();
    }

    public void addSubject(String name, int score){
        SubjectAnswer subject = new SubjectAnswer();

        subject.setName(name);
        subject.setScorePoint(score);
        subjectList.add(subject);
    }

    public void showStudentInfo()
    {
        int total = 0;

        for(SubjectAnswer s : subjectList){

            total += s.getScorePoint();
            System.out.println("학생 " + studentName + "의 " + s.getName() + " 과목 성적은 " +
                    s.getScorePoint() + "입니다.");
        }

        System.out.println("학생 " + studentName + "의 총점은 " + total + " 입니다.");
    }

}
