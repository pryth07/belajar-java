/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Modul10;

/**
 *
 * @author Christoporus Jovaldy Octovius Dhaniswara - 265314035
 */
public class KelilingLuasLingkaran { //Awal dari kelas KelilingLuasLingkaran
    public static void main(String args[]) {
        int r; //Deklarasi variabel r (jari-jari) bertipe integer
        double keliling, luas; //Deklarasi variabel keliling dan luas bertipe double
        r=21;
        keliling=2*Math.PI*r; //Rumus keliling lingkaran
        luas=Math.PI*r*r; //Rumus luas lingkaran
        System.out.println("Ini adalah program untuk menghitung keliling dan luas lingkaran yang memiliki jari-jari "+r);
        System.out.println("Keliling dari lingkarannya adalah: "+keliling);
        System.out.println("Luas dari lingkarannya adalah: "+luas);
    }
} //Akhir dari kelas KelilingLuasLingkaran