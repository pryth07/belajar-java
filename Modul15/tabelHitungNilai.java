package Modul15;
import java.util.Scanner;
public class tabelHitungNilai {
    public static void main(String[] args) {
        double y=0, a=0, b=0, c=0, d=0, kuadrat=0, x1=0, x2=0, akar1=0, akar2=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai a: ");
        a = sc.nextDouble();
        System.out.print("Masukkan nilai b: ");
        b = sc.nextDouble();
        System.out.print("Masukkan nilai c: ");
        c = sc.nextDouble();
        d=(b*b)-(4*a*c);
        if (d>0){
            System.out.println("Dari persamaan y = "+a+"x^2 + "+b+"x + "+c);
            System.out.println("Akar-akarnya adalah "+x1+" dan "+x2);
            System.out.println("Nilai y untuk beberapa x antara akar pertama dan kedua adalah");
            System.out.println();
            System.out.println("--------------------------------------------------------------------------");
            System.out.println("\tx\t\t\t\ty = "+a+"x^2 + "+b+"x + "+c);
            System.out.println("--------------------------------------------------------------------------");
            akar1=(-b + Math.sqrt(d)) / (2*a);
            akar2=(-b - Math.sqrt(d)) / (2*a);
            x1=Math.min(akar1, akar2);
            x2=Math.max(akar1, akar2);
            for (double x = x1; x <= x2; x+=0.25) {
                y=(a*(x*x))+b*x+c;
                System.out.println("\t"+x+"\t\t\t\t\t"+y);
            }
            System.out.println("--------------------------------------------------------------------------");
        }
        else{
            System.out.println("D tidak lebih dari 0");
        }
    }
}
