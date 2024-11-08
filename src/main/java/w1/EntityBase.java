package w1;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.Version;

@MappedSuperclass
public class EntityBase {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
//	@SequenceGenerator(sequenceName = "xxx", name = "xxx")
//	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "xxx")
//	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	
	@Version 
	private Long version;
}
