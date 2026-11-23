package Modul18;
public class soal4 {
    public static void main(String[] args) {
        int[] usia1 = {18, 39, 45, 50, 65, 70, 90};
        int[] usia2 = {20, 32, 54, 66, 75, 80, 85, 89, 90, 95, 96};
        int[] usiaGabung = new int[usia1.length + usia2.length];
        int a=0, b=0, c=0;
        
        while (a < usia1.length && b < usia2.length){
            if (usia1[a]<=usia2[b]){
                usiaGabung[c++] += usia1[a++];
            }
            else{ 
                usiaGabung[c++] += usia2[b++];
            }
        }
        
        while (a < usia1.length){
            usiaGabung[c++] += usia1[a++];
        }
        
        while (b < usia2.length){
            usiaGabung[c++] += usia2[b++];
        }
        System.out.print("Isi array 'usiaGabung': ");
        for (int i : usiaGabung){
            System.out.print(i+" ");
        }
    }
}
