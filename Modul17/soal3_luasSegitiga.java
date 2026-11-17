package Modul17;
import java.util.Scanner;
public class soal3_luasSegitiga {
    
    static int x1, x2, x3, y1, y2, y3;
    static double sisiA, sisiB, sisiC, keliling;
    
    public static void main(String[] args) {
        bacaTitik();
        sisiA=hitungJarak(x1, y1, x2, y2);
        System.out.printf("Panjang sisi A: %.2f%n", sisiA);
        sisiB=hitungJarak(x2, y2, x3, y3);
        System.out.printf("Panjang sisi B: %.2f%n", sisiB);
        sisiC=hitungJarak(x3, y3, x1, y1);
        System.out.printf("Panjang sisi C: %.2f%n", sisiC);
        keliling=hitungKeliling(sisiA, sisiB, sisiC);
        hitungLuas();
        }
    
    static void bacaTitik(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan koordinat x1: ");
        x1 = sc.nextInt();
        System.out.print("Masukkan koordinat y1: ");
        y1 = sc.nextInt();
        System.out.print("Masukkan koordinat x2: ");
        x2 = sc.nextInt();
        System.out.print("Masukkan koordinat y2: ");
        y2 = sc.nextInt();
        System.out.print("Masukkan koordinat x3: ");
        x3 = sc.nextInt();
        System.out.print("Masukkan koordinat y3: ");
        y3 = sc.nextInt();
        sc.close();
    }
    
    static double hitungJarak(double x1, double y1, double x2, double y2){
        double deltaX, deltaY, jarak;
        deltaX=x2-x1;
        deltaY=y2-y1;
        jarak=Math.sqrt((deltaX*deltaX)+(deltaY*deltaY));
        return jarak;
    }
    
    static double hitungKeliling(double sisiA, double sisiB, double sisiC){
        keliling = sisiA + sisiB + sisiC;
        System.out.printf("Kelilingnya adalah: %.2f%n", keliling);
        return keliling;
    }
    static void hitungLuas(){
        double s, luas;
        s=keliling/2.0;
        luas=Math.sqrt(s*(s-sisiA)*(s-sisiB)*(s-sisiC));
        if (luas<=0) System.out.println("Ketiga titik berdekatan, tidak berbentuk segitiga");
        else System.out.printf("Luasnya adalah: %.2f%n", luas);
    }
}
