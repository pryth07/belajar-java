import java.util.Scanner;
public class umur { //Awal dari kelas umur
    public static void main(String[] args) {
        String nama1, nama2; //Deklarasi variabel nama1 dan nama2 bertipe String
        int umur1, umur2; //Deklarasi variabel umur1 dan umur2 bertipe integer
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nama orang pertama: "); //Input nama orang pertama menggunakan Scanner
        nama1 = input.nextLine();
        System.out.print("Masukkan nama orang kedua: "); //Input nama orang kedua menggunakan Scanner
        nama2 = input.nextLine();
        System.out.print("Masukkan umur "+nama1+": "); //Input umur orang pertama menggunakan Scanner
        umur1 = input.nextInt();
        System.out.print("Masukkan umur "+nama2+": "); //Input umur orang kedua menggunakan Scanner
        umur2 = input.nextInt();
        input.close();
        if (umur1 > umur2) {
            System.out.println(nama1+" lebih tua dari "+nama2); //Output nama orang pertama lebih tua dari nama orang kedua
        }
        else if (umur1 < umur2) {
            System.out.println(nama2+" lebih tua dari "+nama1); //Output nama orang kedua lebih tua dari nama orang pertama
        }
        else if (umur1 == umur2) {
            System.out.println(nama1+" dan "+nama2+" berumur sama"); //Output nama orang pertama dan nama orang kedua berumur sama
        }
    }
} //Akhir dari kelas umur