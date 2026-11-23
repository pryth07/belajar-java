package Modul18;
import java.util.Scanner;
public class soal2 {
    public static void main(String[] args) {
        int jumlah=0, rataRata, max=0, min=0;
        int[] hitung;
        hitung = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan 5 data bulat:");
        for(int i = 0; i < hitung.length; i++){
            System.out.print("Data ke "+(i+1)+" : ");
            hitung[i] = sc.nextInt();
            if (hitung[i]==1){
                max=hitung[i];
            }
            else if (hitung[i]>max){
                max=hitung[i];
            }
            if (hitung[i]==1){
                min=hitung[i];
            }
            else if (hitung[i]<min){
                min=hitung[i];
            }
        }
        sc.close();
        for (int i = 0; i < hitung.length; i++){
            System.out.println("Data ke-"+(i+1)+" adalah "+hitung[i]);
            jumlah+=hitung[i];
        }
        System.out.println("Jumlah isi elemen array adalah "+jumlah);
        rataRata=jumlah/hitung.length;
        System.out.println("Rata-rata adalah "+rataRata);
        System.out.println("Nilai maksimum adalah "+max);
        System.out.println("Nilai minimum adalah "+min);
    }
}
