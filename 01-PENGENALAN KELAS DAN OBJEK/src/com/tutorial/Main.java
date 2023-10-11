package com.tutorial;

/**
 * Mahasiswa
 */
 class Mahasiswa {
    String nama;
    String NIM;
    String prodi;
}
public class Main {
    public static void main(String[] args) {
        Mahasiswa MHS1 = new Mahasiswa();
        MHS1.nama = "Tulus";
        MHS1.NIM = "22241002";
        MHS1.prodi = "Matematika";

        System.out.println("Nama Mahasiswa: " + MHS1.nama);
        System.out.println("NIM Mahasiswa: " + MHS1.NIM);
        System.out.println("Prodi Mahasiswa: " + MHS1.prodi);

        Mahasiswa MHS2 = new Mahasiswa();
        MHS2.nama = "Virgoun";
        MHS2.NIM = "22241001";
        MHS2.prodi = "Kehutanan";

        
        System.out.println("Nama Mahasiswa: " + MHS2.nama);
        System.out.println("NIM Mahasiswa: " + MHS2.NIM);
        System.out.println("Prodi Mahasiswa: " + MHS2.prodi);
    }
}
