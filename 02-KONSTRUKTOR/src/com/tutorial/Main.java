package com.tutorial;

// class tanpa konstruktor
class Polos {
     String dataString;
     int dataInteger;

}

// class dengan konstruktor
class Mahasiswa {
    String nama;
    String nim;
    String prodi;

    // membuat konstruktor 
    // Mahasiswa(){
    //     System.out.println("Ini Adalah Konstruktor");
    // }

    // membuat konstruktor dengan parameter

    Mahasiswa(String inputNama, String inputNIM, String InputProdi) {
        nama = inputNama;
        nim = inputNIM;
        prodi = InputProdi;
        System.out.println("Nama: "+nama);
        System.out.println("NIM: "+nim);
        System.out.println("Prodi: "+prodi);
    }
} 

public class Main {
    public static void main(String[] args) {
        // Mahasiswa mhs1 = new Mahasiswa();
        // Polos pls = new Polos();
        // pls.dataString = "Polos";
        // pls.dataInteger = 10;

        // System.out.println("Isi data String: "+ pls.dataString);
        // System.out.println("Isi data Integer: "+ pls.dataInteger);
     
        // Memanggil konstruktor
        new Mahasiswa("Ulung Briansyah Putra", "22241007", "PTI");
    }
}
