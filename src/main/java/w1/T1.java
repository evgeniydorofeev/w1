package w1;

import java.util.List;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.springframework.cache.annotation.Cacheable;

import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
//@Table(name = "t1")
//@NamedQuery(name = "T1.findAll", query = "select t1 from T1 t1")

//@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
  //@DiscriminatorColumn(name = "employee_type", discriminatorType = DiscriminatorType.STRING)

//@NamedEntityGraph(
//		  name = "t1-entity-graph"
//		  attributeNodes = {
//		    @NamedAttributeNode("user")
//		  }
//		)
@Entity
//@Cacheable
//@Cache(region = "t1", usage = CacheConcurrencyStrategy.READ_WRITE)
public class T1 extends EntityBase {
	private static final long serialVersionUID = 1L;

	@Basic
	private String c1;  

//	@Enumerated(EnumType.STRING)
//	private E1 e1;

//	@OrderBy("name ASC")
	@OneToMany(mappedBy = "t1", fetch = FetchType.LAZY)
	private List<T2> t2;
}
