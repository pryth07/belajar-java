package Modul13;
import java.util.Scanner;
public class mangga {
    public static void main(String[] args) {
        int N = 0, i = 1, berat, kecil = 0, sedang = 0, besar = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Banyak mangga yang diproses : ");
        N = sc.nextInt();

        while (i<=N){
            System.out.print("Berat mangga "+i+": ");
            berat = sc.nextInt();
            if (berat < 200){
                kecil++;
            }
            else if (200 <= berat && berat < 600){
                sedang++;
            }
            else if (berat >= 600){
                besar++;
            }
            i++;
        }
        System.out.println();
        
        sc.close();
        System.out.println("Dari "+N+" mangga yang ditimbang:");
        System.out.println("Kecil   : "+kecil);
        System.out.println("Sedang  : "+sedang);
        System.out.println("Besar   : "+besar);
    }
}
