package Modul15;
import java.util.Scanner;
public class nilaiFor {
    public static void main(String[] args) {
        int n=0;
        double data=0, kuadrat=0, akar=0, jumlah=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan N (berapa nilai yang akan dihitung): ");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print("Masukkan data ke-"+i+": ");
            data = sc.nextDouble();
            kuadrat += data*data;
            akar += Math.sqrt(data);
            if (data!=0){
                data = 1/data;
                jumlah += data;
            }
        }
        sc.close();
        System.out.println("a. Jumlah kuadrat: "+kuadrat);
        System.out.println("b. Jumlah akar data: "+akar);
        System.out.println("c. Jumlah 1/data untuk data yang tidak sama dengan nol: "+jumlah);
    }
}
