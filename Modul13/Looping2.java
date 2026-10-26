package Modul13;

public class Looping2 {
    public static void main(String[] args) {
        int bilangan = 1;
        while (bilangan < 21){
            if (bilangan == 20){
                System.out.print(bilangan);
            }
            else{
                System.out.print(bilangan+", ");
            }
            bilangan++;
        }
    }
}
