package src.searchandSort;

public class QuickSort {
	static int[] A = { 6, 5, 8, 0, 3,9,2};

	static int a, b, c, pivot, pivotPos = 0;

	public static void main(String[] args)

	{
		quickSorting(A, 0, A.length - 1);
		for (int i : A) {
			System.out.print(i + ",");
		}
	}

	public static int[] quickSorting(int[] A, int low, int hi) {
		int getPivot = quickSort(A, 0, A.length - 1);
	
		quickSort(A, 0, getPivot - 1);
		quickSort(A, getPivot + 1, A.length - 1);
		return A;
	}

	public static int quickSort(int[] A, int low, int hi) {
		pivot = A[low];
		pivotPos = low;

		for (a = hi ; a != 0; a--) {

			if (pivot > A[a] && pivotPos < a) {
				A[pivotPos] = A[a];
				A[a] = pivot;
				pivotPos = a;
			}
			for (b = 0; b <= hi; b++) {
				if (a==b) {
					break;
				}
				if (pivot < A[b]) {
					A[pivotPos] = A[b];
					A[b] = pivot;
					pivotPos = b;
				}

			}

		}

		return pivotPos;
	}

}
