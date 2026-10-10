/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Modul10;

/**
 *
 * @author Christoporus Jovaldy Octovius Dhaniswara - 265314035
 */
public class PanjangSisiMiring { //Awal dari kelas PanjangSisiMiring
    public static void main(String args[]) {
        int alas, tinggi; //Deklarasi variabel alas dan tinggi bertipe integer
        double psm; //Deklarasi variabel psm (panjang sisi miring) bertipe double
        alas=8;
        tinggi=10;
        psm=Math.sqrt((alas*alas)+(tinggi*tinggi)); //Rumus panjang sisi miring segitiga
        System.out.println("Ini adalah program untuk menghitung panjang sisi miring segitiga siku siku dengan alas "+alas+" dan tinggi "+tinggi);
        System.out.println("Panjang sisi miringnya adalah "+psm);
    }
} //Akhir dari kelas PanjangSisiMiring