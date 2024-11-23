package w1;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.SequenceGenerator;

@MappedSuperclass
public class EntityBase {
	@Id
	@SequenceGenerator(name = "xxx", sequenceName = "xxx", allocationSize = 50)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "xxx")
	private Long id;
	
//	@Version   
//	private Long version;
}
