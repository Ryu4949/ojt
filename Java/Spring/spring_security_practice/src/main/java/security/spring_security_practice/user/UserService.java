package security.spring_security_practice.user;

import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import security.spring_security_practice.user.entity.User;
import security.spring_security_practice.user.exception.AlreadyRegisteredUserException;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public User signup(
            String username,
            String password
    ) {
        if (userRepository.findByUsername(username) != null) {
            throw new AlreadyRegisteredUserException();
        }
        return userRepository.save(new User(username, passwordEncoder.encode(password), "ROLE_USER"));
    }

    public User findByUserName(String username) {
        return userRepository.findByUsername(username);
    }
}
