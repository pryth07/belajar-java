/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Modul10;

/**
 *
 * @author Christoporus Jovaldy Octovius Dhaniswara - 265314035
 */
public class VolumeKotak { //Awal dari kelas VolumeKotak
    public static void main(String args[]) {
        int p, l, t; //Deklarasi variabel p (panjang), l (lebar), dan t (tinggi) bertipe integer
        double v; //Deklarasi variabel v (volume) bertipe double
        p=10;
        l=15;
        t=5;
        v=p*l*t; //Rumus volume kotak
        System.out.println("Ini adalah program untuk menghitung volume kotak dengan panjang "+p+", lebar "+l+", dan tinggi "+t);
        System.out.println("Volume dari kotak tersebut adalah "+v);
    }
} //Akhir dari kelas VolumeKotak