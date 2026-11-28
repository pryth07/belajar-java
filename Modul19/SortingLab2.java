package Modul19;
import java.util.Arrays;
public class SortingLab2 {
    static int[] data = {7, 2, 5, 1, 9};
    static int[] a = data.clone();
    static int[] b = data.clone();
    static int[] c = data.clone();
    static void bubbleSort(int[] data) { 
        int n = data.length;
        for (int i = 0; i < n - 1; i++) {
        //Perulangan for i sama dengan 0, diulangi selama i kurang dari n-1, menambah nilai i setiap perulangan
            boolean swapped = false;
            //Deklarasi variabel swapped bertipe boolean bernilai false
            for (int j = 0; j < n - 1 - i; j++) {
            //Perulangan for j sama dengan 0, diulangi selama j kurang dari n-1-i, menambah nilai j setiap perulangan
                if (data[j] > data[j + 1]) {
                //Jika isi array data index j lebih besar dari index j+1
                    int temp = data[j];
                    //Set data index j ke dalam variabel temp, fungsinya adalah untuk tempat menaruh nilai sementara
                    data[j] = data[j + 1];
                    //Set data index j+1 ke dalam data index j
                    data[j + 1] = temp;
                    //Set temp ke dalam data index j+1
                    swapped = true;
                    //Set swapped menjadi true
                }
            }
            if (!swapped) break;
            //Jika swapped bernilai not false (true), keluar dari perulangan
        }
    }
    static void selectionSort(int[] data) {
        int n = data.length;
        //Deklarasi variabel n bernilai banyaknya index data
        for (int i = 0; i < n - 1; i++) {
        //Perulangan for i sama dengan 0, diulangi selama i kurang dari n-1, menambah nilai i setiap perulangan
            int minIndex = i;
            //Set minIndex bernilai sama dengan i, fungsinya untuk menentukan nilai minimum yang akan ditukar
            for (int j = i + 1; j < n; j++) {
            //Perulangan for j sama dengan 0, diulangi selama j kurang dari n-1-i, menambah nilai j setiap perulangan
                if (data[j] < data[minIndex]) {
                //Jika data index j lebih kecil dari data index minIndex
                    minIndex = j;
                    //Set minIndex menjadi j
                }
            }
            if (minIndex != i) {
            //Jika minIndex tidak sama dengan i
                int temp = data[i];
                //Set data index i ke dalam temp
                data[i] = data[minIndex];
                //Set data index minIndex ke dalam data index i
                data[minIndex] = temp;
                //Set temp ke dalam data index minIndex
            }
        }
    }
    static void insertionSort(int[] data) {
        for (int i = 1; i < data.length; i++) {
        //Perulangan for i sama dengan 0, diulangi selama i kurang dari n-1, menambah nilai i setiap perulangan
            int key = data[i];
            //Deklarasi variabel key bernilai isi data index i, fungsinya untuk menyisipkan satu elemen setelah elemen yang lain digeser
            int j = i - 1;
            //Deklarasi variabel j bernilai i-1
            while (j >= 0 && data[j] > key) {
            //Selama j lebih dari sama dengan 0 dan data index j bernilai lebih dari nilai key
                data[j + 1] = data[j];
                //Set data index j ke dalam data index j+1
                j--;
                //Kurangi nilai j sebesar 1
            }
            data[j + 1] = key;
            //Set key ke dalam data index j+1
        }
    }
    static void printArray(){
        System.out.println("Bubble : " + Arrays.toString(a));
        System.out.println("Selection : " + Arrays.toString(b));
        System.out.println("Insertion : " + Arrays.toString(c));
    }
    public static void main(String[] args) {
        bubbleSort(a);
        selectionSort(b);
        insertionSort(c);
        printArray();
    }
}