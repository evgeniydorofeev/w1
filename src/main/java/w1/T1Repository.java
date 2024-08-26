package w1;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface T1Repository extends JpaRepository<T1, Long> {
	
	@Query("select t1 from T1 t1 join T2 t2 on t2.t1 = t1")
	List<T1> findAll1();
    
}
