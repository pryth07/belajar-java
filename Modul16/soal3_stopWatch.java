package Modul16;
public class soal3_stopWatch {
    public static void main(String[] args) {
        for (int h = 0; h <= 12; h++) {
            for (int m = 0; m <= 60; m++) {
                System.out.print("Detik: ");
                for (int s = 1; s <=60; s++) {
                    System.out.print(s+" ");
                }
                System.out.println();
                System.out.println("Menit: "+m);
            }
            System.out.println("Jam: "+h);
        }
    }
}
