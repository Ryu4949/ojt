package spring.spring_practice;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringPracticeApplicationTests {

	@Test
	void contextLoads() throws JsonProcessingException {
		System.out.println("---------------------");

		// Text Json -> Object + Object -> Text Json

		var objectMapper = new ObjectMapper();

		// 1. object -> Text
		// object mapper는 get method를 활용한다.
		var member = new Member("Steve", 10, "010-1234-5678");
		var text = objectMapper.writeValueAsString(member);
		System.out.println(text);
	}

}
