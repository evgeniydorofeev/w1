package w1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.concurrent.ConcurrentMapCacheManager;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
//@EnableSqs
@EnableCaching
//@EnableScheduling 
@ServletComponentScan
public class W1 { // extends SpringBootServletInitializer {

	public static void main(String[] args) {
//		int[] a = {1,3,5};
//		int i = Arrays.binarySearch(a, 0);
//		int i = -1;
//		i = i>>>1;
//		System.out.println(i);

		SpringApplication.run(W1.class, args);
//		ApplicationContext context = new AnnotationConfigApplicationContext(W1.class);
// 		SpringApplication.run(W1.class, args);
//		ConfigurableA  pplicationContext ctx = SpringApplication.run(W1.class, args);
//		ctx.getBean(AmazonSQSAsync.class);
//		QueueMessagingTemplate sqs = ctx.getBean(QueueMessagingTemplate.class);
//		sqs.convertAndSend("evgeniy-replies", "!!!");
//		ReceiveMessageResult msg = ctx.getBean(AmazonSQS.class).receiveMessage("evgeniy-replies");
//		System.out.println(msg);
	}
}
