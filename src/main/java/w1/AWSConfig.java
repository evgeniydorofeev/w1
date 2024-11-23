package w1;

//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.cloud.aws.messaging.core.QueueMessagingTemplate;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import com.amazonaws.auth.AWSStaticCredentialsProvider;
//import com.amazonaws.auth.BasicAWSCredentials;
//import com.amazonaws.services.sqs.AmazonSQSAsync;
//import com.amazonaws.services.sqs.AmazonSQSAsyncClientBuilder;

//@Configuration
//@ConfigurationProperties("spring.datasource")
public class AWSConfig {

//	@Value("${cloud.aws.credentials.accessKey}")
//	private String accessKey;
//
//	@Value("${cloud.aws.credentials.secretKey}")
//	private String secretKey;
//
//	@Value("${cloud.aws.region.static}")
//	private String region;

//	@Bean
//	public AmazonSQSAsync amazonSQSAsync() {
//		BasicAWSCredentials awsCredentials = new BasicAWSCredentials(accessKey, secretKey);
//		return AmazonSQSAsyncClientBuilder.standard()
//				.withCredentials(new AWSStaticCredentialsProvider(awsCredentials))
//				.withRegion(region).build();
//	}
//
//	@Bean
//	public QueueMessagingTemplate queueMessagingTemplate(AmazonSQSAsync amazonSQSAsync) {
//		return new QueueMessagingTemplate(amazonSQSAsync);
//	}
}
