import java.util.Scanner;
public class diskon { //Awal dari kelas diskon
    public static void main(String[] args) {
        double jumlahBarang, hargaBarang, jumlahBeli;
        //Deklarasi variabel jumlahBarang, hargaBarang, dan jumlahBeli bertipe double
        hargaBarang=100000;
        //Deklarasi harga tiap barang senilai Rp100.000,-
        Scanner beli = new Scanner(System.in);
        System.out.print("Masukkan jumlah barang yang dibeli: ");
        //Input jumlah barang yang dibeli menggunakan Scanner
        jumlahBarang=beli.nextDouble();
        beli.close();
        jumlahBeli=jumlahBarang*hargaBarang;
        if (jumlahBeli >= 1000000) {
            jumlahBeli=jumlahBeli*0.9;
            System.out.println("Kamu mendapat diskon 10%, total pembayaranmu: "+jumlahBeli);
            //Output jika jumlah pembelian lebih dari atau sama dengan Rp1.000.000,-
        }
        else{
            System.out.println("Kamu tidak mendapat diskon, total pembayaranmu: "+jumlahBeli);
            //Output jika jumlah pembelian kurang dari Rp1.000.000,-
        }
    }
} //Akhir dari kelas diskon