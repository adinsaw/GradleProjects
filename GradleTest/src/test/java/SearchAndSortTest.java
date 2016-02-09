

import static org.junit.Assert.*;

import org.junit.Test;

import src.searchandSort.BinarySearch;

public class SearchAndSortTest {
	int[] A={3,5,7,9};
	@Test
	public void testMain() {
		//assertEquals(1,1);
		//fail("Not yet implemented");
	}

	@Test
	
	public void testSearcharray() {
		BinarySearch test=new BinarySearch();
		//int actual=test.searcharray(A,0,A.length,5);
		//int expected=1;
		assertEquals(1,test.searcharray(A,0,A.length,5));
		assertEquals(-1,test.searcharray(A,0,A.length,0));
		assertEquals(3,test.searcharray(A,0,A.length,9));
		
	//	fail("Not yet implemented");
	}

}
