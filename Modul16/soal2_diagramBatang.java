package Modul16;
import java.util.Scanner;
public class soal2_diagramBatang { //Awal dari kelas soal2_diagramBatang
    public static void main(String[] args) {
        int n, usia=0, a=0, b=0, c=0, d=0, e=0;
        //Deklarasi variabel n, usia, a, b, c, d, e bernilai 0 bertipe integer
        String diagram = "*";
        //Deklarasi variabel diagram bernilai * bertipe String
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Masukkan jumlah penduduk: ");
            n = sc.nextInt(); //Meminta user untuk memasukkan n dan disimpan di variabel n
            if (n<=0){ //Menampilkan pesan di layar user jika n<=0
                System.out.println("Masukkan lebih dari 0!");
            }
        } while (n<=0); //Mengulangi blok program di atas selama nilai n<=0
        
        for (int i = 1; i <= n; i++) {
            do {
                System.out.print("Usia warga "+i+": ");
                usia = sc.nextInt();
                if (usia<0){ //Menampilkan pesan di layar user jika usia<=0
                System.out.println("Masukkan 0 atau lebih!");
                }
            } while (usia<0); //Mengulangi blok program di atas selama nilai usia<0
            
            if (usia>=0 && usia<=20){       //Jika 0<=usia<=20, tambah variabel nilai a sebesar 1
                a++;
            }
            else if (usia>=21 && usia<=40){ //Jika tidak, jika 21<=usia<=40, tambah variabel nilai b sebesar 1
                b++;
            }
            else if (usia>=41 && usia<=60){ //Jika tidak, jika 41<=usia<=60, tambah variabel nilai c sebesar 1
                c++;
            }
            else if (usia>=61 && usia<=80){ //Jika tidak, jika 61<=usia<=80, tambah variabel nilai d sebesar 1
                d++;
            }
            else{                           //Jika tidak, tambah variabel nilai e sebesar 1
                e++;
            }
        }
        sc.close();
        System.out.println();
        System.out.println("Distribusi usia "+n+" penduduk di atas adalah:");
        System.out.println();
        System.out.println("0-20    : "+(diagram.repeat(a))); //Mengulangi print variabel diagram sebanyak a kali
        System.out.println("21-40   : "+(diagram.repeat(b))); //Mengulangi print variabel diagram sebanyak b kali
        System.out.println("41-60   : "+(diagram.repeat(c))); //Mengulangi print variabel diagram sebanyak c kali
        System.out.println("61-80   : "+(diagram.repeat(d))); //Mengulangi print variabel diagram sebanyak d kali
        System.out.println("81-100  : "+(diagram.repeat(e))); //Mengulangi print variabel diagram sebanyak e kali
    }
} //Akhir dari soal2_diagramBatang
