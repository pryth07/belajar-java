package Modul13;
public class bengsin { //Awal dari kelas bengsin
    public static void main(String[] args) {
        int jumlahLiter = 1, harga = 0;
        //Deklarasi variabel jumlahLiter bernilai 1 dan harga bernilai 0 bertipe integer
        System.out.println(" Harga per liter Rp 6500");
        System.out.println();
        System.out.println(" Jumlah liter\t\tHarga (Rp)");
        System.out.println("==================================");
        while (jumlahLiter <=20){ //Melakukan loop selama jumlahLiter kurang dari sama dengan 20
            harga = harga + 6500; //Menambah nilai variabel harga sebesar 6500
            System.out.println(" "+jumlahLiter+"\t\t\t"+harga);
            jumlahLiter++;
            /*  Menambah nilai variabel jumlahLiter sebesar 1 
                menggunakan increment agar loop berhenti 
                jika jumlahLiter mencapai nilai iterasi   */
        }
        System.out.println("==================================");
    }
} //Akhir dari kelas bengsin
