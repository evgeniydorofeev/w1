  package w1;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@RestController
//@RequestMapping("") 
public class Controller1 {
	
//	@RequestMapping("/")
	@GetMapping("/t1")
	@PreAuthorize("hasAuthority('ROLE_ADMIN')")
	public String t1(HttpServletRequest rq, HttpServletResponse rs) {
		return "t1";
	}
	
}
