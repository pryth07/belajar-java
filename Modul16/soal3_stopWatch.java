package Modul16;
public class soal3_stopWatch { //Awal dari kelas soal3_stopWatch
    public static void main(String[] args) {
        for (int h = 0; h <= 12; h++) { //Mengulangi selama h<=12, menambah nilai variabel h sebesar 1 setiap perulangan
            for (int m = 0; m <= 60; m++) { //Mengulangi selama n<=60, menambah nilai variabel m sebesar 1setiap perulangan
                System.out.print("Detik: ");
                for (int s = 1; s <=60; s++) { //Mengulangi selama s<=60, menambah variabel s sebesar 1 setiap perulangan
                    System.out.print(s+" ");
                }
                System.out.println();
                System.out.println("Menit: "+m);
            }
            System.out.println("Jam: "+h);
        }
    }
} //Akhir dari kelas soal3_stopWatch
