package simpleGame;


//It is recommended to import Mockito statically so that the code looks clearer
import static org.mockito.Mockito.*;

import org.junit.Test;
import org.junit.runner.RunWith;
//Eclipse might not find this one automatically:
import org.mockito.runners.MockitoJUnitRunner;
@RunWith(MockitoJUnitRunner.class) // This is required for mocks to work
public class SomeTest{
	@Test
	public void stubingSimple() {
		//Creating context
		/*
		PhonyList<String> mockList = mock(PhonyList.class);
		MyStructure struct = new MyStructure(mockList);
		when(mockList.get(0)).thenReturn("first");
		//Calling the tested operation
		String result = struct.getFirst();
		//Oracle
		assertEquals(result,"first");*/
	}
	
	@Test
	public void interactions() {
		/*//Creating context
		PhonyList<String> mockList = mock(PhonyList.class);
		MyStructure struct = new MyStructure(mockList);
		//Calling the tested operation
		struct.reinitWith("one");
		//Oracle: we check that the operation made some specific calls
		verify(mockList).clear();
		verify(mockList).add("one");*/
	}
}