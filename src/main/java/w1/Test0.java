package w1;

import java.util.List;
import java.util.Spliterator;
import java.util.Spliterators;

import lombok.SneakyThrows;

public class Test0 {
	
	@SneakyThrows
	public static void main(String[] args) {
		
//		ExecutorService ex = Executors.newVirtualThreadPerTaskExecutor();
//		Future<?> t1 = ex.submit(() -> System.out.println(Thread.currentThread()));
//		Future<?> t2 = ex.submit(() -> System.out.println(Thread.currentThread()));
//		System.out.println(t1.get());
//		System.out.println(t2.get());
		
		
//		Thread t = Thread.startVirtualThread(() -> System.out.println("!!!!"));
//		t.join();
//		System.out.println(Runtime.getRuntime().maxMemory() / Math.pow(2, 10));
//		Object l = Stream.of("1", "1", "3")
////			.collect(Collectors.groupingBy(e -> e, HashMap::new, Collectors.toList()));
//			.collect(Collectors.groupingBy(e -> e));
//		System.out.println(l); 
		
		Spliterator<Integer> si = Spliterators.spliterator(List.of(1,2,3), 0);
		
	}  
	 
//	static void f1() {
//		f2();
//	}
//
//	static void f2() {
//		throw new RuntimeException();
//	}

}
