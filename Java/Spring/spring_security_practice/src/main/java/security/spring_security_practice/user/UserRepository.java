package security.spring_security_practice.user;

import org.springframework.data.jpa.repository.JpaRepository;
import security.spring_security_practice.user.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String name);
}
