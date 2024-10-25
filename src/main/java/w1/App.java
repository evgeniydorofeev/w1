  package w1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@SpringBootApplication
//@EnableSqs
//@EnableCaching
public class App { // extends SpringBootServletInitializer {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(App.class, args);
//		ctx.getBean(AmazonSQSAsync.class);
//		QueueMessagingTemplate sqs = ctx.getBean(QueueMessagingTemplate.class);
//		sqs.convertAndSend("evgeniy-replies", "!!!");
//		ReceiveMessageResult msg = ctx.getBean(AmazonSQS.class).receiveMessage("evgeniy-replies");
//		System.out.println(msg);
	}
}

