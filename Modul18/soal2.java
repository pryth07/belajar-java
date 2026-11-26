package Modul18;
import java.util.Scanner;
public class soal2 { //Awal dari kelas soal2
    public static void main(String[] args) {
        int jumlah=0, rataRata, max=0, min=0;
        //Deklarasi variabel jumlah, rataRata, max, dan min bernilai 0 bertipe integer
        int[] hitung; //Deklarasi variabel hitung bertipe integer array
        hitung = new int[5]; //Deklarasi jumlah indeks array hitung
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan 5 data bulat:");
        for(int i = 0; i < hitung.length; i++){ //Perulangan for i=0 diulangi selama i<5, menambah nilai i setiap perulangan
            System.out.print("Data ke "+(i+1)+" : ");
            hitung[i] = sc.nextInt(); //Input data dari user untuk dimasukkan ke dalam array hitung
            if (i==0){ //Jika i sama dengan 0,
                max=hitung[i]; //set max sama dengan index i array hitung
            }
            else if (hitung[i]>max){ //Jika tidak, jika index i array hitung lebih besar dari max,
                max=hitung[i]; //set max sama dengan index i array hitung
            }
            if (i==0){ //Jika i sama dengan 0,
                min=hitung[i]; //set min sama dengan index i array hitung
            }
            else if (hitung[i]<min){ //Jika tidak, jika index i array hitung lebih kecil dari min,
                min=hitung[i]; //set min sama dengan index i array hitung
            }
        }
        sc.close(); //Menutup Scanner sc agar tidak terus menggunakan memori
        for (int i = 0; i < hitung.length; i++){ //Perulangan for i=0 diulangi selama i<5, menambah nilai i setiap perulangan
            System.out.println("Data ke-"+(i+1)+" adalah "+hitung[i]);
            jumlah+=hitung[i]; //Menambah nilai variabel jumlah dengan nilai index i array hitung
        }
        System.out.println("Jumlah isi elemen array adalah "+jumlah);
        rataRata=jumlah/hitung.length; //Menghitung rata-rata dari isi elemen array hitung
        System.out.println("Rata-rata adalah "+rataRata);
        System.out.println("Nilai maksimum adalah "+max);
        System.out.println("Nilai minimum adalah "+min);
    }
} //Akhir dari kelas soal2
