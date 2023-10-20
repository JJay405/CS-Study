public class MergeSort {

	private static void merge(Comparable a[], Comparable aux[], int lo, int mid, int hi) {

		for (int p = lo; p <= hi; p++) {

			aux[p] = a[p]; // System.arraycopy(aux,lo,hi,lo,hi-lo+1)
		}

			int i = lo;
			int j = mid + 1;

			for (int k = lo; k <= hi; k++) {
				if (i > mid)

					a[k] = aux[j++];				

				else if (j > hi )

					a[k] = aux[i++];

				else if (less(aux[j], aux[i]))

					a[k] = aux[j++];

				else

					a[k] = aux[i++];
			}
		//	System.out.println("leftindex = "+i+"   rightindex = "+j);
	}

	private static boolean less(Comparable v, Comparable w)

	{
		return (v.compareTo(w) < 0);
	}

	public static void sort(Comparable[] a) 
	{
		Comparable[] aux = new Comparable[a.length];

		sort(a, aux, 0, a.length - 1);
	}

	private static void sort(Comparable[] a, Comparable[] aux, int lo, int hi) 
	{
		if (lo >= hi)
			return;
		
		int mid = lo + (hi - lo) / 2; //equals to (hi + lo)/ 2

		sort(a, aux, lo, mid);

		sort(a, aux, mid + 1, hi);

		merge(a, aux, lo, mid, hi);

	}

	public static void show(Comparable[] a) {
		for (int i = 0; i < a.length; i++)

			System.out.print(a[i] + " ");
	}


public static void main(String[] args) {
	// TODO Auto-generated method stub

	Integer[] arr = {775,12,55,1,52,44,554,7,693,22,46565};
	
	MergeSort.sort(arr);
	MergeSort.show(arr);
	}
}
