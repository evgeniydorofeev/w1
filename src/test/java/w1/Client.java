package w1;

import org.springframework.web.client.RestClient;

public class Client {

	public static void main(String[] args) {
		RestClient restClient = RestClient.create();
		String s = restClient.get()
				.uri("http://localhost:8080/t1")
				.retrieve()
				.body(String.class);
		System.out.println(s);
	}

}
