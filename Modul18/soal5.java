package Modul18;

public class soal5 {
    public static void main(String[] args) {
        int [] bil = {23, 26, 30, 32, 33, 69, 50, 70, 80, 55, 76, 53, 21};
        //Deklarasi variabel bil bertipe integer array berisi seperti pada di atas
        int a=0, b=0, c=0, d=0;
        //Deklarasi variabel a, b, c, dan d bernilai 0 bertipe integer
        for (int i = 0; i < bil.length; i++) {
        //Perulangan for i=0 diulangi selama i < banyak index array bil, menambah nilai i setiap perulangan
            if (bil[i] % 2 >= 1){       //Jika elemen array index i habis dibagi 2 lebih dari sama dengan 1
                a++;                    //tambah nilai variabel a sebesar 1
            }
            else{                       //Jika tidak,
                b++;                    //tambah nilai variabel b sebesar 1
            }
        }
        int [] ganjil = new int[a];     //Deklarasi variabel ganjil array dan banyak index sebanyak a
        int [] genap = new int[b];      //Deklarasi variabel genap array dan banyak index sebanyak b
        for (int i = 0; i < bil.length; i++) {
        //Perulangan for i=0 diulangi selama i < banyak index array bil, menambah nilai i setiap perulangan
            if (bil[i] % 2 > 0){       //Jika elemen array index i tidak habis dibagi 2,
                ganjil[c++] += bil[i];  //tambah ganjil index c dengan bil index i
            }
            else{                       //Jika tidak,
                genap[d++] += bil[i];   //tambah genap index d dengan bil index i
            }
        }
        System.out.print("Isi array 'ganjil': ");
        for (int i: ganjil){            //Mencetak isi dari array ganjil per index i
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.print("Isi array 'genap': ");
        for (int i: genap){             //Mencetak isi dari array genap per index i
            System.out.print(i+" ");
        }
    }
}
