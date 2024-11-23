package w1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableCaching
//@EnableScheduling 
//@ServletComponentScan
public class W1 { // extends SpringBootServletInitializer {
	
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
