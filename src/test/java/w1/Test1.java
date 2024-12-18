package w1;

import java.time.Clock;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

import lombok.SneakyThrows;

//@ExtendWith(MockitoExtension.class)
//@TestMethodOrder(OrderAnnotation.class)
public class Test1 {

	public int x;

	public int getX() {
		return x;
	}

//	static Stream<Arguments> stringIntAndListProvider() {
//	    return Stream.of(
//	    	Arguments.arguments("apple", 1),
//	    	Arguments.arguments("lemon", 2)
//	    );
//	}

//	@Test
//	@Order(1)
//	public void test1() {
//		List<Integer> l = spy(ArrayList.class);
//		l.add(1);
//		System.out.println(l.size());
	// });
//		InOrder inOrder = Mockito.inOrder(l);
//		inOrder.verify(l, times(2)).add(captor.capture());
//		System.out.println(captor.getAllValues());
//		verifyNoMoreInteractions(l);
//	}

//	@ParameterizedTest
//	@MethodSource("m1")
//	public void test3(String s) {
//		System.out.println(s);
//	}
// 
//	private static List<Arguments> m1() {
//		return List.of(Arguments.arguments("1"), Arguments.arguments("2"));
//	}

//	@SneakyThrows
	@Test
	public void xxx() {
		System.out.println(0x1.0p+1);
		System.out.println(Double.toString(0x1.0p-1));
//		System.out.println(Duration.of(1, ChronoUnit.DAYS));
		
//		  CompletableFuture.supplyAsync(() -> {
//			  return null;
//		  });
//		  new FutureTask(()-> {
//			  System.out.println("!!!!");
//			  return null;
//		  }).run();
//		  Thread.sleep(100000);
	}

}
