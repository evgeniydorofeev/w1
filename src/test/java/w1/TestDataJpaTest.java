package w1;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.jdbc.Sql;

@Disabled
@DataJpaTest
public class TestDataJpaTest {
	
	@Autowired
	T1Repository r1;
	
	@Test
	@Sql("t1.sql")
	void test1() throws Exception {
		System.out.println(r1.count());
	}
}
