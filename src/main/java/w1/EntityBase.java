package w1;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;

@MappedSuperclass
@Data
public class EntityBase {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;

}
