/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Modul10;

/**
 *
 * @author Christoporus Jovaldy Octovius Dhaniswara - 265314035
 */
public class LuasKelilingSegiEmpat { //Awal dari kelas LuasKelilingSegiEmpat
    public static void main(String args[]) {
        int panjang, lebar, luas, keliling; //Deklarasi variabel panjang, lebar, luas, dan keliling bertipe integer
        panjang=15;
        lebar=10;
        luas=panjang*lebar; //Rumus luas segi empat
        keliling=2*(panjang+lebar); //Rumus keliling segi empat
        System.out.println("Ini adalah program untuk menghitung luas dan keliling segi empat yang memiliki panjang "+panjang+" dan lebar "+lebar);
        System.out.println("Luas dari segiempatnya adalah: "+luas);
        System.out.println("Keliling dari segiempatnya adalah: "+keliling);
    }
} //Akhir dari kelas LuasKelilingSegiEmpat