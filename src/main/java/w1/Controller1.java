package w1;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest; 

@RestController
//@RequestMapping("") 
public class Controller1 {

	@GetMapping("/test") 
	//@PreAuthorize("hasAuthority('ROLE_ADMIN')") 
	public Map<String, String> user(HttpServletRequest rq) { 
		return Map.of("xxx", "yyy"); 
	} 

} 
