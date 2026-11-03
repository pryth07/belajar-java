package Modul15;
import java.util.Scanner;
public class resistor { //Awal dari kelas resistor
    public static void main(String[] args) {
        int r=0, n=0; //Deklarasi variabel r (resistor) dan n (banyaknya tahanan) bernilai 0 bertipe integer (bilangan bulat)
        double rt=0; //Deklarasi variabel rt (resistor total) bernilai 0 bertipe double (bilangan real)
        String rangkaian; //Deklarasi variabel rangkaian bertipe String
        boolean inputValid = false; //Deklarasi variabel inputValid bernilai salah bertipe boolean
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Masukkan N (banyaknya tahanan/resistor): ");
            n = sc.nextInt(); //Meminta input user untuk n (banyaknya tahanan/resistor)
            if (n<=0){ //Jika input masih belum lebih dari 0, menampilkan pesan agar user memasukkan input lebih dari 0
                System.out.println("Masukkan lebih dari 0!");
            }
        } while (n<=0); //Diulangi selama input masih belum lebih dari 0

        while (!inputValid) { //Melakukan perulangan selama inputValid bernilai true
            System.out.print("Apakah tahanan akan disusun seri atau pararel?: ");
            rangkaian = sc.next().toLowerCase();
            //Meminta input user apakah tahanan disusun seri atau pararel

            switch (rangkaian) { //Masuk ke switch-case rangkaian
                case "seri": //Jika input user adalah "seri"
                        for (int i = 1; i <= n; i++) { //Perulangan selama nilai i kurang dari n, menambah nilai i sebesar 1 setiap perulangan
                        System.out.print("Masukkan r ke-"+i+": ");
                        r = sc.nextInt(); //Meminta input r sebanyak n kali
                        rt += r; //Menghitung rt dengan menambah nilai rt dengan r
                    }
                    System.out.println("Rangkaian total adalah: "+rt);
                    inputValid = true; //Set boolean inputValid menjadi benar
                    break; //Keluar dari switch kasus "seri"
        
                case "pararel": //Jika input user adalah "pararel"
                    for (int j = 1; j <= n; j++) { //Perulangan selama nilai j kurang dari n, menambah nilai j sebesar 1 setiap perulangan
                        System.out.print("Masukkan r ke-"+j+": ");
                        r = sc.nextInt(); //Meminta input r sebanyak n kali
                        rt += (1.0/r); //Menghitung rt dengan menambah nilai rt dengan 1/r
                    }
                    rt = 1.0/rt; //Membalik nilai rt dari rt/1 menjadi 1/rt
                    System.out.println("Rangkaian total adalah: "+rt);
                    inputValid = true; //Set boolean inputValid menjadi benar
                    break; //Keluar dari switch kasus "pararel"
                default: //Menampilkan pesan jika input user tidak "seri" dan atau tidak "pararel"
                    System.out.println("Masukin yang bener kocak");
                    break; //Keluar dari switch default
            }
        }
        
        sc.close(); //Menutup Scanner sc agar tidak terus menggunakan memori
    }
} //Akhir dari kelas resistor
