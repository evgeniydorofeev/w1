package w1;

import java.util.List;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.QueryHints;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.QueryHint;

//interface C1 {
//	String getC1();
//}

record C1(String c1) {
}

//public interface T1Repository extends Repository<T1, Long> {//JpaRepository<T1, Long>, JpaSpecificationExecutor<T1>  {
public interface T1Repository extends JpaRepositoryImplementation<T1, Long> {
	
//	@QueryHint(name="jakarta.persistence.fetchgraph", value = "")
//	@QueryHints(
//			@QueryHint(name = "jakarta.persistence.fetchgraph", value = "T1")
//	)
	@Query("select t1 from T1 t1 join fetch t1.t2")
	List<T1> findAll1();

//	@Query("select t1.c1 c1 from T1 t1 where id in ?1")  
//	List<Tuple> findAll2(Iterable<Long> ids);
//  
//	@Modifying
//	@Query("update T1 set c1='3'")
//	int updateT1();

	interface C1 {
		String getC1();
	}

	List findAll(Specification<T1> sp);
}
