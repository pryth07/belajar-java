package Modul15;
import java.util.Scanner;
public class tabelHitungNilai { //Awal dari kelas tabelHitungNilai
    public static void main(String[] args) {
        double y=0, a=0, b=0, c=0, d=0, x1=0, x2=0, akar1=0, akar2=0;
        //Deklarasi y, a, b, c, d, x1, x2, akar1, dan akar2 bernilai 0 bertipe double (bilangan real)
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai a: ");
        a = sc.nextDouble(); //Meminta input nilai a
        System.out.print("Masukkan nilai b: ");
        b = sc.nextDouble(); //Meminta input nilai b
        System.out.print("Masukkan nilai c: ");
        c = sc.nextDouble(); //Meminta input nilai c
        sc.close(); //Menutup Scanner sc agar tidak terus menggunakan memori
        d=(b*b)-(4*a*c); //Menghitung nilai Diskriminan dengan rumus D=b^2-4ac
        if (d>0){ //Percabangan jika nilai D lebih dari 0
            akar1=(-b + Math.sqrt(d)) / (2*a); //Menghitung akar1 dengan rumus x = (-b + akar d) / 2a
            akar2=(-b - Math.sqrt(d)) / (2*a); //Menghitung akar2 dengan rumus x = (-b - akar d) / 2a
            x1=Math.min(akar1, akar2); //Membandingkan dan mengembalikan angka yang lebih kecil
            x2=Math.max(akar1, akar2); //Membandingkan dan mengembalikan angka yang lebih besar
            System.out.println("Dari persamaan y = "+a+"x^2 + "+b+"x + "+c);
            System.out.println("Akar-akarnya adalah "+x1+" dan "+x2);
            System.out.println("Nilai y untuk beberapa x antara akar pertama dan kedua adalah");
            System.out.println();
            System.out.println("--------------------------------------------------------------------------");
            System.out.println("\tx\t\t\t\ty = "+a+"x^2 + "+b+"x + "+c);
            System.out.println("--------------------------------------------------------------------------");
            for (double x = x1; x <= x2; x+=0.25) { //Perulangan selama x kurang dari sama dengan x2, menambah nilai x sebesar 0.25 setiap perulangan
                y=(a*x*x)+(b*x)+c; //Menghitung y dengan rumus y = ax^2 + bx + c
                System.out.println("\t"+x+"\t\t\t\t\t"+y);
            }
            System.out.println("--------------------------------------------------------------------------");
        }
        else{ //Percabangan jika nilai D tidak lebih dari 0, menampilkan pesan ke user
            System.out.println("D tidak lebih dari 0");
        }
    }
} //Akhir dari kelas tabelHitungNilai
