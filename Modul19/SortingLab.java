package Modul19;
import java.util.Arrays;
public class SortingLab {
    static void bubbleSort(int[] data) {
        int n = data.length;
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (data[j] > data[j + 1]) {
                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }
    static void selectionSort(int[] data) {
        int n = data.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (data[j] < data[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = data[i];
                data[i] = data[minIndex];
                data[minIndex] = temp;
            }
        }
    }
    static void insertionSort(int[] data) {
        for (int i = 1; i < data.length; i++) {
            int key = data[i];
            int j = i - 1;
            while (j >= 0 && data[j] > key) {
                data[j + 1] = data[j];
                j--;
            }
            data[j + 1] = key;
        }
    }
    public static void main(String[] args) {
        int[] data = {5, 1, 4, 2, 8};
        int[] a = data.clone();
        int[] b = data.clone();
        int[] c = data.clone();
        bubbleSort(a);
        selectionSort(b);
        insertionSort(c);
        System.out.println("Bubble : " + Arrays.toString(a));
        System.out.println("Selection : " + Arrays.toString(b));
        System.out.println("Insertion : " + Arrays.toString(c));
    }
}