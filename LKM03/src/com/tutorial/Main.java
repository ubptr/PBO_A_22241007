package com.tutorial;

class Pegawai {
    public String nama;
    public String jabatan;
    public float pajak;
    public float gajiPokok;
    private float gajiBersih;
    
    Pegawai(String nama, String jabatan, float pajak, float gajiPokok) {
        this.nama = nama;
        this.jabatan = jabatan;
        this.pajak = pajak/100;
        this.gajiPokok = gajiPokok;
    }
    
    public float setPajak(float pajak) {
        return this.pajak = pajak/100;
    }

    public float getGajiBersih() {
        return this.gajiPokok - (this.gajiPokok*this.pajak);
    }

    public void display() {
        System.out.println("Nama Karyawan: " + this.nama);
        System.out.println("Jabatan: " + this.jabatan);
        System.out.println("Gaji Bersih: " + this.getGajiBersih());
    }
}

public class Main {
    public static void main(String[] args) {
        Pegawai pegawai_1 = new Pegawai("Ulung Briansyah Putra", "CEO", 10, 3500000);
        pegawai_1.display();
        pegawai_1.setPajak(75);
        pegawai_1.display();
    }
}
