package Modul14;
import java.util.Scanner;
public class nilaifinal { //Awal dari kelas nilaifinal
    public static void main(String[] args) {
        int uts1, uts2, uas; //Deklarasi variabel uts1, uts2, dan uas bertipe integer
        double total; //Deklarasi variabel total bertipe double
        Scanner nilai = new Scanner(System.in);
        do{
        System.out.print("Masukkan nilai UTS 1: "); //Input nilai UTS 1 menggunakan Scanner
        uts1 = nilai.nextInt();
        if (uts1<0){
            System.out.println("Masukkan 0 atau lebih!");
            }
        } while (uts1<0);
        do{
        System.out.print("Masukkan nilai UTS 2: "); //Input nilai UTS 2 menggunakan Scanner
        uts2 = nilai.nextInt();
        if (uts2<0){
            System.out.println("Masukkan 0 atau lebih!");
            }
        } while (uts2<0);
        do{
        System.out.print("Masukkan nilai UAS: "); //Input nilai UAS menggunakan Scanner
        uas = nilai.nextInt();
        if (uas<0){
            System.out.println("Masukkan 0 atau lebih!");
        }
        } while (uas<0);
        nilai.close();
        total = ((0.3*uts1)+(0.3*uts2)+(0.4*uas)); //Rumus nilai total
        if (total >= 80)
            System.out.println("Nilai akhir adalah A"); //Output jika nilai total lebih dari sama dengan 80
        else if (65 <= total && total < 80)
            System.out.println("Nilai akhir adalah B"); //Output jika 65 kurang dari sama dengan nilai total kurang dari 80
        else if (55 <= total && total < 65)
            System.out.println("Nilai akhir adalah C"); //Output jika 55 kurang dari sama dengan nilai total kurang dari 65
        else if (50 <= total && total < 55)
            System.out.println("Nilai akhir adalah D"); //Output jika 50 kurang dari sama dengan nilai total kurang dari 55
        else if (total < 50)
            System.out.println("Nilai akhir adalah E"); //Output jika nilai total kurang dari 50
    }
} //Akhir dari kelas nilaifinal