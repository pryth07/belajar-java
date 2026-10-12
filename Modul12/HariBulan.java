import java.util.Scanner;
public class HariBulan { //Awal dari kelas HariBulan
    public static void main(String[] args) {
        int bulan; // Deklarasi variabel bulan bertipe integer
        String hari; // Deklarasi variabel hari bertipe string
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan bulan (1-12): ");
        bulan = input.nextInt(); // Input bulan dari user
        switch (bulan) {
            case 1: hari = "Januari memiliki 31 hari";
                break; // Mencari tahu jumlah hari pada bulan Januari
            case 2: hari = "Februari memiliki 28 atau 29 hari";
                break; // Mencari tahu jumlah hari pada bulan Februari
            case 3: hari = "Maret memiliki 31 hari";
                break; // Mencari tahu jumlah hari pada bulan Maret
            case 4: hari = "April memiliki 30 hari";
                break; // Mencari tahu jumlah hari pada bulan April
            case 5: hari = "Mei memiliki 31 hari";
                break; // Mencari tahu jumlah hari pada bulan Mei
            case 6: hari = "Juni memiliki 30 hari";
                break; // Mencari tahu jumlah hari pada bulan Juni
            case 7: hari = "Juli memiliki 31 hari";
                break; // Mencari tahu jumlah hari pada bulan Juli
            case 8: hari = "Agustus memiliki 31 hari";
                break; // Mencari tahu jumlah hari pada bulan Agustus
            case 9: hari = "September memiliki 30 hari";
                break; // Mencari tahu jumlah hari pada bulan September
            case 10: hari = "Oktober memiliki 31 hari";
                break; // Mencari tahu jumlah hari pada bulan Oktober
            case 11: hari = "November memiliki 30 hari";
                break; // Mencari tahu jumlah hari pada bulan November
            case 12: hari = "Desember memiliki 31 hari";
                break; // Mencari tahu jumlah hari pada bulan Desember
            default: hari = "Bulan tidak valid";
                break; // Menampilkan pesan jika bulan tidak valid
        }
        System.out.println(hari);
    }
}
