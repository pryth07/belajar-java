package Modul16;
import java.util.Scanner;
public class soal4_statistikUsia {
    public static void main(String[] args) {
        int n=0, usia, input, jumlah=0,a=0,b=0,c=0,d=0,e=0;
        double rataRata=0, variansi, deviasi, jumlahKuadrat = 0;
        String diagram = "*";
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Menu:");
            System.out.println();
            System.out.println("1. Memasukkan data usia");
            System.out.println("2. Rata-rata");
            System.out.println("3. Deviasi standard");
            System.out.println("4. Diagram batang");
            System.out.println("5. Keluar");
            input = sc.nextInt();
        } while (input<=0 || input>5);
        
        do {
            switch (input){
            case 1:{
                do {
                    System.out.print("Masukkan jumlah data yang ingin dihitung: ");
                    n = sc.nextInt();
                    if (n<=0){
                        System.out.println("Masukkan lebih dari 0!");
                    }
                } while (n<=0);
                
                do {
                    for (int i = 1; i <= n; i++) {
                        do {
                            System.out.print("Usia warga "+i+": ");
                            usia = sc.nextInt();
                            if (usia<0){
                                System.out.println("Masukkan 0 atau lebih!");
                            }
                        } while (usia<0);
                    jumlah += usia;
                    jumlahKuadrat += (usia*usia);
                    if (usia>=0 && usia<=20){
                        a++;
                        }
                    else if (usia>=21 && usia<=40){
                        b++;
                        }
                    else if (usia>=41 && usia<=60){
                        c++;
                        }
                    else if (usia>=61 && usia<=80){
                        d++;
                        }
                    else{
                        e++;
                        }
                    }
                    if (n<0){
                        System.out.println("Masukkan 0 atau lebih!");
                        }
                    } while (n<0);
            } return;
            
            case 2:{
                if (jumlah<=0){
                    System.out.println("Kamu belum memasukkan data!");
                }
                else{
                    rataRata = jumlah/n;
                    System.out.println("Rata-rata adalah: "+rataRata);
                }
            } return;
                
            case 3:{
                if (rataRata<=0){
                    System.out.println("Kamu belum menghitung rata-rata!");
                }
                else{
                    variansi = (jumlahKuadrat-n*(rataRata*rataRata))/n;
                    deviasi = Math.sqrt(variansi);
                    System.out.println("Deviasi standard adalah: "+deviasi);
                }
            } return;
            
            case 4:{
                if (jumlah<=0){
                    System.out.println("Kamu belum memasukkan data!");
                }
                else {
                    System.out.println("0-20    : "+(diagram.repeat(a)));
                    System.out.println("21-40   : "+(diagram.repeat(b)));
                    System.out.println("41-60   : "+(diagram.repeat(c)));
                    System.out.println("61-80   : "+(diagram.repeat(d)));
                    System.out.println("81-100  : "+(diagram.repeat(e)));
                }
            } return;
            
            case 5: break;
        }
        } while (input>0 || input<=5);
            
        sc.close();
    }
}
