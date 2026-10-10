import java.util.Scanner;
public class ganjilgenap{
    public static void main(String[] args) {
        int bilangan;
        Scanner inputBilangan = new Scanner(System.in);
        System.out.print("Masukkan bilangan: ");
        bilangan = inputBilangan.nextInt();
        inputBilangan.close();
        if ((bilangan >= 0) && (bilangan % 2 >= 1))
            System.out.println("Bilangan ganjil");
        else System.out.println("Bilangan genap");
    }
}