package Modul17;
import java.util.Scanner;
public class soal1_metode { //Awal dari kelas soal1_metode
    public static void main(String[] args) {
        long fakN=0, fakR=0, n=0, r=0, c=0;
        //Deklarasi variabel fakN, fakR, n, r, c bernilai 0 bertipe long
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n: ");
        n = sc.nextInt(); //Meminta user untuk input nilai n
        do { 
            System.out.print("Masukkan nilai r: ");
            r = sc.nextInt(); //Meminta user untuk input nilai r
            if (r>n) System.out.println("Nilai r tidak boleh lebih besar dari n");
        } while (r>n); //Diulangi selama input user terhadap nilai r lebih besar dari nilai n
        fakN = faktorial(n); //Menghitung faktorial dari n
        fakR = faktorial(r); //Menghitung faktorial dari r
        c = fakN / (faktorial(n-r)*fakR); //Menghitung combinasi
        System.out.println("Nilai dari n! adalah "+fakN);
        System.out.println("Nilai dari r! adalah "+fakR);
        System.out.println("Kombinasinya adalah "+c);
        sc.close();
        }
        
        static long faktorial(long f){ //Metode faktorial dengan parameter f bertipe long
            long hasFak=1; //Deklarasi variabel hasFak bernilai 1 bertipe long
            if (f == 0) return 1;
            //Jika f adalah 0, maka set hasil ke 1. Karena faktorial 0 adalah 1
            //Jika tidak, mengulangi menambah nilai hasFak dengan hasFak yang dikalikan dengan i, selama i<=f
            else for(int i =1; i<=f; i++) hasFak = hasFak*i; 
            return hasFak; //Kembali ke nilai awal hasFak
        }
    } //Akhir dari kelas soal1_metode
