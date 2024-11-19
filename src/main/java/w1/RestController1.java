package w1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

record R1(Long id, String c1) {
}

@RestController
//@RequestMapping("") 
public class RestController1 {

	@Autowired
	private RestService1 s1;

	@PersistenceContext
	private EntityManager em;

	@GetMapping("/t1/{id}")
	public String t1(@PathVariable Long id) {
		return s1.getT1(id).toString();
	}

	@GetMapping("/t2/{id}")
	public String t2(@PathVariable Long id) {
		s1.evict(id);
		return "";
	}

	
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
