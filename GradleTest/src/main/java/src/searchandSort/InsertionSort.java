package src.searchandSort;

public class InsertionSort {
static int high,curr=0;
static int[] A ={2,5,1};
public static void main (String[] args)
{
sort(A);
for(int i:A)
{
	System.out.print(i+",");
}
}

	public static int[] sort(int[] A)
	{
		for(int cnt=A.length-1;cnt>0;cnt--)
		{
			high=A[cnt];
			for(int j=0;j<cnt;j++)
			{	curr=A[j];
				if(high<curr)
				{
					A[j]=high;
					A[cnt]=curr;
					high=curr;
					
				}
			}
		}
	return A;}
}
