package Modul14;
import java.util.Scanner;
public class ratarata { //Awal dari kelas ratarata
    public static void main(String[] args) {
        int i=1, N, data, jumlah = 0, max = 0, min = 0, rentang;
        double rataRata, variansi, deviasi, jumlahKuadrat = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan banyak data yang akan diolah : ");
        N = sc.nextInt();
        while (i<=N){
            System.out.print("Data ke "+i+" : ");
            data = sc.nextInt();
            jumlahKuadrat = jumlahKuadrat + (data*data);
            jumlah = jumlah + data;
            if (i==1){
                max=data;
            }
            else if (data>max){
                max=data;
            }
            if (i==1){
                min=data;
            }
            else if (data<min){
                min=data;
            }
            i++;
        }
        sc.close();
        rataRata = jumlah/N;
        rentang = max - min;
        variansi = (jumlahKuadrat-N*(rataRata*2))/N;
        deviasi = Math.sqrt(variansi);
        System.out.println("Data terbesar\t: "+max);
        System.out.println("Data terkecil\t: "+min);
        System.out.println("Rentang data\t: "+rentang);
        System.out.println("Rata-rata\t: "+rataRata);
        System.out.println("Variansi\t: "+variansi);
        System.out.println("Deviasi standard: "+deviasi);
    }
}