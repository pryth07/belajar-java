import java.util.Scanner;
public class kaos { //Awal dari kelas kaos
    public static void main(String[] args) {
        int harga, jumlah, total; //Deklarasi variabel harga, jumlah, dan total bertipe integer
        String size; //Deklarasi variabel size bertipe string
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan ukuran kaos (S, M, L, XL, XXL): ");
        size = input.nextLine(); //Input ukuran kaos dari user
        System.out.print("Masukkan jumlah kaos yang ingin dibeli: ");
        jumlah = input.nextInt(); //Input jumlah kaos yang ingin dibeli dari user
        switch (size) {
            case "S": harga = 30000;
                    System.out.println("Kaos berukuran S memiliki harga Rp"+harga);
                break; //Memberi tahu harga kaos berukuran S
            case "M": harga = 38000;
                    System.out.println("Kaos berukuran M memiliki harga Rp"+harga);
                break; //Memberi tahu harga kaos berukuran M
            case "L": harga = 45000;
                    System.out.println("Kaos berukuran L memiliki harga Rp"+harga);
                break; //Memberi tahu harga kaos berukuran L
            case "XL": harga = 50000;
                    System.out.println("Kaos berukuran XL memiliki harga Rp"+harga);
                break; //Memberi tahu harga kaos berukuran XL
            case "XXL": harga = 60000;
                    System.out.println("Kaos berukuran XXL memiliki harga Rp"+harga);
                break; //Memberi tahu harga kaos berukuran XXL
            default:
                System.out.println("Ukuran kaos tidak valid"); //Menampilkan pesan jika ukuran kaos tidak valid
                return;
        }
        total = harga * jumlah;
        System.out.println("Total pembelianmu adalah Rp"+total+",00"); //Menampilkan total harga yang harus dibayar
    }
} //Akhir dari kelas kaos