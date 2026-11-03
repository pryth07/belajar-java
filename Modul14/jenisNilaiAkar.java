package Modul14;
import java.util.Scanner; //
public class jenisNilaiAkar { //Awal dari kelas jenisNilaiAkar
    public static void main(String[] args) {
        double a, b, c, D, x1, x2; //Deklarasi variabel bertipe double (bilangan real)
        Scanner dataKuadrat = new Scanner(System.in);
        do{ //Meminta input koefisien a
            System.out.print(" Koefisien x2 (a) : ");
            a = dataKuadrat.nextDouble(); 
        } while (a<=0); //Diulangi selama a kurang dari sama dengan 0
        System.out.print(" Koefisien x (b) : "); //Meminta input koefisien b
        b = dataKuadrat.nextDouble();
        System.out.print(" Konstanta (c) : "); //Meminta input konstanta c
        c = dataKuadrat.nextDouble();
        dataKuadrat.close(); //Menutup Scanner dataKuadrat agar terus menggunakan memori

        D = b*b - (4*a*c); //Menghitung nilai D

        if (D < 0 || a == 0) { //Percabangan jika D kurang dari 0 atau a sama dengan 0
        System.out.println("Tidak mempunyai akar nyata/real");
        }
        else if (D == 0) { //Percabangan jika D sama dengan 0
        x1 = -b/(2*a); //Menghitung akar tunggal dengan rumus -b/(2a)
        System.out.println("Akarnya tunggal yakni : "+x1);
        }
        else { //Percabangan jika tidak memenuhi kedua situasi di atas
        x1 = (-b + Math.sqrt(D))/ (2*a); //Menghitung akar pertama dengan rumus (-b + akar D) / 2a
        x2 = (-b - Math.sqrt(D))/ (2*a); //Menghitung akar pertama dengan rumus (-b - akar D) / 2a
        System.out.println("Akar pertama : "+x1);
        System.out.println("Akar kedua : "+x2);
        }
    }
} //Akhir dari kelas jenisNilaiAkar
