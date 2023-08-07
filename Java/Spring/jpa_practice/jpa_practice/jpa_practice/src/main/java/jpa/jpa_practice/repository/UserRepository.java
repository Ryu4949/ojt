package jpa.jpa_practice.repository;

import jpa.jpa_practice.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
