package Modul18;
public class soal4 {
    public static void main(String[] args) {
        int[] usia1 = {18, 39, 45, 50, 65, 70, 90};
        //Deklarasi variabel usia1 bertipe integer array berisi seperti pada di atas
        int[] usia2 = {20, 32, 54, 66, 75, 80, 85, 89, 90, 95, 96};
        //Deklarasi variabel usia2 bertipe integer array berisi seperti pada di atas
        int[] usiaGabung = new int[usia1.length + usia2.length];
        //Deklarasi variabel usiaGabung dengan index sebanyak usia1 + usia2
        int a=0, b=0, c=0;
        //Deklarasi variabel a, b dan c bernilai 0 bertipe integer
        
        while (a < usia1.length && b < usia2.length){
        //Melakukan perulangan selama a kurang dari banyak index usia1
        //dan selama b kurang dari banyak index usia2
            if (usia1[a]<=usia2[b]){ //Jika usia1 index a kurang dari sama dengan usia2 index b
                usiaGabung[c++] += usia1[a++]; //Menambah usiaGabung index c dengan usia1 index a
            }
            else{ //Jika tidak
                usiaGabung[c++] += usia2[b++]; //Menambah usiaGabung index c dengan usia2 index b
            }
        }
        
        while (a < usia1.length){ //Melakukan perulangan selama a kurang dari banyak index usia1
            usiaGabung[c++] += usia1[a++]; //Menambah usiaGabung index c dengan usia1 index a
        }
        
        while (b < usia2.length){ //Melakukan perulangan selama b kurang dari banyak index usia2
            usiaGabung[c++] += usia2[b++]; //Menambah usiaGabung index c dengan usia2 index b
        }
        System.out.print("Isi array 'usiaGabung': ");
        for (int i : usiaGabung){ //Mencetak isi dari array usiaGabung per index i
            System.out.print(i+" ");
        }
    }
}
