
public class Main {
    public static void main(String[] args) {

        String[] unsortedArray = new String[]{
                "6",
                "31415926535897932384626433832795",
                "1",
                "3",
                "10",
                "3",
                "5"};

        //selectionSort(unsortedArray2);

        SelectionSort bigSort = new SelectionSort();
        bigSort.bigIntegerSelectionSort(unsortedArray);

    }
}
