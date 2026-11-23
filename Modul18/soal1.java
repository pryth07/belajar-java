package Modul18;
import java.util.Scanner;
public class soal1 {
    public static void main(String[] args) {
        int[] hitung, cadangan;
        hitung = new int[5];
        cadangan = hitung;
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan 5 data bulat");
        //Membaca 5 data bulat
        for (int i = 0; i <= 4; i++){
            System.out.print("Data ke "+(i+1)+" : ");
            hitung[i] = sc.nextInt();
        }
        sc.close();
        for (int i = 0; i <= 4; i++){
            System.out.println("Data array 'hitung' ke-"+(i+1)+" adalah "+hitung[i]);
        }
        for (int i = 0; i <= 4; i++) {
            System.out.println("Data array 'cadangan' ke-"+(i+1)+" adalah "+cadangan[i]);
        }
    }
}
