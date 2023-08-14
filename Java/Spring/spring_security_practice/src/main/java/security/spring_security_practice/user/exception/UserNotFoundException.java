package security.spring_security_practice.user.exception;

public class UserNotFoundException extends RuntimeException {

    public UserNotFoundException(String message) {
        super(message);
    }

    public UserNotFoundException() {
        super("등록되지 않은 사용자입니다.");
    }
}
