//package w1;
//
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
//
//import jakarta.persistence.EntityManager;
//import jakarta.persistence.PersistenceContext;
//import jakarta.transaction.Transactional;
//
////@Disabled
//@DataJpaTest
//public class TestDataJpaTest {
//	
//	@Autowired
//	T1Repository r1;
//	
//	@PersistenceContext
//	EntityManager em;
//	
//	@Test
////	@Sql("t1.sql")
//	@Transactional
//	void test1() throws Exception {
//		em.persist(new T1());
////		System.out.println(r1.count());
//	}
//}
