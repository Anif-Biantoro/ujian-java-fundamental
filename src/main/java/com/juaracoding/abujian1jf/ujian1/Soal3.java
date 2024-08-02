package com.juaracoding.abujian1jf.ujian1;
import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {

        System.out.println("=======Hitung Harga Tiket==========");
        // Membuat Scanner untuk input dari pengguna
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna memasukkan jumlah tiket
        System.out.print("Masukkan jumlah tiket yang dibeli: ");
        int jumlahTiket = scanner.nextInt();

        // Meminta pengguna memasukkan hari (weekday atau weekend) untuk menenetukan harga yang diambil
        System.out.print("Apakah ini untuk weekday atau weekend (masukkan 'weekday' atau 'weekend'): ");
        String hari = scanner.next();

        // Deklarasi harga tiket
        double hargaTiket;

        // Menentukan harga tiket berdasarkan hari
        if (hari.equalsIgnoreCase("weekday")) {
            hargaTiket = 35000;
        } else if (hari.equalsIgnoreCase("weekend")) {
            hargaTiket = 45000;
        } else {
            System.out.println("Input hari tidak valid. Gunakan 'weekday' atau 'weekend'.");
            scanner.close();
            return;
        }

        // Menghitung total harga tanpa diskon
        double totalHarga = hargaTiket * jumlahTiket;

        // Mengecek apakah jumlah tiket lebih dari 5 untuk diskon
        if (jumlahTiket > 5) {
            double diskon = 0.1; // Diskon 10%
            totalHarga = totalHarga - (totalHarga * diskon);
        }

        // Mencetak total harga tiket
        System.out.println("Total harga tiket: Rp" + totalHarga);

        // Menutup scanner
        scanner.close();
    }
}
