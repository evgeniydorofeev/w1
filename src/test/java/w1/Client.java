package w1;

import org.junit.jupiter.api.Test;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestClient;
import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.publisher.Mono;

public class Client {
	

	@Test
	public void test1() {
		RestClient restClient = RestClient.create();
		String s = restClient.get()
				.uri("https://www.google.com")
				.retrieve()
				.body(String.class);
		System.out.println(s);
	}

	@Test
	public void test2() {
		Mono<String> s = WebClient.create("https://www.google.com")
				.get()
//				.uri("/persons/{i}")
//				.accept(MediaType.APPLICATION_JSON)
				.retrieve()
				.bodyToMono(String.class);
		System.out.println(s.blockOptional());
	}
	
	@Test
	public void test3() {
		//
	}

	
}
