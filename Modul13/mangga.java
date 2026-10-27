package Modul13;
import java.util.Scanner;
public class mangga { //Awal dari kelas mangga
    public static void main(String[] args) {
        int N = 0, i = 1, berat, kecil = 0, sedang = 0, besar = 0;
        /*  Deklarasi variabel N bernilai 0, i bernilai 1, berat,
            kecil bernilai 0, sedang bernilai 0, besar bernilai 0   */
        Scanner sc = new Scanner(System.in); //Menambahkan Scanner untuk menerima input dari user
        System.out.print("Banyak mangga yang diproses : ");
        N = sc.nextInt();
        //Menyimpan berapa banyak mangga yang akan diproses dari input user ke dalam variabel N

        while (i<=N){
            System.out.print("Berat mangga "+i+": ");
            berat = sc.nextInt();
            if (berat < 200){ //Menentukan kategori berat: apakah kecil, sedang, atau besar
                kecil++;
            }
            else if (200 <= berat && berat < 600){  // Menambahkan nilai variabel sebesar 1 
                sedang++;                           // menggunakan increment untuk menghitung 
            }                                       // berapa banyak jumlah buah tersebut berdasarkan kategori:
            else if (berat >= 600){                 // kecil, sedang, atau besar
                besar++;
            }
            i++;
            /*  Menambah nilai variabel i sebesar 1 
                menggunakan increment agar loop berhenti 
                jika i mencapai nilai iterasi N (banyaknya mangga)  */
        }
        System.out.println();
        
        sc.close(); //Menutup Scanner agar tidak terus menggunakan memori
        System.out.println("Dari "+N+" mangga yang ditimbang:");
        System.out.println("Kecil   : "+kecil);
        System.out.println("Sedang  : "+sedang);
        System.out.println("Besar   : "+besar);
    }
} //Akhir dari kelas mangga
