package com.tutorial;

class Mahasiswa {
    // Data Member
    String nama;
    String NIM;
    String Prodi;

    // contruktor dengan parameter
    Mahasiswa (String nama, String NIM, String Prodi) {
        this.nama = nama;
        this.NIM = NIM;
        this.Prodi = Prodi;
    }

    // Method tanpa parameter dan tanpa return 
    void show() {
        System.out.println("Nama: " + this.nama);
        System.out.println("NIM: " + this.NIM);
        System.out.println("Prodi: " + this.Prodi);
    }

    // Method Tanpa Return dengan Parameter
    void setNama(String nama) {
        this.nama = nama;
    }

    // Method dengan return tanpa parameter
    String getNama() {
        return this.nama;
    }

    // Method dengan return dan parameter
    String sayHi(String Pesan) {
        return Pesan + " Aku adalah " + this.nama;
    }
} 

public class Main {
    public static void main(String[] args) {
       // instaniasi project
       Mahasiswa MHS1 = new Mahasiswa("Ulung", "22241007", "PTI");
       MHS1.show();
       MHS1.setNama("Brian");
       MHS1.show();
       System.out.println(MHS1.getNama());
       String pesan = MHS1.sayHi("Hallo");
        System.out.println(pesan);
    }
}
