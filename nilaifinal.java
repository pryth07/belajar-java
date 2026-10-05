import java.util.Scanner;
public class nilaifinal {
    public static void main(String[] args) {
        int uts1, uts2, uas;
        double total;
        
        Scanner nilai = new Scanner(System.in);
        System.out.print("Masukkan nilai UTS 1: ");
        uts1 = nilai.nextInt();

        System.out.print("Masukkan nilai UTS 2: ");
        uts2 = nilai.nextInt();

        System.out.print("Masukkan nilai UAS: ");
        uas = nilai.nextInt();
        nilai.close();
        total = ((0.3*uts1)+(0.3*uts2)+(0.4*uas));

        if (total >= 80)
            System.out.println("Nilai akhir adalah A");
        else if (65 <= total && total < 80)
            System.out.println("Nilai akhir adalah B");
        else if (55 <= total && total < 65)
            System.out.println("Nilai akhir adalah C");
        else if (50 <= total && total < 55)
            System.out.println("Nilai akhir adalah D");
        else if (total < 50)
            System.out.println("Nilai akhir adalah E");
    }
}