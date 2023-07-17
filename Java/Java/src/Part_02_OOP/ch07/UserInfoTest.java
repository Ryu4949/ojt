package Part_02_OOP.ch07;

public class UserInfoTest {
    public static void main(String[] args) {
        UserInfo userLee = new UserInfo();
        userLee.userId = "a12345";
        userLee.userAddress = "Seoul, Korea";

        System.out.println(userLee.showUserInfo());
    }
}
