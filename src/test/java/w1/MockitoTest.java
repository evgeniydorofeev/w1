package w1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class MockitoTest {
	
	public static interface DataService {
	    double retrieveData();
	}
	
	public static class DataProcessor {
	    private DataService dataService;

	    public DataProcessor(DataService dataService) {
	        this.dataService = dataService;
	    }

	    public double processData() {
	        return dataService.retrieveData() * 2;
	    }
	}
	
	void test1() {
		DataService dataService = Mockito.mock(DataService.class);
	    when(dataService.retrieveData()).thenReturn(15.0);
	
	    DataProcessor processor = new DataProcessor(dataService);
	    double result = processor.processData();

	    assertEquals(30.0, result, 0.01);
	}

}
