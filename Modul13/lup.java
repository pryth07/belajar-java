package Modul13;
public class lup {
    public static void main(String[] args) {
        int jumlah = 0, bilangan = 0;
        while (bilangan < 10){
            jumlah = jumlah + bilangan;
            bilangan += 2;
        }
        System.out.println("Isi bilangan di akhir perulangan = "+bilangan);
        System.out.println("Isi jumlah di akhir perulangan = "+jumlah);
    }
}
