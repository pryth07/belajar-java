package Modul14;
import java.util.Scanner;
public class jenisNilaiAkar {
    public static void main(String[] args) {
        double a, b, c, D, x1, x2;
        Scanner dataKuadrat = new Scanner(System.in);
        do{
            System.out.print(" Koefisien x2 (a) : ");
            a = dataKuadrat.nextDouble();
        } while (a<=0);
        System.out.print(" Koefisien x (b) : ");
        b = dataKuadrat.nextDouble();
        System.out.print(" Konstanta (c) : ");
        c = dataKuadrat.nextDouble();
        dataKuadrat.close();

        D = b* b - (4*a*c);

        if (D < 0 || a == 0) {
        System.out.println("Tidak mempunyai akar nyata/real");
        }
        else if (D == 0) {
        x1 = -b/(2*a);
        System.out.println("Akarnya tunggal yakni : "+x1);
        }
        else {
        x1 = (-b + Math.sqrt(D))/ (2*a);
        x2 = (-b - Math.sqrt(D))/ (2*a);
        System.out.println("Akar pertama : "+x1);
        System.out.println("Akar kedua : "+x2);
        }
    }
}
