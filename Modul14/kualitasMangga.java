package Modul14;
import java.util.Scanner;
public class kualitasMangga {
    public static void main(String[] args) {
        int n = 0, i = 1, berat = 0, biasa = 0, bagus = 0, unggul = 0;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("Masukkan banyak mangga yang akan diproses: ");
            n = sc.nextInt();
            if (n<=0){
                System.out.println("Masukkan banyak mangga lebih dari 0!");
            }
        } while (n<=0);

        while (i<=n){
            do{
                System.out.print("Berat mangga ke-"+i+" (dalam gram) : ");
                berat = sc.nextInt();
                if (berat<=0){
                    System.out.println("Masukkan berat lebih dari 0!");
                }
                else {i++;}
                if (berat < 500){
                biasa++;
                }
                else if (berat >= 500 && berat < 750){ 
                bagus++;                          
                }                                      
                else if (berat >= 750){                 
                unggul++;
                }
                } while (berat<=0);
            
        }
        sc.close();
        System.out.println("Biasa   : "+biasa);
        System.out.println("Bagus   : "+bagus);
        System.out.println("Unggul  : "+unggul);
    }
}
