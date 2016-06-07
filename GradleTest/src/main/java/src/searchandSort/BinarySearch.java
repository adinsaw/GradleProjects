package src.searchandSort;

import java.util.Arrays;

public class BinarySearch {
	
static int[] data={4,7,9,10,67,78,7,8};
static int input=2;

	public static void main (String[] args)
	{
		
		int value=searcharray(data,0,data.length,input);	
		System.out.println(value);
		
	}
	
	public static int searcharray(int[] A,int loIndex,int hiIndex ,int B )
	{
		
		   if (loIndex > hiIndex) {
			   return -1;
		   }
		   else 
			   {
			   int middle = (int) (loIndex+hiIndex)/2;
			   if(A[middle]==B ){return middle;}	   
			   else if(A[middle]>B)
		{			return searcharray(A,loIndex,middle-1,B);
	}else return searcharray(A,middle+1,hiIndex,B);
	}
		
		
		
		
	}

}
