package w1;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class T1 {
	@Id
	@GeneratedValue
	private Long id;

	private String c1;
	
//	@OneToMany(mappedBy = "t1")
//	private List<T2> t2;
}
