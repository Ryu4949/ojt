package Part_02_OOP.ch08;

public class UserRepeat {

    public String userName;
    public int userAge;
    public int userHeight;
    public int userWeight;

    public UserRepeat(String userName, int userAge, int userHeight, int userWeight) {
        this.userName = userName;
        this.userAge = userAge;
        this.userHeight = userHeight;
        this.userWeight = userWeight;
    }

    public String showUserInfo() {
        return "키가 " + userHeight + "이고, 몸무게가 " + userWeight + "인 남성이 있습니다. 이름은 " + userName + "이고 나이는 " + userAge +"입니다.";
    }
}
