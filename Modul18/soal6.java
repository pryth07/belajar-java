package Modul18;
import java.util.Scanner;
public class soal6 { //Awal dari kelas soal6
    static String[] nim, nama;
    //Deklarasi variabel nim dan nama bertipe String array
    static double[] us1, us2, uas, totalNil;
    //Deklarasi variabel us1, us2, uas, dan totalNil bertipe double array
    static char[] finalNil;
    //Deklarasi variabel finalNil bertipe char array
    static int n;
    //Deklarasi variabel n bertipe integer
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) { //Awal dari main
        System.out.print("Masukkan berapa jumlah mahasiswa yang ingin dihitung nilainya: ");
        n = sc.nextInt();           //Meminta input n dari user
        nim = new String[n];        //Deklarasi banyaknya index array nim sebanyak n
        nama = new String[n];       //Deklarasi banyaknya index array nama sebanyak n
        us1 = new double[n];        //Deklarasi banyaknya index array us1 sebanyak n
        us2 = new double[n];        //Deklarasi banyaknya index array us2 sebanyak n
        uas = new double[n];        //Deklarasi banyaknya index array uas sebanyak n
        totalNil = new double[n];   //Deklarasi banyaknya index array totalNil sebanyak n
        finalNil = new char[n];     //Deklarasi banyaknya index array finalNil sebanyak n
        data();                     //Memanggil method data
        nilai();                    //Memanggil method nilai
        tabel();                    //Memanggil method tabel
        System.out.println();       //Memberi enter/spasi ke bawah
        sortNilai();                //Memanggil method sortNilai
        tabelTerbaik();             //Memanggil method tabelTerbaik
    } //Akhir dari main
    static void data(){ //Awal dari method data
        for (int i = 0; i < n; i++) {
        //Perulangan for i=0 diulangi selama i < n, menambah nilai i sebesar 1 di setiap akhir perulangan
            System.out.println("Data mahasiswa ke-"+(i+1));
            //Memberi tahu data mahasiswa keberapa yang sedang dimasukkan datanya
            System.out.print("Masukkan NIM: ");
            nim[i] = sc.next();                     //Meminta user untuk input NIM mahasiswa
            sc.nextLine();
            System.out.print("Masukkan nama: ");
            nama[i] = sc.nextLine();                //Meminta user untuk input nama mahasiswa
            
            do{
                System.out.print("Masukkan nilai US 1: ");
                us1[i] = sc.nextDouble();           //Meminta user untuk input nilai US 1 untuk index i
                if (us1[i]<0){                      //Jika input kurang dari 0, memberikan pesan
                    System.out.println("Masukkan 0 atau lebih!");
                }
                else if (us1[i]>100){               //Jika input lebih dari 100, memberikan pesan
                    System.out.println("Nilai maksimal 100!");
                }
                } while (us1[i]<0 || us1[i]>100);   //Diulangi jika input user di bawah 0 atau di atas 100
                
            do{
                System.out.print("Masukkan nilai US 2: "); 
                us2[i] = sc.nextDouble();           //Meminta user untuk input nilai US2 untuk index i
                if (us2[i]<0){                      //Jika input kurang dari 0, memberikan pesan
                    System.out.println("Masukkan 0 atau lebih!");
                }
                else if (us2[i]>100){               //Jika input lebih dari 100, memberikan pesan
                    System.out.println("Nilai maksimal 100!");
                }
                } while (us2[i]<0 || us2[i]>100);   //Diulangi jika input user di bawah 0 atau di atas 100
                
            do{
                System.out.print("Masukkan nilai UAS: ");
                uas[i] = sc.nextDouble();           //Meminta user untuk input nilai UAS untuk index i
                if (uas[i]<0){                      //Jika input kurang dari 0, memberikan pesan
                    System.out.println("Masukkan 0 atau lebih!");
                }
                else if (uas[i]>100){               //Jika input lebih dari 100, memberikan pesan
                    System.out.println("Nilai maksimal 100!");
                }
                } while (uas[i]<0 || uas[i]>100);   //Diulangi jika input user di bawah 0 atau di atas 100
        }
    } //Akhir dari method data
    static void nilai(){ //Awal dari method nilai
        for (int i = 0; i < n; i++) {
        //Perulangan for i=0 diulangi selama i < n, menambah nilai i sebesar 1 di setiap akhir perulangan
            totalNil[i] = ((0.3*us1[i])+(0.3*us2[i])+(0.4*uas[i]));
            //Rumus menghitung total nilai
            if (totalNil[i] >= 80){                             //Jika total nilai index i >= 80,
                finalNil[i] = 'A';                              //set final nilai ke 'A'
            }
            else if (65 <= totalNil[i] && totalNil[i] < 80){    //Jika 65 <= total nilai index i < 80,
                finalNil[i] = 'B';                              //set final nilai ke 'B'
            }
            else if (55 <= totalNil[i] && totalNil[i] < 65){    //Jika 55 <= total nilai index i < 65,
                finalNil[i] = 'C';                              //set final nilai ke 'C'
            }
            else if (45 <= totalNil[i] && totalNil[i] < 55){    //Jika 45 <= total nilai index i < 55
                finalNil[i] = 'D';                              //set final nilai ke 'D'
            }
            else{                                               //Jika tidak memenuhi satupun kondisi di atas,
                finalNil[i] = 'E';                              //set final nilai ke 'E'
            }
        }
    } //Akhir dari method nilai
    
    static void tabel(){ //Awal dari method tabel
        System.out.println("Daftar Nilai Mahasiswa TI USD"); //Menampilkan judul
        System.out.println("No.\tNIM\t\tNama\t\t\tUS1\tUS2\tUAS\tTotal\tFinal"); //Menampilkan header
        System.out.println("============================================================================================"); //Menampilkan pembatas
        for (int i = 0; i < n; i++) { //Perulangan for i=0 diulangi selama i < n, menambah nilai i sebesar 1 di setiap akhir perulangan
            System.out.println((i+1)+".\t"+nim[i]+"\t\t"+nama[i]+"\t\t"
            +us1[i]+"\t"+us2[i]+"\t"+uas[i]+"\t"+totalNil[i]+"\t"+finalNil[i]); //Menampilkan tabel
        }
        System.out.println("============================================================================================"); //Menampilkan pembatas
    } //Akhir dari method tabel
    
    static void tabelTerbaik(){ //Awal dari method tabelTerbaik
        System.out.println("Daftar Nilai Mahasiswa TI USD Urut Terbaik"); //Menampilkan judul
        System.out.println("No.\tNIM\t\tNama\t\t\tUS1\tUS2\tUAS\tTotal\tFinal"); //Menampilkan header
        System.out.println("============================================================================================"); //Menampilkan pembatas
        for (int i = 0; i < n; i++) { //Perulangan for i=0 diulangi selama i < n, menambah nilai i sebesar 1 di setiap akhir perulangan
            System.out.println((i+1)+".\t"+nim[nim.length-1-i]+"\t\t"
            +nama[nim.length-1-i]+"\t\t"+us1[nim.length-1-i]+"\t"+us2[nim.length-1-i]+"\t"
            +uas[nim.length-1-i]+"\t"+totalNil[nim.length-1-i]+"\t"+finalNil[nim.length-1-i]); //Menampilkan tabel dengan urutan nilai terbaik
        }
        System.out.println("============================================================================================"); //Menampilkan pembatas
    }
    
    static void sortNilai(){ //Awal dari method sortNilai
        for (int i = 0; i < (totalNil.length-1); i++) {
        //Perulangan for i=0 diulangi selama i < (banyak index totalNil dikurangi 1),
        //menambah nilai i sebesar 1 di setiap akhir perulangan
            for (int j = 0; j < (totalNil.length - (i+1)); j++) {
            //Perulangan for j=0 diulangi selama i < (banyak index totalNil dikurangi i+1),
            //menambah nilai j sebesar 1 di setiap akhir perulangan
                if (totalNil[j] > totalNil[j+1]){   //Jika totalNil index ke j lebih besar dari index ke j+1
                    double tempNil = totalNil[j];   //Set totalNil index ke j ke dalam tempNil
                    totalNil[j] = totalNil[j+1];    //Set totalNil index ke j+1 ke dalam index j
                    totalNil[j+1] = tempNil;        //Set tempNil ke dalam totalNil index j+1
                    
                    double tempUs1 = us1[j];        //Set us1 index ke j ke dalam tempUs1
                    us1[j] = us1[j+1];              //Set us1 index ke j+1 ke dalam index j
                    us1[j+1] = tempUs1;             //Set tempUs1 ke dalam us1 index j+1
                    
                    double tempUs2 = us2[j];        //Set us2 index ke j ke dalam tempUs2
                    us2[j] = us2[j+1];              //Set us2 index ke j+1 ke dalam index j
                    us2[j+1] = tempUs2;             //Set tempUs2 ke dalam us1 index j+1
                    
                    double tempUas = uas[j];        //Set uas index ke j ke dalam tempUas
                    uas[j] = uas[j+1];              //Set uas index ke j+1 ke dalam index j
                    uas[j+1] = tempUas;             //Set tempUas ke dalam uas index j+1
                    
                    String tempNim = nim[j];        //Set nim index ke j ke dalam tempNim
                    nim[j] = nim[j+1];              //Set nim index ke j+1 ke dalam index j
                    nim[j+1] = tempNim;             //Set tempNim ke dalam nim index ke j+1
                    
                    String tempNama = nama[j];      //Set nama index ke j ke dalam tempNama
                    nama[j] = nama[j+1];            //Set nama index ke j+1 ke dalam index j
                    nama[j+1] = tempNama;           //Set tempNama ke dalam nama index ke j+1
                    
                    char tempFinal = finalNil[j];   //Set finalNil index ke j ke dalam tempFinal
                    finalNil[j] = finalNil[j+1];    //Set finalNil index ke j+1 ke dalam index j
                    finalNil[j+1] = tempFinal;      //Set tempFinal ke dalam nama index ke j+1
                }
                
            }
        }
    } //Akhir dari method soal6
} //Akhir dari kelas soal6
