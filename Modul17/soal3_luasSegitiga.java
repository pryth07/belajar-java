package Modul17;
import java.util.Scanner;
public class soal3_luasSegitiga {
    public static void main(String[] args) {
        bacaTitik();
        }
    
    static int bacaTitik(){
        int x=0,y=0;
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 3; i++) {
            System.out.print("Masukkan koordinat x"+i+": ");
            x = sc.nextInt();
            System.out.print("Masukkan koordinat y"+i+": ");
            y = sc.nextInt();
        }
        sc.close();
        return x;
    }
    
    static int hitungJarak(int x1, int y1, int x2, int y2, int x3, int y3){
        int jarak=0;
        return jarak;
    }
    
    static int hitungKeliling(double sisiA, double sisiB, double sisiC){
        int kelSeg=0, jum=0;
        return (kelSeg | jum);
    }
    static int hitungLuas(){
        int ireng=1;
        return ireng;
    }
}
