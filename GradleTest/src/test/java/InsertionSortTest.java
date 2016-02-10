

import static org.junit.Assert.*;

import org.junit.Test;

import src.searchandSort.InsertionSort;

public class InsertionSortTest {
static int[] A={7,6,4};
static int[] B={4,6,7};
	@Test
	public <sort> void testSort() {
		
		InsertionSort test=new InsertionSort();
	
		assertArrayEquals(B,test.sort(A));
		
	}

}
