package Modul13;
import java.util.Scanner;
public class ratarata { //Awal dari kelas ratarata
    public static void main(String[] args) {
        int i=1, N, data, jumlah = 0, rataRata;
        //Deklarasi variabel i bernilai 1, N, data, jumlah bernilai 0, dan rataRata bertipe integer
        Scanner sc = new Scanner(System.in);
        //Menambahkan Scanner untuk menerima input dari user
        System.out.print("Banyak data yang akan diproses = ");
        N = sc.nextInt();
        //Menyimpan banyaknya data yang diproses dari input user ke dalam variabel N
        while (i<=N){ //Melakukan loop selama nilai i kurang dari sama dengan N
            System.out.print("Data ke "+i+" : ");
            data = sc.nextInt();
            //Menyimpan angka data yang dari input user dan disimpan ke variabel data
            jumlah = jumlah + data;
            //Menghitung jumlah total data dengan menambahkan nilai variabel jumlah dengan data
            i++;
            /*  Menambah nilai variabel i sebesar 1 
                menggunakan increment agar loop berhenti 
                jika i mencapai nilai iterasi N (banyaknya data)    */
        }
        sc.close(); //Menutup Scanner agar tidak terus menggunakan memori
        rataRata = jumlah/N;
        /*  Menghitung rata-rata dari data tersebut dengan 
            menambah nilai per data dan dibagi dengan N  */
        System.out.println("Rata-rata data adalah = "+rataRata);
    }
} //Akhir dari kelas ratarata
