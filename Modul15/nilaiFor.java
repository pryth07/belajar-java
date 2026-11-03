package Modul15;
import java.util.Scanner;
public class nilaiFor { //Awal dari kelas nilaiFor
    public static void main(String[] args) {
        int n=0; //Deklarasi variabel n bernilai 0 bertipe integer
        double data=0, kuadrat=0, akar=0, jumlah=0;
        //Deklarasi variabel data, kuadrat, akar, dan jumlah bernilai 0 bertipe double (bilangan real)
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Masukkan N (berapa nilai yang akan dihitung): ");
            n = sc.nextInt(); //Meminta input n
            if (n<=0){ //Jika input masih belum lebih dari 0, menampilkan pesan agar user memasukkan input lebih dari 0
                System.out.println("Masukkan lebih dari 0!");
            }
        } while (n<=0); //Diulangi selama input belum lebih dari 0
        
        for (int i = 1; i <= n; i++) { //Perulangan selama nilai i kurang dari n, menambah nilai i sebesar 1 setiap perulangan
            System.out.print("Masukkan data ke-"+i+": ");
            data = sc.nextDouble(); //Meminta input data sebanyak n kali
            kuadrat += data*data; //Menghitung jumlah kuadrat dengan menambahkan setiap nilai data yang dikuadratkan
            akar += Math.sqrt(data); //Menghitung jumlah akar data dengan menambahkan setiap nilai data yang diakar kuadratkan
            if (data!=0){       //Jika data tidak sama dengan nol,
                data = 1/data;  //menginisialisasi data sama dengan 1/data
                jumlah += data; //menambah jumlah dari nilai per data
            }
        }
        sc.close(); //Menutup Scanner sc agar tidak terus menggunakan memori
        System.out.println("a. Jumlah kuadrat: "+kuadrat);
        System.out.println("b. Jumlah akar data: "+akar);
        System.out.println("c. Jumlah 1/data untuk data yang tidak sama dengan nol: "+jumlah);
    }
} //Akhir dari kelas nilaiFor
