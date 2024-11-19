package w1;

import java.util.List;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

//interface C1 {
//	String getC1();
//}

public interface T1Repository extends JpaRepository<T1, Long> {
	
//	@QueryHint(name="jakarta.persistence.fetchgraph", value = "")
//	@Modifying
//	@Query("update T1 set c1='3'")
//	int updateT1();

//	interface C1 {++
//		String getC1();
//	}
	
	@EntityGraph(type = EntityGraph.EntityGraphType.FETCH, attributePaths = "c1")
	List<T1> findByC1(String c1);
}
