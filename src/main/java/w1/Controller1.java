package w1;
import java.io.IOException;
import java.time.ZonedDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.persistence.EntityManager;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.transaction.Transactional; 

@RestController
//@RequestMapping("") 
public class Controller1 {
	@Autowired
	private T1Repository r1;
	
	@Autowired
	private EntityManager em;

	@PostMapping("/t1")
	@Transactional
	public Object addT1(@RequestBody T1 t1) {
		t1 = new T1();
		t1.setC1("1");
		t1.setDt1(ZonedDateTime.now());
		em.persist(t1);
		em.flush();

		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<T1> cq = cb.createQuery(T1.class);
		Root<T1> root = cq.from(T1.class);
		cq.select(root).where(cb.and(cb.equal(root.get(T1_.c1), "1"))).orderBy(null)
		return em.createQuery(cq).getSingleResult();
		
//		return em.createQuery("select t1 from T1 t1 where c1 = :p1").setParameter("p1", "1").getResultList();
	}
	
	@GetMapping("/test")        
	//@PreAuthorize ("hasAuthority('ROLE_ADMIN')") 
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
