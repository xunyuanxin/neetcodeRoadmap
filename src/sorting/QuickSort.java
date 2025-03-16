package sorting;

public class QuickSort {
    public static int[] quickSort(int[] array, int s, int e) {
        if (e - s + 1 <= 1) {
            return array;
        }

        int pivot = array[e];
        int left = s;

        for (int i = s; i <= e; i++) {
            if (array[i] < pivot) {
                int tmp = array[left];
                array[left] = array[i];
                array[i] = tmp;
                left++;
            }
        }
        array[e] = array[left];
        array[left] = pivot;

        quickSort(array, s, left - 1);
        quickSort(array, left + 1, e);

        return array;
    }
}
