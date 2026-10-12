import java.util.Scanner;
public class HariBulan { //Awal dari kelas HariBulan
    public static void main(String[] args) {
        int bulan; // Deklarasi variabel bulan bertipe integer
        String hari; // Deklarasi variabel hari bertipe string
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan bulan (1-12): ");
        bulan = input.nextInt(); // Input bulan dari user
        input.close();
        switch (bulan) {
            case 1: hari = "Januari memiliki 31 hari";
                break; // Memberi tahu jumlah hari pada bulan Januari dan hentikan switch
            case 2: hari = "Februari memiliki 28 atau 29 hari";
                break; // Memberi tahu jumlah hari pada bulan Februari dan hentikan switch
            case 3: hari = "Maret memiliki 31 hari";
                break; // Memberi tahu jumlah hari pada bulan Maret dan hentikan switch
            case 4: hari = "April memiliki 30 hari";
                break; // Memberi tahu jumlah hari pada bulan April dan hentikan switch
            case 5: hari = "Mei memiliki 31 hari";
                break; // Memberi tahu jumlah hari pada bulan Mei dan hentikan switch
            case 6: hari = "Juni memiliki 30 hari";
                break; // Memberi tahu jumlah hari pada bulan Juni dan hentikan switch
            case 7: hari = "Juli memiliki 31 hari";
                break; // Memberi tahu jumlah hari pada bulan Juli dan hentikan switch
            case 8: hari = "Agustus memiliki 31 hari";
                break; // Memberi tahu jumlah hari pada bulan Agustus dan hentikan switch
            case 9: hari = "September memiliki 30 hari";
                break; // Memberi tahu jumlah hari pada bulan September dan hentikan switch
            case 10: hari = "Oktober memiliki 31 hari";
                break; // Memberi tahu jumlah hari pada bulan Oktober dan hentikan switch
            case 11: hari = "November memiliki 30 hari";
                break; // Memberi tahu jumlah hari pada bulan November dan hentikan switch
            case 12: hari = "Desember memiliki 31 hari";
                break; // Memberi tahu jumlah hari pada bulan Desember dan hentikan switch
            default: hari = "Bulan tidak valid";
                break; // Menampilkan pesan jika bulan tidak valid dan hentikan switch
        }
        System.out.println(hari);
    }
}
