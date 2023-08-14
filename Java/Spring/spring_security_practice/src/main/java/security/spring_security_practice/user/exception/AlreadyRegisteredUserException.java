package security.spring_security_practice.user.exception;

public class AlreadyRegisteredUserException extends RuntimeException {

    public AlreadyRegisteredUserException(String message) {
        super(message);
    }

    public AlreadyRegisteredUserException() {
        super("이미 등록된 사용자입니다.");
    }
}
