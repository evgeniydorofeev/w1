package w1;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.cache.Cache2kBuilderCustomizer;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableCaching
//@EnableScheduling 
//@ServletComponentScan
public class W1 { // extends SpringBootServletInitializer {
	
//	@Bean
//	public Cache2kBuilderCustomizer myCache2kDefaultsCustomizer() {
//		return (builder) -> builder.entryCapacity(200)
//				.expireAfterWrite(Duration.ofMillis(1));
//	}

//	@SneakyThrows
//	@SqsListener("test1")
//	public void receiveMessage(String r1) {
//		System.out.println("Received message: " + r1);
//		Thread.sleep(5);
//	}

	public static void main(String[] args) {
		SpringApplication.run(W1.class, args);
	}
}
