package Modul16;
import java.util.Scanner;
public class soal4_statistikUsia { //Awal dari kelas soal4_statistikUsia
    public static void main(String[] args) {
        int input, a=0,b=0,c=0,d=0,e=0;
        //Deklarasi variabel input, a, b, c, d, e bernilai 0 bertipe integer
        double n=0, usia, jumlah=0, rataRata=0, variansi, deviasi, jumlahKuadrat = 0;
        //Deklarasi variabel n, usia, jumlah, rataRata, variansi, deviasi, jumlahKuadrat bernilai 0 bertipe double
        String diagram = "*";
        //Deklarasi variabel diagram bernilai * bertipe String
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Menu:");
            System.out.println();
            System.out.println("1. Memasukkan data usia");
            System.out.println("2. Rata-rata");
            System.out.println("3. Deviasi standard");
            System.out.println("4. Diagram batang");
            System.out.println("5. Keluar");
            System.out.println();
            input = sc.nextInt(); //Menyimpan input user pada variabel input
            switch (input){ //Masuk ke switch case input
            case 1:{ //Kasus pertama
                do {
                    System.out.print("Masukkan jumlah data yang ingin dihitung: ");
                    n = sc.nextDouble(); //Menyimpan input user pada variabel n
                    if (n<=0){ //Menampilkan pesan jika user memasukkan n<=0
                        System.out.println("Masukkan lebih dari 0!");
                    }
                } while (n<=0); //Mengulangi blok program di atas selama n<=0
                
                for (int i = 1; i <= n; i++) { //Mengulangi selama i<=n, menambah nilai i sebesar 1 setiap perulangan
                    do {
                        System.out.print("Usia warga "+i+": ");
                        usia = sc.nextDouble(); //Menyimpan input user pada variabel usia
                        if (usia<0){ //Menampilkan pesan jika user memasukkan usia<0
                            System.out.println("Masukkan 0 atau lebih!");
                        }
                    } while (usia<0); //Mengulangi blok program di atas selama usia<0
                jumlah += usia; //Menambah jumlah dengan setiap data usia
                jumlahKuadrat += (usia*usia); //Menambah jumlahKuadrat dengan setiap data usia yang dikuadratkan
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
            } break; //Keluar dari kasus pertama
            
            case 2:{ //Kasus kedua
                if (jumlah<=0){ //Jika jumlah masih <=0, tampilkan pesan pada layar user
                    System.out.println("Kamu belum memasukkan data!");
                }
                else{ //Jika tidak, hitung rataRata dan tampilkan hasilnya pada layar user
                    rataRata = jumlah/n; //Hitung rataRata dengan rumus jumlah/n
                    System.out.printf("Rumus rata-rata: %.0f/%.0f%n", jumlah, n);
                    System.out.printf("Rata-rata adalah: %.2f%n", rataRata);
                }
            } break; //Keluar dari kasus kedua
                
            case 3:{ //Kasus ketiga
                if (rataRata<=0){ //Jika rataRata<=0, tampilkan pesan pada layar user
                    System.out.println("Kamu belum menghitung rata-rata!");
                }
                else{ //jika tidak, menghitung variansi dan deviasi, lalu tampilkan hasilnya pada layar user
                    variansi = (jumlahKuadrat-n*(rataRata*rataRata))/n; //Hitung variansi
                    deviasi = Math.sqrt(variansi); //Hitung deviasi
                    System.out.println("Rumus deviasi: akar kuadrat dari variansi");
                    System.out.printf("Rumus variansi: (%.0f - %.0f * %.2f^2) / %.0f%n", jumlahKuadrat, n, rataRata, n);
                    System.out.printf("Variansi adalah: %.2f%n", variansi);
                    System.out.printf("Deviasi standard adalah: %.2f%n", deviasi);
                }
            } break; //Keluar dari kasus ketiga
            
            case 4:{ //Kasus keempat
                if (jumlah<=0){ //Jika jumlah<=0, tampilkan pesan pada layar user
                    System.out.println("Kamu belum memasukkan data!");
                }
                else { //Jika tidak, tampilkan diagram batang
                    System.out.println("0-20    : "+(diagram.repeat(a))); //Mengulangi print variabel diagram sebanyak a kali
                    System.out.println("21-40   : "+(diagram.repeat(b))); //Mengulangi print variabel diagram sebanyak b kali
                    System.out.println("41-60   : "+(diagram.repeat(c))); //Mengulangi print variabel diagram sebanyak c kali
                    System.out.println("61-80   : "+(diagram.repeat(d))); //Mengulangi print variabel diagram sebanyak d kali
                    System.out.println("81-100  : "+(diagram.repeat(e))); //Mengulangi print variabel diagram sebanyak e kali
                }
            } break; //Keluar dari kasus keempat
            
            case 5: break; //Langsung keluar dari kasus kelima
            default:{ //Tampilkan pesan pada layar user
                System.out.println("Masukkan angka antara 1 sampai 5!");
                }
            break; //Keluar dari switch case
        }
        } while (input!=5); //Melakukan blok program di atas selama 
        sc.close(); //Menutup Scanner sc agar tidak terus menggunakan memori
    }
} //Akhir dari kelas soal4_statistikUsia
