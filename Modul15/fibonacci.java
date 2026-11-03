package Modul15;
import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0, n1 = 1, n2 = 1, jumlah = 0;
        do{
            System.out.print("Masukkan N: ");
            n = sc.nextInt();
            if (n<=0){
                System.out.println("Masukkan angka lebih dari 0!");
            }
        } while (n<=0);
        sc.close();
        for (int i = 0; i < n; i++) {
            System.out.println(n1);
            jumlah = n1 + n2;
            n1 = n2;
            n2 = jumlah;
        }
    }
}
