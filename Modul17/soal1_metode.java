package Modul17;
import java.util.Scanner;
public class soal1_metode {
    public static void main(String[] args) {
        long fakN=0, fakR=0, n=0, r=0, c=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n: ");
        n = sc.nextInt();
        do {
            System.out.print("Masukkan nilai r: ");
            r = sc.nextInt();
            if (r>n) System.out.println("Nilai r tidak boleh lebih besar dari n");
        } while (r>n);
        fakN = faktorial(n);
        fakR = faktorial(r);
        c = fakN / (faktorial(n-r)*fakR);
        System.out.println("Nilai dari n! adalah "+fakN);
        System.out.println("Nilai dari r! adalah "+fakR);
        System.out.println("Kombinasinya adalah "+c);
        sc.close();
        }
        
        static long faktorial(long f){
            long hasFak=1;
            if (f == 0) return 1;
            else for(int i =1; i<=f; i++) hasFak = hasFak*i;
            return hasFak;
            }
    }
