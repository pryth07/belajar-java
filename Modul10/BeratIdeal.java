/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Modul10;

/**
 *
 * @author Christoporus Jovaldy Octovius Dhaniswara - 265314035
 */
public class BeratIdeal { //Awal dari kelas BeratIdeal
    public static void main(String args[]) {
        int tb, beratIdeal; //Deklarasi variabel tb (tinggi badan) dan beratIdeal bertipe integer
        tb=170;
        beratIdeal=tb-110; //Rumus untuk mencari berat badan ideal berdasarkan tinggi badan
        System.out.println("Ini adalah program untuk menghitung berat badan ideal dari tinggi badan "+tb+" dengan rumus (tinggi-110)");
        System.out.println("Berat badan ideal dari tinggi "+tb+" adalah: "+beratIdeal);
    }
} //Akhir dari kelas BeratIdeal