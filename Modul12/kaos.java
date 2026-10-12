import java.util.Scanner;
public class kaos {
    public static void main(String[] args) {
        int harga, jumlah, total;
        String size;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan size kaos (S, M, L, XL, XXL): ");
        size = input.nextLine();
        System.out.print("Masukkan jumlah kaos yang ingin dibeli: ");
        jumlah = input.nextInt();
        switch (size) {
            case "S":
                harga = 30000;
                break;
            case "M":
                harga = 38000;
                break;
            case "L":
                harga = 45000;
                break;
            case "XL":
                harga = 50000;
                break;
            case "XXL":
                harga = 60000;
                break;
            default:
                System.out.println("Size kaos tidak valid");
                return;
        }
        total = harga * jumlah;
        System.out.println("Total pembelianmu adalah Rp"+total+",00");
    }
}