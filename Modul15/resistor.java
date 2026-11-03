package Modul15;
import java.util.Scanner;
public class resistor {
    public static void main(String[] args) {
        int r=0, n=0;
        double rt=0;
        String rangkaian;
        boolean inputValid = false;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Masukkan N (banyaknya tahanan/resistor): ");
            n = sc.nextInt();
            if (n<=0){
                System.out.println("Masukkan lebih dari 0!");
            }
        } while (n<=0);

        while (!inputValid) {
            System.out.print("Apakah tahanan akan disusun seri atau pararel?: ");
            rangkaian = sc.next().toLowerCase();

            switch (rangkaian) {
                case "seri":
                        for (int i = 1; i <= n; i++) {
                        System.out.print("Masukkan r ke-"+i+": ");
                        r = sc.nextInt();
                        rt = rt + r;
                    }
                    System.out.println("Rangkaian total adalah: "+rt);
                    inputValid = true;
                    break;
        
                case "pararel":
                    for (int j = 1; j <= n; j++) {
                        System.out.print("Masukkan r ke-"+j+": ");
                        r = sc.nextInt();
                        rt = rt + (1.0/r);
                    }
                    rt = 1.0/rt;
                    System.out.println("Rangkaian total adalah: "+rt);
                    inputValid = true;
                    break;
                default: System.out.println("Masukin yang bener kocak");
                    break;
            }
        }
        
        sc.close();
    }
}
