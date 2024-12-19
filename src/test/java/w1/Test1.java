package w1;

import java.util.Collection;
import java.util.List;

import org.assertj.core.api.Assertions;
import org.hamcrest.MatcherAssert;
import static org.hamcrest.Matchers.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestFactory;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

@TestMethodOrder(OrderAnnotation.class)
public class Test1 {
	
	@Test
	@Order(0)
	public void test0() {
		MatcherAssert.assertThat(1, is(1));
		
		Assertions.assertThat(1).isEqualTo(1);
	}
	
	@Nested
	public class NestedTest {
		@Test
		public void test1() {
		}
	}
	
	@RepeatedTest(value = 10, failureThreshold = 1)
	@DisplayName("repeatedTest")
	@Order(2)
	public void repeatedTest() {
		throw new RuntimeException();
	}

	@TestFactory
	@Order(1)
	public Collection<DynamicTest> test1() {
		return List.of(
			DynamicTest.dynamicTest("t1", () -> {}),
			DynamicTest.dynamicTest("t2", () -> {})
		);
	}
	
	@ParameterizedTest
	@MethodSource
//	@ValueSource(strings = {"1", "2", "3"})
//	@CsvSource({"test,TEST", "tEst,TEST", "Java,JAVA"})
//	@CsvSource(value = {"test:test", "tEst:test", "Java:java"}, delimiter = ':')
//	@CsvFileSource(resources = "/data.csv", numLinesToSkip = 1)
//	@EnumSource
//	@FieldSource
//	@NullAndEmptySource
//	@NullSource
//	@EmptySource
	@Order(3)
	void test3(String s, int i) {
		System.out.println(s + i);
	}

	private static Collection<Arguments> test3() {
		return List.of(Arguments.of("1", 1), Arguments.of("2", 2));
	}
}
