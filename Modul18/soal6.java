package Modul18;
import java.util.Scanner;
public class soal6 {
    static String[] nim, nama;
    static double[] us1, us2, uas, totalNil;
    static char[] finalNil;
    static int n;
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Masukkan berapa jumlah mahasiswa yang ingin dihitung nilainya: ");
        n = sc.nextInt();
        nim = new String[n];
        nama = new String[n];
        us1 = new double[n];
        us2 = new double[n];
        uas = new double[n];
        totalNil = new double[n];
        finalNil = new char[n];
        data();
        nilai();
        tabel();
        System.out.println();
        sortNilai();
        tabelTerbaik();
        
    }
    static void data(){
        for (int i = 0; i < n; i++) {
            System.out.println("Data mahasiswa ke-"+(i+1));
            System.out.print("Masukkan NIM: ");
            nim[i] = sc.next();
            sc.nextLine();
            System.out.print("Masukkan nama: ");
            nama[i] = sc.nextLine();
            do{
                System.out.print("Masukkan nilai US 1: "); //Input nilai US 1 menggunakan Scanner
                us1[i] = sc.nextDouble();
                if (us1[i]<0){ //Jika input kurang dari 0, memberikan pesan
                    System.out.println("Masukkan 0 atau lebih!");
                }
                else if (us1[i]>100){ //Jika input lebih dari 100, memberikan pesan
                    System.out.println("Nilai maksimal 100!");
                }
                } while (us1[i]<0 || us1[i]>100); //Diulangi jika input user di bawah 0 atau di atas 100
            do{ //Meminta input nilai UTS 2
                System.out.print("Masukkan nilai US 2: "); //Input nilai US 2 menggunakan Scanner
                us2[i] = sc.nextDouble();
                if (us2[i]<0){ //Jika input kurang dari 0, memberikan pesan
                    System.out.println("Masukkan 0 atau lebih!");
                }
                else if (us2[i]>100){ //Jika input lebih dari 100, memberikan pesan
                    System.out.println("Nilai maksimal 100!");
                }
                } while (us2[i]<0 || us2[i]>100); //Diulangi jika input user di bawah 0 atau di atas 100
                do{ //Meminta input nilai UAS
                System.out.print("Masukkan nilai UAS: "); //Input nilai UAS menggunakan Scanner
                uas[i] = sc.nextDouble();
                if (uas[i]<0){ //Jika input kurang dari 0, memberikan pesan
                    System.out.println("Masukkan 0 atau lebih!");
                }
                else if (uas[i]>100){ //Jika input lebih dari 100, memberikan pesan
                    System.out.println("Nilai maksimal 100!");
                }
                } while (uas[i]<0 || uas[i]>100); //Diulangi jika input user di bawah 0 atau di atas 100
        }
    }
    static void nilai(){
        for (int i = 0; i < n; i++) {
            totalNil[i] = ((0.3*us1[i])+(0.3*us2[i])+(0.4*uas[i]));
            if (totalNil[i] >= 80){
                finalNil[i] = 'A';
            }
            else if (65 <= totalNil[i] && totalNil[i] < 80){
                finalNil[i] = 'B';
            }
            else if (55 <= totalNil[i] && totalNil[i] < 65){
                finalNil[i] = 'C';
            }
            else if (50 <= totalNil[i] && totalNil[i] < 55){
                finalNil[i] = 'D';
            }
            else{
                finalNil[i] = 'E';
            }
        }
    }
    
    static void tabel(){
        System.out.println("Daftar Nilai Mahasiswa TI USD");
        System.out.println("No.\tNIM\t\tNama\t\t\tUS1\tUS2\tUAS\tTotal\tFinal");
        System.out.println("============================================================================================");
        for (int i = 0; i < n; i++) {
            System.out.println((i+1)+".\t"+nim[i]+"\t\t"+nama[i]+"\t\t"+us1[i]+"\t"+us2[i]+"\t"+uas[i]+"\t"+totalNil[i]+"\t"+finalNil[i]);
        }
        System.out.println("============================================================================================");
    }
    
    static void tabelTerbaik(){
        System.out.println("Daftar Nilai Mahasiswa TI USD Urut Terbaik");
        System.out.println("No.\tNIM\t\tNama\t\t\tUS1\tUS2\tUAS\tTotal\tFinal");
        System.out.println("============================================================================================");
        for (int i = 0; i < n; i++) {
            System.out.println((i+1)+".\t"+nim[nim.length-1-i]+"\t\t"+nama[nim.length-1-i]+"\t\t"+us1[nim.length-1-i]+"\t"+us2[nim.length-1-i]+"\t"+uas[nim.length-1-i]+"\t"+totalNil[nim.length-1-i]+"\t"+finalNil[nim.length-1-i]);
        }
        System.out.println("============================================================================================");
    }
    
    static void sortNilai(){
        for (int i = 0; i < (totalNil.length-1); i++) {
            for (int j = 0; j < (totalNil.length - (i+1)); j++) {
                if (totalNil[j] > totalNil[j+1]){
                    double tempNil = totalNil[j];
                    totalNil[j] = totalNil[j+1];
                    totalNil[j+1] = tempNil;
                    
                    double tempUs1 = us1[j];
                    us1[j] = us1[j+1];
                    us1[j+1] = tempUs1;
                    
                    double tempUs2 = us2[j];
                    us2[j] = us2[j+1];
                    us2[j+1] = tempUs2;
                    
                    double tempUas = uas[j];
                    uas[j] = uas[j+1];
                    uas[j+1] = tempUas;
                    
                    String tempNim = nim[j];
                    nim[j] = nim[j+1];
                    nim[j+1] = tempNim;
                    
                    String tempNama = nama[j];
                    nama[j] = nama[j+1];
                    nama[j+1] = tempNama;
                    
                    char tempFinal = finalNil[j];
                    finalNil[j] = finalNil[j+1];
                    finalNil[j+1] = tempFinal;
                }
                
            }
        }
    }
}
