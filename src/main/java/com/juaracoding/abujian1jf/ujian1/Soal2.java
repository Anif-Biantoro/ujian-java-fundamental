package com.juaracoding.abujian1jf.ujian1;
import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        System.out.println("=======Merubah Huruf Besar==========");
        // Membuat Scanner untuk input dari pengguna
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna memasukkan nama film
        System.out.print("Masukkan nama film: ");
        String namaFilm = scanner.nextLine();

        // Mengubah nama film menjadi huruf besar semuanya
        String namaFilmUppercase = namaFilm.toUpperCase();

        // Mencetak nama film dalam huruf besar
        System.out.println("Nama film dalam huruf besar: " + namaFilmUppercase);

        // Menutup scanner
        scanner.close();
    }
}
