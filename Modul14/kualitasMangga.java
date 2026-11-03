package Modul14;
import java.util.Scanner;
public class kualitasMangga { //Awal dari kelas kualitasMangga
    public static void main(String[] args) {
        int n = 0, i = 1, berat = 0, biasa = 0, bagus = 0, unggul = 0;
        Scanner sc = new Scanner(System.in);
        do{ //Meminta input n (banyak mangga yang akan diproses)
            System.out.print("Masukkan banyak mangga yang akan diproses: ");
            n = sc.nextInt();
            if (n<=0){ //Jika input kurang dari sama dengan 0, menampilkan pesan agar user memberi input lebih dari 0
                System.out.println("Masukkan banyak mangga lebih dari 0!");
            }
        } while (n<=0); //Diulangi selama input user belum lebih dari 0

        while (i<=n){ //Melakukan perulangan selama i kurang dari sama dengan n
            do{ //Meminta input berat tiap mangga
                System.out.print("Berat mangga ke-"+i+" (dalam gram) : ");
                berat = sc.nextInt();
                if (berat<=0){ //Percabangan jika berat kurang dari sama dengan 0
                    System.out.println("Masukkan berat lebih dari 0!");
                }
                else {i++;} //Percabangan jika berat sudah lebih dari 0, menambahkan nilai i sebesar 1

                if (berat < 500){ //Percabangan jika berat kurang dari 500
                biasa++; //Menambah nilai variabel biasa sebesar 1
                }
                else if (berat >= 500 && berat < 750){ //Percabangan jika berat lebih dari sama dengan 500 dan kurang dari 750
                bagus++; //Menambah nilai variabel bagus sebesar 1
                }                                      
                else if (berat >= 750){ //Percabangan jika berat lebih dari sama dengan 750  
                unggul++; //Menambah nilai variabel unggul sebesar 1
                }
                } while (berat<=0); //Diulangi selama input berat masih kurang dari sama dengan 0
            
        }
        sc.close(); //Menutup Scanner sc agar tidak terus menggunakan memori
        System.out.println("Biasa   : "+biasa);
        System.out.println("Bagus   : "+bagus);
        System.out.println("Unggul  : "+unggul);
    }
} //Akhir dari kelas kualitasMangga
