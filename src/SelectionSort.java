import java.math.BigInteger;

public class SelectionSort {


   public int[] regularSelectionSort(int arr[])
    {
        int n = arr.length;

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < n; j++) {
                int a = arr[j];
                int b = arr[min_idx];

                if (a < b) {
                    min_idx = j;
                }
            }
            // Swap the found minimum element with the first
            // element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }

        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");

        System.out.println();

        return arr;
    }

    public  String[] bigIntegerSelectionSort(String[] unsorted) {

        for (int i = 0; i < unsorted.length ; i++)
        {
            int minIndex = i;
            String element = unsorted[i];

            for (int j = i+1; j < unsorted.length; j++){

                BigInteger currentIndexValue = new BigInteger(unsorted[j]);

                BigInteger minIndexValue = new BigInteger(unsorted[minIndex]);

                // print result

                int comparevalue = currentIndexValue.compareTo(minIndexValue);

                if (comparevalue == -1) {

                    minIndex = j ;
                }

            }
            String temp = unsorted[minIndex];
            unsorted[minIndex] = unsorted[i] ;
            unsorted[i] = temp;


        }

        for (int i =0; i < unsorted.length; ++i)
            System.out.print(unsorted[i]+" ");

        System.out.println();

        return unsorted;

    }
}
