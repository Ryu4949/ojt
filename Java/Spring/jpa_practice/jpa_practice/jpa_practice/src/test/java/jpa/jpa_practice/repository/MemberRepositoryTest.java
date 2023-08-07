package jpa.jpa_practice.repository;

import jpa.jpa_practice.domain.Member;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.transaction.annotation.Transactional;

import static org.springframework.data.domain.ExampleMatcher.GenericPropertyMatchers.endsWith;

@SpringBootTest
@Transactional
class MemberRepositoryTest {
    @Autowired
    private MemberRepository memberRepository;

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

//        memberRepository.deleteAllInBatch();
//        memberRepository.findAll().forEach(System.out::println);

//        Page<Member> members = memberRepository.findAll((PageRequest.of(1, 3)));
//        members.forEach(System.out::println);
//        System.out.println("--------------");

        ExampleMatcher matcher = ExampleMatcher.matching()
                .withIgnorePaths("name")
                .withMatcher("email", endsWith());
        Example<Member> example = Example.of(new Member("no", "martkin@fastcampus.com"), matcher);
        memberRepository.findAll(example).forEach(System.out::println);
    }
}