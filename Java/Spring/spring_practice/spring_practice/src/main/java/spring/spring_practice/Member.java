package spring.spring_practice;

public class Member {

    private String name;
    private int age;
    private String phoneNumber;

    public Member(String name, int age, String phoneNumber) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Member defaultMember() {
        return new Member("default", 0, "010-1234-5678");
    }

    @Override
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
