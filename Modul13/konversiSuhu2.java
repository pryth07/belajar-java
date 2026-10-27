package Modul13;
import java.util.Scanner;
public class konversiSuhu2 { //Awal dari kelas konversiSuhu2
    public static void main(String[] args) {
        int n=1,c,r,f;
        //Deklarasi variabel n bernilai 1, c, r, dan f bertipe integer
        Scanner sc = new Scanner(System.in);
        //Menambahkan Scanner untuk menerima input dari user
        while (n<=10){
            System.out.print("Masukkan suhu Celcius ke-"+n+": ");
            c = sc.nextInt();
            //Menyimpan nilai suhu Celcius yang dimasukkan oleh user ke dalam variabel c
            r = 4*c/5;
            f = 9*c/5 + 32;
            /*  Menghitung nilai Reamur dengan rumus "R = 4/5 * C" atau "R = 4*C/5" (sama saja)
                Menghitung nilai Fahrenheit dengan rumus "F = 9/5 * C + 32" atau "F = 9/5 * C + 32" (sama saja)
                Di atas saya tukar karena saya menggunakan integer, karena integer 
                tidak dapat menyimpan nilai bilangan desimal.   */
            System.out.println("Hasil konversi Reamur: "+r);
            System.out.println("Hasil konversi Fahrenheit: "+f);
            System.out.println();
            n++;
        }
        sc.close(); //Menutup Scanner agar tidak terus menggunakan memori
    }
} //Akhir dari konversiSuhu2
