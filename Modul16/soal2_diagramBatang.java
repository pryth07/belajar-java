package Modul16;
import java.util.Scanner;
public class soal2_diagramBatang {
    public static void main(String[] args) {
        int n, usia, a=0, b=0, c=0, d=0, e=0;
        String diagram = "*";
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Masukkan jumlah penduduk: ");
            n = sc.nextInt();
            if (n<=0){
                System.out.println("Masukkan lebih dari 0!");
            }
        } while (n<=0);
        
        do {
            for (int i = 1; i <= n; i++) {
                System.out.print("Usia warga "+i+": ");
                usia = sc.nextInt();
                if (usia>=0 && usia<=20){
                    a++;
                }
                else if (usia>=21 && usia<=40){
                    b++;
                }
                else if (usia>=41 && usia<=60){
                    c++;
                }
                else if (usia>=61 && usia<=80){
                    d++;
                }
                else{
                    e++;
                }
            }
            if (n<0){
                System.out.println("Masukkan 0 atau lebih!");
            }
        } while (n<0);
        sc.close();
        System.out.println();
        System.out.println("Distribusi usia "+n+" penduduk di atas adalah:");
        System.out.println();
        System.out.println("0-20    : "+(diagram.repeat(a)));
        System.out.println("21-40   : "+(diagram.repeat(b)));
        System.out.println("41-60   : "+(diagram.repeat(c)));
        System.out.println("61-80   : "+(diagram.repeat(d)));
        System.out.println("81-100  : "+(diagram.repeat(e)));
    }
}
