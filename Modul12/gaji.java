import java.util.Scanner;
public class gaji {
    public static void main(String[] args) {
        String golongan;
        int gajiPokok, masaKerja;
        double bonus, totalGaji;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan gaji pokok: ");
        gajiPokok = input.nextInt();
        System.out.print("Masukkan golongan (I, II, III, IV): ");
        golongan = input.next();
        System.out.print("Masukkan masa kerja (tahun): ");
        masaKerja = input.nextInt();
        switch (golongan) {
            case "I":
                if (masaKerja>=0 && masaKerja<=10){
                    bonus = gajiPokok * 0.5;
                    totalGaji = gajiPokok + bonus;
                    System.out.println("Selamat! Kamu mendapatkan bonus sebesar Rp"+bonus);
                    System.out.println("Total gaji kamu setelah bonus adalah Rp"+totalGaji);
                } else if (masaKerja>=11 && masaKerja<=20){
                    bonus = gajiPokok * 0.6;
                    totalGaji = gajiPokok + bonus;
                    System.out.println("Selamat! Kamu mendapatkan bonus sebesar Rp"+bonus);
                    System.out.println("Total gaji kamu setelah bonus adalah Rp"+totalGaji);
                } else if (masaKerja>=21){
                    bonus = gajiPokok * 0.7;
                    totalGaji = gajiPokok + bonus;
                    System.out.println("Selamat! Kamu mendapatkan bonus sebesar Rp"+bonus);
                    System.out.println("Total gaji kamu setelah bonus adalah Rp"+totalGaji);
                }
                break;
            case "II":
                if (masaKerja>=0 && masaKerja<=10){
                    bonus = gajiPokok * 0.6;
                    totalGaji = gajiPokok + bonus;
                    System.out.println("Selamat! Kamu mendapatkan bonus sebesar Rp"+bonus);
                    System.out.println("Total gaji kamu setelah bonus adalah Rp"+totalGaji);
                } else if (masaKerja>=11 && masaKerja<=20){
                    bonus = gajiPokok * 0.7;
                    totalGaji = gajiPokok + bonus;
                    System.out.println("Selamat! Kamu mendapatkan bonus sebesar Rp"+bonus);
                    System.out.println("Total gaji kamu setelah bonus adalah Rp"+totalGaji);
                } else if (masaKerja>=21){
                    bonus = gajiPokok * 0.8;
                    totalGaji = gajiPokok + bonus;
                    System.out.println("Selamat! Kamu mendapatkan bonus sebesar Rp"+bonus);
                    System.out.println("Total gaji kamu setelah bonus adalah Rp"+totalGaji);
                }
                break;
            case "III":
                if (masaKerja>=0 && masaKerja<=10){
                    bonus = gajiPokok * 0.7;
                    totalGaji = gajiPokok + bonus;
                    System.out.println("Selamat! Kamu mendapatkan bonus sebesar Rp"+bonus);
                    System.out.println("Total gaji kamu setelah bonus adalah Rp"+totalGaji);
                } else if (masaKerja>=11 && masaKerja<=20){
                    bonus = gajiPokok * 0.8;
                    totalGaji = gajiPokok + bonus;
                    System.out.println("Selamat! Kamu mendapatkan bonus sebesar Rp"+bonus);
                    System.out.println("Total gaji kamu setelah bonus adalah Rp"+totalGaji);
                } else if (masaKerja>=21){
                    bonus = gajiPokok * 0.9;
                    totalGaji = gajiPokok + bonus;
                    System.out.println("Selamat! Kamu mendapatkan bonus sebesar Rp"+bonus);
                    System.out.println("Total gaji kamu setelah bonus adalah Rp"+totalGaji);
                }
                break;
            case "IV":
                if (masaKerja>=0 && masaKerja<=10){
                    bonus = gajiPokok * 0.8;
                    totalGaji = gajiPokok + bonus;
                    System.out.println("Selamat! Kamu mendapatkan bonus sebesar Rp"+bonus);
                    System.out.println("Total gaji kamu setelah bonus adalah Rp"+totalGaji);
                } else if (masaKerja>=11 && masaKerja<=20){
                    bonus = gajiPokok * 0.9;
                    totalGaji = gajiPokok + bonus;
                    System.out.println("Selamat! Kamu mendapatkan bonus sebesar Rp"+bonus);
                    System.out.println("Total gaji kamu setelah bonus adalah Rp"+totalGaji);
                } else if (masaKerja>=21){
                    bonus = gajiPokok;
                    totalGaji = gajiPokok + bonus;
                    System.out.println("Selamat! Kamu mendapatkan bonus sebesar Rp"+bonus);
                    System.out.println("Total gaji kamu setelah bonus adalah Rp"+totalGaji);
                }
                break;
        }
    }
}