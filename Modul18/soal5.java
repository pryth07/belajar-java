package Modul18;

public class soal5 {
    public static void main(String[] args) {
        int [] bil = {23, 26, 30, 32, 33, 69, 50, 70, 80, 55, 76, 53, 21};
        int a=0, b=0, c=0, d=0;
        for (int i = 0; i < bil.length; i++) {
            if (bil[i] % 2 >= 1){
                a++;
            }
            else{
                b++;
            }
        }
        int [] ganjil = new int[a];
        int [] genap = new int[b];
        for (int i = 0; i < bil.length; i++) {
            if (bil[i] % 2 >= 1){
                ganjil[c++] += bil[i];
            }
            else{
                genap[d++] += bil[i];
            }
        }
        System.out.print("Isi array 'ganjil': ");
        for (int i: ganjil){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.print("Isi array 'genap': ");
        for (int i: genap){
            System.out.print(i+" ");
        }
    }
}
