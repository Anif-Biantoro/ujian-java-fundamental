package com.juaracoding.abujian1jf.ujian1;
import java.util.Scanner;
public class Soal4 {
    public static void main(String[] args) {
        System.out.println("=======Daftar Film Bioskop==========");
        // Membuat Scanner untuk input dari pengguna
        Scanner scanner = new Scanner(System.in);

        // Mendeklarasikan array untuk menyimpan nama-nama film
        String[] namaFilm = new String[5];

        // Meminta pengguna memasukkan nama-nama film
        for (int i = 0; i < namaFilm.length; i++) {
            System.out.print("Masukkan nama film ke-" + (i + 1) + ": ");
            namaFilm[i] = scanner.nextLine();
        }

        // Mencetak nama-nama film yang telah dimasukkan
        System.out.println("\nFilm yang ingin ditonton:");
        for (int i = 0; i < namaFilm.length; i++) {
            System.out.println((i + 1) + ". " + namaFilm[i]);
        }

        // Menutup scanner
        scanner.close();
    }
}
