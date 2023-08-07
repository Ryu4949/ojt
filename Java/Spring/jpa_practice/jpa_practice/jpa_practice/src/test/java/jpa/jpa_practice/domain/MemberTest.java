package jpa.jpa_practice.domain;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

class MemberTest {

    @Test
    void test() {
        Member member = new Member();
        member.setEmail("gangsofnewyork@nate.com");
        member.setName("gaengha");
        member.setCreatedAt(LocalDateTime.now());
        member.setUpdatedAt(LocalDateTime.now());

        Member member1 = new Member();
        member1.builder()
                .name("leeseungyeop")
                .email("sylee36@kkkk.com")
                .createdAt(LocalDateTime.now())
                .updatedAt(LocalDateTime.now())
                .build();
    }

}