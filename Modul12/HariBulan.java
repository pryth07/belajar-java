import java.util.Scanner;
public class HariBulan {
    public static void main(String[] args) {
        int bulan;
        String hari;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan bulan (1-12): ");
        bulan = input.nextInt();
        switch (bulan) {
            case 1:
                hari = "Januari memiliki 31 hari";
                break;
            case 2:
                hari = "Februari memiliki 28 atau 29 hari";
                break;
            case 3:
                hari = "Maret memiliki 31 hari";
                break;
            case 4:
                hari = "April memiliki 30 hari";
                break;
            case 5:
                hari = "Mei memiliki 31 hari";
                break;
            case 6:
                hari = "Juni memiliki 30 hari";
                break;
            case 7:
                hari = "Juli memiliki 31 hari";
                break;
            case 8:
                hari = "Agustus memiliki 31 hari";
                break;
            case 9:
                hari = "September memiliki 30 hari";
                break;
            case 10:
                hari = "Oktober memiliki 31 hari";
                break;
            case 11:
                hari = "November memiliki 30 hari";
                break;
            case 12:
                hari = "Desember memiliki 31 hari";
                break;
            default:
                hari = "Bulan tidak valid";
                break;
        }
        System.out.println(hari);
    }
}
