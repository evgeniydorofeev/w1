package w1;

import java.util.concurrent.Executor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
//@RequestMapping("") 
public class Controller1 {
	
	@GetMapping("/v1")
    public String viewBooks(Model model) {
		model.addAttribute("serverTime", "!!!!!!");
		return "view1";
    }
	
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
//	@CrossOrigin(origins = "http://localhost:8080")
//	@PostMapping(value = "/t2", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
//	public void t2(HttpServletRequest rq) {
//		System.out.println(rq.getIn);
//	}
}
