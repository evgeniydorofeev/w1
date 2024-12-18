package w1;

import java.io.Serializable;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.SequenceGenerator;

@MappedSuperclass
public class EntityBase implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
//	@SequenceGenerator(name = "xxx", sequenceName = "xxx", allocationSize = 50)
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	
//	@Vers ion   
//	private Long version;
}
