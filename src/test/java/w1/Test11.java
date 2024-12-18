package w1;

import java.time.Duration;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

import org.junit.jupiter.api.Test;

import lombok.SneakyThrows;

record R11(int x) {
};

public class Test11 {

	@Test
	@SneakyThrows
	public void test1() {
		
//		Thread.startVirtualThread(() -> {
//			System.out.println("!!!");
//		});

//		ThreadFactory virtualThreadFactory = Thread.ofVirtual().factory();
//		ExecutorService ex = Executors.newFixedThreadPool(8, virtualThreadFactory);
//		ex.execute(() -> System.out.print("!!!"));
		
//		Executors.newVirtualThreadPerTaskExecutor();
		
//		Thread t = Thread.startVirtualThread(() -> System.out.println("!!!"));
//		Thread.sleep(Duration.ofMillis(1000));
//		System.out.println(t);
		
		// ObjectMapper m = new ObjectMapper();
//		m.writeValueAsString(new X(1));
//		assertThat(1).isEqualTo(2).withFailMessage("!!!!!");
//		MatcherAssert.assertThat("qweqweqew", "1", Matchers.is("2"));
//		assertEquals(1, 2);
	}

}
