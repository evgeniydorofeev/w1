package w1;

import java.util.List;

import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.NamedEntityGraph;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
//@NamedQuery(name = "T1.findAll", query = "select t1 from T1 t1")
//@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
//@DiscriminatorColumn(name = "employee_type", discriminatorType = DiscriminatorType.STRING)

//@NamedEntityGraph(
//		  name = "t1-entity-graph"
//		  attributeNodes = {
//		    @NamedAttributeNode("user")
//		  }
//		)
//@NamedEntityGraph(name = "t1-entity-grapр")
public class T1 extends EntityBase {
	
	@Basic
	private String c1;

//	@Enumerated(EnumType.STRING)
//	private E1 e1;

	@OneToMany(mappedBy = "t1")
	private List<T2> t2;
}
