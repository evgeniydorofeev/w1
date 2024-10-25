//package w1;
//
//import org.springframework.web.client.RestClient;
//
//public class Client {
//
//	public static void main(String[] args) {
//		RestClient restClient = RestClient.create();
//		Dto s = restClient.get()
//				.uri("http://localhost:8443/test")
//				.retrieve()
//				.body(Dto.class);
//		System.out.println(s);
//	}
//
//}
