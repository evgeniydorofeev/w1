package w1;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@RestController
//@RequestMapping("") 
public class RestController1 {
	
//	@Autowired  
//	ThreadPoolTaskExecutor ex;
	
//	@Scheduled(fixedDelay = 1000)
//	public void xxx() {
//		System.out.println("12312312");
//	}
	
//	@RequestMapping("/")
	// @PreAuthorize("hasAuthority('ROLE_ADMIN')")
//	public ModelAndView t1(HttpServletRequest rq, HttpServletResponse rs) {
//		ModelAndView mv = new ModelAndView("view1");
//		return mv;
//	}
//	
	@GetMapping("/t1")
	public String t1() {
//		return Map.of("1", "4");
		return "/xxx/view1.jsp";
	}
	
//	@CrossOrigin(origins = "http://localhost:8080")
//	@PostMapping(value = "/t2", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
//	public void t2(HttpServletRequest rq) {
//		System.out.println(rq.getIn);
//	}
}
