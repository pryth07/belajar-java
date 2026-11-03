package Modul14;
import java.util.Scanner;
public class ratarata { //Awal dari kelas ratarata
    public static void main(String[] args) {
        int i=1, N, data, jumlah = 0, max = 0, min = 0, rentang;
        //Deklarasi variabel i bernilai 1, N, data,
        //jumlah bernilai 0, max bernilai 0, min bernilai 0, dan rentang bertipe integer (bilangan bulat)
        double rataRata, variansi, deviasi, jumlahKuadrat = 0;
        //Deklarasi variabel rataRata, variansi, deviasi, dan jumlahKuadrat berilai 0 bertipe double (bilangan real) 
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan banyak data yang akan diolah : "); //Meminta input N (banyak data yang akan diolah)
        N = sc.nextInt();
        while (i<=N){ //Melakukan perulangan sebanyak N kali
            System.out.print("Data ke "+i+" : ");  //Meminta input data
            data = sc.nextInt();
            jumlahKuadrat += (data*data); //Menghitung jumlahKuadrat dengan menambahkan tiap data yang dikuadratkan
            jumlah += data; //Menghitung jumlah dengan menambahkan tiap data
            if (i==1){ //Jika i sama dengan 1, inisialisasi max sama dengan data
                max=data;
            }
            else if (data>max){ //Jika tidak, jika data lebih dari max, inisialisasi max sama dengan data
                max=data;
            }
            if (i==1){ //Jika i sama dengan 1, inisialisasi min sama dengan data
                min=data;
            }
            else if (data<min){ //Jika tidak, jika data kurang dari min, inisialisasi min sama dengan data
                min=data;
            }
            i++; //Increment i, menambah nilai i sebesar 1
        }
        sc.close(); //Menutup Scanner sc agar tidak terus menggunakan memori
        rataRata = jumlah/N;
        //Menghitung rataRata dengan rumus jumlah dibagi N
        rentang = max - min;
        //Menghitung rentang data dengan rumus nilai maksimum dikurang minimum
        variansi = (jumlahKuadrat-N*(rataRata*rataRata))/N;
        //Menghitung variansi dengan rumus jumlahKuadrat dikurangi dengan N dikalikan dengan rataRata kuadrat, dibagi N
        deviasi = Math.sqrt(variansi);
        //Menghitung deviasi standard dengan rumus akar kuadrat dari variansi
        System.out.println("Data terbesar\t: "+max);
        System.out.println("Data terkecil\t: "+min);
        System.out.println("Rentang data\t: "+rentang);
        System.out.println("Rata-rata\t: "+rataRata);
        System.out.println("Variansi\t: "+variansi);
        System.out.println("Deviasi standard: "+deviasi);
    }
} //Akhir dari kelas ratarata
