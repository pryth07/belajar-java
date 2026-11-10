package Modul16;
import java.util.Scanner;
public class soal1_matrixIdentitas { //Awal dari kelas soal1_matrixIdentitas
    public static void main(String[] args) {
        int n; //Deklarasi variabel n bertipe integer
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan N: ");
        n = sc.nextInt(); //Meminta input n dari user dan disimpan di variabel n
        for (int i = 1; i <= n; i++) { //Melakukan perulangan selama i<=n, menambah nilai i sebesar 1 setiap perulangan
            for (int j = 1; j <= n; j++) { //Melakukan perulangan selama j<=n, menambah nilai j sebesar 1 setiap perulangan
                if (i == j){ //Jika nilai i sama dengan j, tampilkan angka 1
                    System.out.print("1 ");
                }
                else{ //Jika tidak, tampilkan angka 0
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
        sc.close(); //Menutup Scanner sc agar tidak terus menggunakan memori
    }    
} //Akhir dari kelas soal1_matrixIdentitas
