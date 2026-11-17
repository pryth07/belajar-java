package Modul17;
import java.util.Scanner;
public class soal3_luasSegitiga { //Awal dari kelas soal3_luasSegitiga
    static int x1, x2, x3, y1, y2, y3;
    static double sisiA, sisiB, sisiC, keliling;
        public static void main(String[] args) {
        bacaTitik(); //Memanggil metode bacaTitik
        sisiA=hitungJarak(x1, y1, x2, y2);
        //Menghitung cakupan jarak sisiA dengan memanggil metode hitungJarak
        System.out.printf("Panjang sisi A: %.2f%n", sisiA);
        sisiB=hitungJarak(x2, y2, x3, y3); 
        //Menghitung cakupan jarak sisiB dengan memanggil metode hitungJarak
        System.out.printf("Panjang sisi B: %.2f%n", sisiB);
        sisiC=hitungJarak(x3, y3, x1, y1); 
        //Menghitung cakupan jarak sisiC dengan memanggil metode hitungJarak
        System.out.printf("Panjang sisi C: %.2f%n", sisiC);
        keliling=hitungKeliling(sisiA, sisiB, sisiC);
        //Menghitung keliling segitiga dengan memanggil metode hitungKeliling
        hitungLuas(); //Memanggil metode hitungLuas
        }
    
    static void bacaTitik(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan koordinat x1: ");
        x1 = sc.nextInt(); //Meminta user untuk input koordinat x1
        System.out.print("Masukkan koordinat y1: ");
        y1 = sc.nextInt(); //Meminta user untuk input koordinat y1
        System.out.print("Masukkan koordinat x2: ");
        x2 = sc.nextInt(); //Meminta user untuk input koordinat x2
        System.out.print("Masukkan koordinat y2: ");
        y2 = sc.nextInt(); //Meminta user untuk input koordinat y2
        System.out.print("Masukkan koordinat x3: ");
        x3 = sc.nextInt(); //Meminta user untuk input koordinat x3
        System.out.print("Masukkan koordinat y3: ");
        y3 = sc.nextInt(); //Meminta user untuk input koordinat y2
        sc.close();
    }
    
    static double hitungJarak(double x1, double y1, double x2, double y2){
    //Metode hitungJarak dengan parameter x1, x2, y1, dan y2 bertipe double
        double deltaX, deltaY, jarak; //Deklarasi variabel deltaX, deltaY, dan jarak bertipe double
        deltaX=x2-x1; //Menghitung deltaX dengan rumus mengurangi x2 dengan x1
        deltaY=y2-y1; //Menghitung deltaX dengan rumus mengurangi y2 dengan y1
        jarak=Math.sqrt((deltaX*deltaX)+(deltaY*deltaY)); //Menghitung jarak dengan rumus akar dari deltaX^2 ditambah deltaY^2
        return jarak;
    }
    
    static double hitungKeliling(double sisiA, double sisiB, double sisiC){
    //Metode hitungKeliling dengan parameter sisiA, sisiB, dan sisiC bertipe double
        keliling = sisiA + sisiB + sisiC; //Menghitung keliling dengan menjumlahkan semua sisi
        System.out.printf("Kelilingnya adalah: %.2f%n", keliling);
        return keliling; //Kembali ke nilai awal keliling
    }
    static void hitungLuas(){ //Metode hitungLuas bertipe void
        double s, luas; //Deklarasi variabel s dan luas bertipe double
        s=keliling/2.0; //Menghitung setengah keliling
        luas=Math.sqrt(s*(s-sisiA)*(s-sisiB)*(s-sisiC));
        if (luas<=0) System.out.println("Ketiga titik berdekatan, tidak berbentuk segitiga");
        //Memberi pesan jika luas<=0
        //Jika tidak, langsung menampilkan berapa luasnya
        else System.out.printf("Luasnya adalah: %.2f%n", luas);
    }
} //Akhir dari kelas soal3_luasSegitiga
