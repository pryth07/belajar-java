package Modul15;
import java.util.Scanner;
public class fibonacci { //Awal dari kelas fibonacci
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0, n1 = 1, n2 = 1, jumlah = 0;
        //Deklarasi variabel n bernilai 0, n1 dan n2 bernilai 1, dan jumlah bernilai 0 bertipe integer (bilangan bulat)
        do{ //Meminta user untuk input N
            System.out.print("Masukkan N: ");
            n = sc.nextInt();
            if (n<=0){ //Jika input user belum lebih dari 0, menampilkan pesan agar user memasukkan input lebih dari 0
                System.out.println("Masukkan angka lebih dari 0!");
            }
        } while (n<=0); //Diulangi selama N belum lebih dari 0
        sc.close(); //Menutup Scanner sc agar tidak terus menggunakan memori
        for (int i = 0; i < n; i++) { //Perulangan selama nilai i kurang dari n, menambah nilai i sebesar 1 setiap perulangan
            System.out.println(n1+" ");
            jumlah = n1 + n2; //Menghitung jumlah dengan n1+n2
            n1 = n2; //Menginisialisasi variabel n1 sebagai n2
            n2 = jumlah; //Menginisialisasi variabel n2 sebagai jumlah
        }
    }
} //Akhir dair kelas fibonacci
