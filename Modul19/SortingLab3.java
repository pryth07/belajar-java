package Modul19;
import java.util.Arrays;
public class SortingLab3 {
    static int[] data = {1,2,4,3,5};
    static int[] a = data.clone();
    static int[] b = data.clone();
    static int[] c = data.clone();
    static int bubComp, bubSwap;
    static int selComp, selSwap;
    static int insComp, insShift;
    static void bubbleSort(int[] data) { 
        int n = data.length;
        bubComp = 0;
        //Set bubComp bernilai 0
        bubSwap = 0;
        //Set bubSwap bernilai 0
        for (int i = 0; i < n - 1; i++) {
        //Perulangan for i sama dengan 0, diulangi selama i kurang dari n-1, menambah nilai i setiap perulangan
            boolean swapped = false;
            //Deklarasi variabel swapped bertipe boolean bernilai false
            for (int j = 0; j < n - 1 - i; j++) {
            //Perulangan for j sama dengan 0, diulangi selama j kurang dari n-1-i, menambah nilai j setiap perulangan
                bubComp++;
                //Tambah nilai bubComp sebesar 1
                if (data[j] > data[j + 1]) {
                //Jika isi array data index j lebih besar dari index j+1
                    int temp = data[j];
                    //Set data index j ke dalam variabel temp, fungsinya adalah untuk tempat menaruh nilai sementara
                    data[j] = data[j + 1];
                    //Set data index j+1 ke dalam data index j
                    data[j + 1] = temp;
                    //Set temp ke dalam data index j+1
                    bubSwap++;
                    //Tambah nilai bubSwap sebesar 1
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
        selComp = 0;
        //Set selComp bernilai 0
        selSwap = 0;
        //Set selSwap bernilai 0
        for (int i = 0; i < n - 1; i++) {
        //Perulangan for i sama dengan 0, diulangi selama i kurang dari n-1, menambah nilai i setiap perulangan
            int minIndex = i;
            //Set minIndex bernilai sama dengan i, fungsinya untuk menentukan nilai minimum yang akan ditukar
            for (int j = i + 1; j < n; j++) {
            //Perulangan for j sama dengan 0, diulangi selama j kurang dari n-1-i, menambah nilai j setiap perulangan
                selComp++;
                //Tambah nilai selComp sebesar 1
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
                selSwap++;
                //Tambah nilai selSwap sebesar 1
            }
        }
    }
    static void insertionSort(int[] data) {
        insComp = 0;
        //Set insComp bernilai 0
        insShift = 0;
        //Set insShift bernilai 0
        for (int i = 1; i < data.length; i++) {
        //Perulangan for i sama dengan 0, diulangi selama i kurang dari n-1, menambah nilai i setiap perulangan
            int key = data[i];
            //Deklarasi variabel key bernilai isi data index i, fungsinya untuk menyisipkan satu elemen setelah elemen yang lain digeser
            int j = i - 1;
            //Deklarasi variabel j bernilai i-1
            while (j >= 0) {
            //Selama j lebih dari sama dengan 0
                insComp++; //Tambah nilai insComp sebesar 1
                if (data[j] <= key) break;
                data[j + 1] = data[j];
                //Geser data index j ke data index j+1
                insShift++;
                //Tambah nilai insShift sebesar 1
                j--;
                //Kurangi nilai j sebesar 1
            }
            data[j + 1] = key;
            //Set key ke dalam data index j+1
        }
    }
    static void printArray(){
        System.out.println("Bubble : " + Arrays.toString(a));
        System.out.println("Comparisons: "+bubComp+", swaps: "+bubSwap);
        System.out.println("Selection : " + Arrays.toString(b));
        System.out.println("Comparisons: "+selComp+", swaps: "+selSwap);
        System.out.println("Insertion : " + Arrays.toString(c));
        System.out.println("Comparisons: "+insComp+", shifts: "+insShift);
    }
    public static void main(String[] args) {
        bubbleSort(a);
        selectionSort(b);
        insertionSort(c);
        printArray();
    }
}