package w1;

import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.when;

import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;


//@SpringBootTest
@ExtendWith(MockitoExtension.class)
public class Test1 {
	
	@Test
	public void test1() {
		List list = new LinkedList();  
		List spy = spy(list);

		//Impossible: real method is called
		//so spy.get(0) throws IndexOutOfBoundsException (the list is yet empty)

		when(spy.get(0)).thenReturn("foo");

		//You have to use doReturn() for stubbing:
		doReturn("foo").when(spy).get(0);
		
//		List l = mock(List.class);
//		doReturn(1).when(l).get(0);
//		System.out.println(l.get(0));
	}
}
