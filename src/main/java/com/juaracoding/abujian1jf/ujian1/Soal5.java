package com.juaracoding.abujian1jf.ujian1;
public class Soal5 {
    public static void main(String[] args) {
        // Mendeklarasikan dan menginisialisasi array dengan harga tiket 5 film
        int[] hargaTiket = {50000, 60000, 70000, 80000, 90000};

        // Menghitung total harga tiket
        int totalHarga = 0;

        // Mencetak harga masing-masing tiket dan menghitung total harga
        System.out.println("=====Harga tiket untuk masing-masing film=====");
        for (int i = 0; i < hargaTiket.length; i++) {
            System.out.println("Harga tiket film " + (i + 1) + ": Rp" + hargaTiket[i]);
            totalHarga += hargaTiket[i];
        }

        // Mencetak total harga tiket
        System.out.println("\nTotal harga tiket: Rp" + totalHarga);
    }
}
