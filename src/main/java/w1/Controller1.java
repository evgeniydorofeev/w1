package w1;
import java.io.IOException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse; 

@RestController
//@RequestMapping("") 
public class Controller1 {

	@GetMapping("/test")   
	//@PreAuthorize("hasAuthority('ROLE_ADMIN')") 
	public void test(HttpServletRequest rq, HttpServletResponse rs) throws IOException {
		rs.getWriter().write("test");
		//return Map.of("xxx", "yyy"); 
	} 

	@GetMapping("/admin")   
	//@PreAuthorize("hasAuthority('ROLE_ADMIN')") 
	public void admin(HttpServletRequest rq, HttpServletResponse rs) throws IOException {
		rs.getWriter().write("admin");
		//return Map.of("xxx", "yyy"); 
	} 

} 
