

import static org.junit.Assert.*;

import org.junit.Test;

import src.searchandSort.InsertionSort;
import src.searchandSort.QuickSort;

public class QuickSortTest {
	static int[] A = { 6, 5, 8};
	static int[] B = { 5,6,8};
	@Test
	public void testQuickSorting() {
		QuickSort test=new QuickSort();
		
		assertArrayEquals(B,test.quickSorting(A, 0, A.length-1));
	}

}
