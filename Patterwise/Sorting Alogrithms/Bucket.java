import java.util.*;

public class Bucket {

    public static void bucketSort(float[] arr) {
        int n = arr.length;

        // Create buckets
        @SuppressWarnings("unchecked")
        ArrayList<Float>[] buckets = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            buckets[i] = new ArrayList<>();
        }

        // Put elements into buckets
        for (float num : arr) {
            int bucketIndex = (int) (num * n);
            buckets[bucketIndex].add(num);
        }

        // Sort individual buckets
        for (ArrayList<Float> bucket : buckets) {
            Collections.sort(bucket);
        }

        // Concatenate buckets
        int index = 0;
        for (ArrayList<Float> bucket : buckets) {
            for (float num : bucket) {
                arr[index++] = num;
            }
        }
    }

    public static void main(String[] args) {
        float[] arr = {
            0.78f, 0.17f, 0.39f, 0.26f, 0.72f,
            0.94f, 0.21f, 0.12f, 0.23f, 0.68f
        };

        bucketSort(arr);

        System.out.println("Sorted Array:");
        for (float num : arr) {
            System.out.print(num + " ");
        }
    }
}