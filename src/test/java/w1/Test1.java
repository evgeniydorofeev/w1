package w1;

import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.spy;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.MockedStatic;
import org.mockito.junit.jupiter.MockitoExtension;

//@ExtendWith(MockitoExtension.class)
//@TestMethodOrder(OrderAnnotation.class)
public class Test1 {

//	static Stream<Arguments> stringIntAndListProvider() {
//	    return Stream.of(
//	    	Arguments.arguments("apple", 1),
//	    	Arguments.arguments("lemon", 2)
//	    );
//	}

	@Test
	@Order(1)
	public void test1() {
		
		List<Integer> l = spy(ArrayList.class);
		l.add(1);
		System.out.println(l.size());
  //		});
//		InOrder inOrder = Mockito.inOrder(l);
//		inOrder.verify(l, times(2)).add(captor.capture());
//		System.out.println(captor.getAllValues());
//		verifyNoMoreInteractions(l);
	}

//	@ParameterizedTest
//	@MethodSource("m1")
//	public void test3(String s) {
//		System.out.println(s);
//	}
// 
//	private static List<Arguments> m1() {
//		return List.of(Arguments.arguments("1"), Arguments.arguments("2"));
//	}
//	
//	@TestFactory
//	Collection<DynamicTest> dynamicTestsWithCollection() {
//	    return List.of(
//	      DynamicTest.dynamicTest("Add test",
//	        () -> assertEquals(2, Math.addExact(1, 1))),
//	      DynamicTest.dynamicTest("Multiply Test",
//	        () -> assertEquals(4, Math.multiplyExact(2, 2))));
//	}
//	
//	@ParameterizedTest
//	//@NullAndEmptySource
//	@ValueSource(strings = {"\t", "\n"})
//	void isBlank_ShouldReturnTrueForAllTypesOfBlankStrings(String input) {
//		System.out.println("!!!" + input + "++");
//	}
	
}
