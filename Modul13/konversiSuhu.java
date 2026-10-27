package Modul13;
import java.util.Scanner;
public class konversiSuhu { //Awal dari kelas konversiSuhu
    public static void main(String[] args) {
        int c, r, f, min, max, selisih;
        //Deklarasi variabel c, r, f, min, max, selisih bertipe integer
        Scanner sc = new Scanner(System.in);
        //Menambahkan Scanner untuk menerima input dari user
        System.out.println("Tabel Konversi Celcius ke Reamur dan Fahrenheit");
        System.out.print("Masukkan nilai suhu minimum: ");
        min = sc.nextInt();
        //Menyimpan nilai suhu minimum yang dimasukkan user ke dalam variabel min
        System.out.print("Masukkan nilai suhu maksimum: ");
        max = sc.nextInt();
        //Menyimpan nilai suhu maksimum yang dimasukkan user ke dalam variabel max
        System.out.print("Masukkan selisih kenaikan: ");
        selisih = sc.nextInt();
        //Menyimpan selisih kenaikan suhu yang dimasukkan user ke dalam variabel selisih
        sc.close(); //Menutup Scanner agar tidak terus menggunakan memori
        System.out.println();
        System.out.println("Celcius\tReamur\tFahrenheit");
        c = min; //Mendeklarasikan nilai Celcius sebagai suhu maksimum
        while (c<=max){ //Melakukan loop selama nilai Celcius kurang dari sama dengan maksimum
            r = 4*c/5;
            f = 9*c/5 + 32;
            /*  Menghitung nilai Reamur dengan rumus "R = 4/5 * C" atau "R = 4*C/5" (sama saja)
                Menghitung nilai Fahrenheit dengan rumus "F = 9/5 * C + 32" atau "F = 9/5 * C + 32" (sama saja)
                Di atas saya tukar karena saya menggunakan integer, karena integer 
                tidak dapat menyimpan nilai bilangan desimal.   */
            System.out.println(c+"\t"+r+"\t"+f);
            c = c + selisih;
            //Menambah nilai Celcius dengan besar selisihnya untuk menghitung konversinya
        }
    }
} //Akhir dari kelas konversiSuhu
