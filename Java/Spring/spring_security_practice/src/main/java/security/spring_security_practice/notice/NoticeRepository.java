package security.spring_security_practice.notice;

import org.springframework.data.jpa.repository.JpaRepository;
import security.spring_security_practice.notice.entity.Notice;

public interface NoticeRepository extends JpaRepository<Notice, Long> {
}