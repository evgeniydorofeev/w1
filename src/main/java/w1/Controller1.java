package w1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@RestController
//@RequestMapping("") 
public class Controller1 {
	
	@Autowired  
	ThreadPoolTaskExecutor ex;
	
	@Scheduled(fixedDelay = 1000)
	public void xxx() {
		System.out.println("12312312");
	}
	
//	@RequestMapping("/")
	@GetMapping("/t1")
	// @PreAuthorize("hasAuthority('ROLE_ADMIN')")
	public String t1(HttpServletRequest rq, HttpServletResponse rs) {
		return """
			   {"x":1}
			   """;
	}
	
	
//	@CrossOrigin(origins = "http://localhost:8080")
//	@PostMapping(value = "/t2", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
//	public void t2(HttpServletRequest rq) {
//		System.out.println(rq.getIn);
//	}
}
