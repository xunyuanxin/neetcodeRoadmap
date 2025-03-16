package sorting;

public class BucketSort {
    public static int[] bucketSort(int[] array) {
        int[] counts = {0, 0, 0};
        for (int i = 0; i < array.length; i++) {
            int n = array[i];
            counts[n]++;
        }
        int i = 0;
        for (int n = 0; n < counts.length; n++) {
            for (int j = 0; j < counts[n]; j++) {
                array[i] = n;
                i++;
            }
        }
        return array;
    }
}
