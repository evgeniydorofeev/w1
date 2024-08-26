package w1;

import java.time.ZonedDateTime;

import jakarta.persistence.Entity;
import lombok.Data;

@Data  
@Entity
//@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
//@DiscriminatorColumn(name = "employee_type", discriminatorType = DiscriminatorType.STRING)
public class T1 extends EntityBase {
	private String c1;
	
	private ZonedDateTime dt1;
	
//	@OneToMany(mappedBy = "t1")
//	private List<T2> t2;
}
