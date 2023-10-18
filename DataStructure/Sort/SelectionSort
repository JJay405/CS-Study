import java.util.ArrayList;

public class Selection 
{

	private static boolean less(Comparable v, Comparable w)
	
	{
		return (v.compareTo(w) < 0);
	}
	
	private static void exch(Comparable[] arr, int i, int j) 
	{
		
		Comparable temp = arr[i];
		
		arr[i] = arr[j];
		
		arr[j] = temp;
		
	}
	
	public static void sort(Comparable[] arr) {
		
		int N = arr.length;
		
		for ( int i = 0; i < N; i++)
		{
			int min = i;
			
			for(int j = i+1; j < N; j++) {
				
				if(less(arr[j], arr[min]))
					
					min = j;
			}
			exch (arr,i,min);
				
			
		}
	}
}
