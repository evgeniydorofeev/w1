package w1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

//@Disabled
//@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
//public class TestController2 {
//
//	@LocalServerPort
//	private int port;
//
////	@Autowired
////	TestRestTemplate restTemplate;
//
//	@Test
//	void test1() throws Exception {
////		ResponseEntity<String> res = new RestTemplate().getForEntity("http://localhost:" + port + "/t1", String.class);
////		assertEquals("t1", res.getBody());
//	}
//}
