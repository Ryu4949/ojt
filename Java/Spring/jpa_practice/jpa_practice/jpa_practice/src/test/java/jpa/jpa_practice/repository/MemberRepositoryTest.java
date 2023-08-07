package jpa.jpa_practice.repository;

import jpa.jpa_practice.domain.Member;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
@Transactional
class MemberRepositoryTest {
    @Autowired
    private UserRepository userRepository;

    @Test
    void crud() {
//        userRepository.save(new Member("new martin", "newmartin@fastcampus.com"));
//        userRepository.flush();
//        userRepository.findAll().forEach(System.out::println);
//        System.out.println(">>>" + userRepository.findAll());

//        System.out.println("-------------------------");
//        long count = userRepository.count();
//        System.out.println(count);
//        System.out.println("-------------------------");


//        boolean exists = userRepository.existsById(1L);
//        System.out.println(exists);
//        System.out.println("-------------------------");

//        userRepository.delete(userRepository.findById(1L).orElse(null));
//        userRepository.delete(userRepository.findById(1L).orElseThrow(RuntimeException::new));

//        userRepository.deleteAll();
//        userRepository.findAll().forEach(System.out::println);

        userRepository.deleteAllInBatch();
        userRepository.findAll().forEach(System.out::println);
    }
}