package w1;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class T2 extends EntityBase {
	private String c1;
	
	@ManyToOne
	private T1 t1;
}
