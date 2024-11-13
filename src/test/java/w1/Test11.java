package w1;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.SneakyThrows;

record X(int i) {}

public class Test11 {
	
	@Test
	@SneakyThrows
	public void test1() {
//		ObjectMapper m = new ObjectMapper();
//		m.writeValueAsString(new X(1));
//		assertThat(1).isEqualTo(2).withFailMessage("!!!!!");
//		MatcherAssert.assertThat("qweqweqew", "1", Matchers.is("2"));
//		assertEquals(1, 2);
	}


}
