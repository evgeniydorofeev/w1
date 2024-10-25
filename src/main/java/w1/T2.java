package w1;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class T2 extends EntityBase {
	private String c1;
	
	@ManyToOne(fetch = FetchType.LAZY)
//	@JoinColumn(name = "t1_id")
	private T1 t1;
}
