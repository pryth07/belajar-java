import java.util.Scanner;
public class beratideal { //Awal dari kelas beratideal
    public static void main(String[] args) {
        int tb, bb, beratIdeal; //Deklarasi variabel tb, bb, dan beratIdeal bertipe integer
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan tinggi badan (cm): "); //Input tinggi badan menggunakan Scanner
        tb = input.nextInt();
        System.out.print("Masukkan berat badan (kg): "); //Input berat badan menggunakan Scanner
        bb = input.nextInt();
        input.close();
        beratIdeal=tb-bb;
        if (90 <= beratIdeal && beratIdeal <= 110) {
            System.out.println("Berat badanmu sudah ideal"); //Output jika berat badan ideal
        }
        else if (beratIdeal<90){
            System.out.println("Kamu terlalu gemuk"); //Output jika berat badan lebih dari ideal
        }
        else if (beratIdeal>110){
            System.out.println("Kamu terlalu kurus"); //Output jika berat badan kurang dari ideal
        }
    }
} //Akhir dari kelas beratideal