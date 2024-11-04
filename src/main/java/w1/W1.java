package w1;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

import lombok.SneakyThrows;

@SpringBootApplication
//@EnableSqs
//@EnableCaching
@EnableScheduling
public class W1 { // extends SpringBootServletInitializer {

	int binarySearch(int[] a, int key) {
		int low = 0;
		int high = a.length - 1;
		while (low <= high) {
			int m = (low + high) >>> 1;
			int v = a[m];
			if (v < key) {
				low = m - 1;
			} else if (v > key) {
				high = m + 1;
			} else {
				return m;
			}
		}
		return -(low + 1);
	}

	@SneakyThrows
	public static void main(String[] args) {
//		int[] a = {1,3,5};
//		int i = Arrays.binarySearch(a, 0);
//		int i = -1;
//		i = i>>>1;
//		System.out.println(i);
// 		SpringApplication.run(W1.class, args);
//		ConfigurableA  pplicationContext ctx = SpringApplication.run(W1.class, args);
//		ctx.getBean(AmazonSQSAsync.class);
//		QueueMessagingTemplate sqs = ctx.getBean(QueueMessagingTemplate.class);
//		sqs.convertAndSend("evgeniy-replies", "!!!");
//		ReceiveMessageResult msg = ctx.getBean(AmazonSQS.class).receiveMessage("evgeniy-replies");
//		System.out.println(msg);
	}
}
