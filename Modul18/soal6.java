package Modul18;
import java.util.Scanner;
public class soal6 {
    static String[] nim, nama;
    static double[] us1, us2, uas, totalNil;
    static char[] finalNil = {'A', 'B', 'C', 'D', 'E'};
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Masukkan berapa jumlah mahasiswa yang ingin dihitung nilainya: ");
        n = sc.nextInt();
    }
    static void data(){
        int n;
        for (int i = 1; i <= n; i++) {
            System.out.println("Data mahasiswa ke-"+i);
            do{ //Meminta input nilai UTS 1
                System.out.print("Masukkan nilai UTS 1: ");
                us1[i] = sc.nextDouble();
                if (us1[i]<0){ //Jika input kurang dari 0, memberikan pesan agar user memasukkan input lebih dari 0
                    System.out.println("Masukkan 0 atau lebih!");
                }
                } while (us1[i]<0); //Diulangi selama input user belum 0 atau lebih
            do{ //Meminta input nilai UTS 2
                System.out.print("Masukkan nilai UTS 2: "); //Input nilai UTS 2 menggunakan Scanner
                us2[i] = sc.nextDouble();
                if (us2[i]<0){ //Jika input kurang dari 0, memberikan pesan agar user memasukkan input lebih dari 0
                    System.out.println("Masukkan 0 atau lebih!");
                }
                } while (us2[i]<0); //Diulangi selama input user belum 0 atau lebih
                do{ //Meminta input nilai UAS
                System.out.print("Masukkan nilai UAS: "); //Input nilai UAS menggunakan Scanner
                uas[i] = sc.nextDouble();
                if (uas[i]<0){ //Jika input kurang dari 0, memberikan pesan agar user memasukkan input lebih dari 0
                    System.out.println("Masukkan 0 atau lebih!");
                }
                } while (uas[i]<0); //Diulangi selama input user belum 0 atau lebih
        }
    }
    static void totalNilai(){
        
    }
}
