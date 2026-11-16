package Modul17;

import java.util.Scanner;

public class soal2_pascal {
    public static void main(String[] args) {
        long n=0, c=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n: ");
        n = sc.nextInt();
        for (int r = 0; r <= n; r++) {
            c = combinasi(n, r);
            System.out.print(c+" ");
            }
            sc.close();
        }
        
        static long faktorial(long f){
            long hasFak=1;
            if (f == 0) return 1;
            else for(int i=1; i<=f; i++) hasFak = hasFak*i;
            return hasFak;
        }
        
        static long combinasi(long n, long r){
            long C = faktorial(n) / (faktorial(n-r)*faktorial(r));
            return C;
        }
        
    }
