package sorting;

public class MergeSort {
    public static int[] mergeSort(int[] array, int s, int e) {
        if (e - s + 1 <= 1) { return array; }
        int m = (s + e) / 2;
        mergeSort(array, s, m);
        mergeSort(array, m + 1, e);
        merge(array, s, m , e);
        return array;
    }

    public static void merge(int[] array, int l, int m, int r) {
        int lengthL = m - l + 1;
        int lengthR = r - m;

        int[] L = new int[lengthL];
        int[] R = new int[lengthR];

        for (int i = 0; i < lengthL; i++) {
            L[i] = array[l + i];
        }
        for (int j = 0; j < lengthR; j++) {
            R[j] = array[m + j + 1];
        }

        int left = 0;
        int right = 0;
        int i = l;

        while (left < lengthL && right < lengthR) {
            if (L[left] <= R[right]) {
                array[i] = L[left];
                left++;
            } else {
                array[right] = R[right];
                right++;
            }
            i++;
        }

        while(left < lengthL) {
            array[i] = L[left];
            left++;
            i++;
        }

        while (right < lengthR) {
            array[i] = R[right];
            right++;
            i++;
        }
    }
}
