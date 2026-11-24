package Modul18;
import java.util.Scanner;
public class soal1 { //Awal dari kelas soal1
    public static void main(String[] args) {
        int[] hitung, cadangan; //Deklarasi variabel hitung dan cadangan bertipe integer array
        hitung = new int[5]; //Deklarasi jumlah indeks array hitung
        cadangan = hitung; //Set isi variabel cadangan sama dengan hitung
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan 5 data bulat");
        //Membaca 5 data bulat
        for (int i = 0; i <= 4; i++){ //Perulangan for i=0 diulangi selama i<=4, menambah nilai i setiap perulangan
            System.out.print("Data ke "+(i+1)+" : ");
            hitung[i] = sc.nextInt(); //Input data dari user untuk dimasukkan ke dalam array hitung
        }
        sc.close();
        for (int i = 0; i <= 4; i++){ //Perulangan for i=0 diulangi selama i<=4, menambah nilai i setiap perulangan
            System.out.println("Data array \"hitung\" ke-"+(i+1)+" adalah "+hitung[i]);
            //Menampilkan isi array hitung
        }
        for (int i = 0; i <= 4; i++) { //Perulangan for i=0 diulangi selama i<=4, menambah nilai i setiap perulangan
            System.out.println("Data array \"cadangan\" ke-"+(i+1)+" adalah "+cadangan[i]);
            //Menampilkan isi array cadangan
        }
    }
} //Akhir dari kelas soal1
