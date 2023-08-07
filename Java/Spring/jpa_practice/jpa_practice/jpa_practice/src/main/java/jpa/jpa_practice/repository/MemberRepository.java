package jpa.jpa_practice.repository;

import jpa.jpa_practice.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
