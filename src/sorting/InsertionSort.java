package sorting;

public class InsertionSort {
    public static int[] insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int j = i - 1;
            while (j >= 0 && array[j + 1] < array[j]) {
                int tmp = array[j + 1];
                array[j + 1] = array[j];
                array[j] = tmp;
                j--;
            }
        }
        return array;
    }
}
