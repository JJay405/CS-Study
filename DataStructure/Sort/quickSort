public class Quick {

    
    private Quick() { }

  
    public static void sort(Comparable[] a) {
        
        sort(a, 0, a.length - 1);
        
    }

    // quicksort the subarray from a[lo] to a[hi]
    private static void sort(Comparable[] a, int lo, int hi) { 
        if (hi <= lo) 
            return;
        int j = partition(a, lo, hi);
     //   show(a,lo,hi);
       // System.out.println("");
        sort(a, lo, j-1);
        sort(a, j+1, hi);
        
    }

    // partition the subarray a[lo..hi] so that a[lo..j-1] <= a[j] <= a[j+1..hi]
    // and return the index j.
    private static int partition(Comparable[] a, int lo, int hi) {
        int i = lo;
        int j = hi + 1;
        Comparable pivot = a[lo];
        while (true) { 

            // find item on lo to swap
            while (less(a[++i], pivot)) {
                if (i == hi) break;
            }

            // find item on hi to swap
            while (less(pivot, a[--j])) {
                if (j == lo) break;      // redundant since a[lo] acts as sentinel
            }

            // check if pointers cross
            if (i >= j) break;

            exch(a, i, j);
            
        }

        // put partitioning item v at a[j]
         exch(a, lo, j);
         show(a,lo,hi);
         System.out.println("");

        
        return j;
    }

    



    
   
    private static boolean less(Comparable v, Comparable w) {
        if (v == w) return false;   // optimization when reference equals
        return v.compareTo(w) < 0;
    }
        
    // exchange a[i] and a[j]
    private static void exch(Object[] a, int i, int j) {
        Object swap = a[i];
        a[i] = a[j];
        a[j] = swap;
       
    }



    private static boolean isSorted(Comparable[] a) {
        return isSorted(a, 0, a.length - 1);
    }

    private static boolean isSorted(Comparable[] a, int lo, int hi) {
        for (int i = lo + 1; i <= hi; i++)
            if (less(a[i], a[i-1])) return false;
        return true;
    }


    // print array to standard output
//     private static void show(Comparable[] a) {
//        for (int i = 0; i < a.length; i++) {
//            System.out.print(a[i]+" ");
//        }
//        System.out.println("");
//    }

     
     public static void show(Comparable[] a, int lo, int hi)
    {
        for (int i = lo; i <= hi; i++)
            System.out.print(a[i] + " ");
      //  System.out.println("");
    }
 
    public static void main(String[] args) {
   
       Integer[] a = {16, 19, 15, 14, 12, 10, 18, 11, 13,17};

        //show(a,0,a.length-1);
        System.out.println("");
        Quick.sort(a);
        //show(a);
        
    }

}
