package Modul17;

import java.util.Scanner;

public class soal2_pascal { //Awal dari kelas soal2_pascal
    public static void main(String[] args) {
        long n=0, c=0; //Deklarasi variabel n dan c bernilai 0 bertipe long
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n: ");
        n = sc.nextInt(); //Meminta user untuk memasukkan nilai n
        for (int r = 0; r <= n; r++) { //Melakukan perulangan selama r<=0, menambah nilai r sebesar 1 di akhir perulangan
            c = combinasi(n, r); //Menghitung combinasi n, r
            System.out.print(c+" ");
            }
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
        
        static long combinasi(long n, long r){ //Metode combinasi dengan parameter n dan r bertipe long
            long C = faktorial(n) / (faktorial(n-r)*faktorial(r));
            //Menghitung combinasi dengan rumus n!/((n-r!)r!)
            return C; //Kembali ke nilai awal C
        }
        
    } //Akhir dari kelas soal2_pascal
