package com.tutorial;

class BangunDatar {
    float Luas(){
        return 0;
    }
    
    float Keliling(){
        return 0;
    }
}

class Persegi extends BangunDatar {
    private float sisi;

    public void setSisi(float sisi) {
        this.sisi = sisi;
    }

    @Override
    float Luas(){
        return this.sisi * this.sisi;
    }

    @Override
    float Keliling(){
        return 4 * this.sisi;
    }

    void display() {
        System.out.println("-- Bangun Datar Persegi --");
        System.out.println("Luas: " + Luas());
        System.out.println("Keliling: " + Keliling());
        System.out.println("");
    }
}

class Lingkaran extends BangunDatar {
    private float r;

    public void setR(float r) {
        this.r = r;
    }

    @Override
    float Luas() {
        return (float) (Math.PI * this.r * this.r);
    }
    
    @Override
    float Keliling() {
        return (float) (2 * Math.PI * this.r);
    }

    void display() {
        System.out.println("-- Bangun Datar Lingkaran --");
        System.out.println("Luas: " + Luas());
        System.out.println("Keliling: " + Keliling());
        System.out.println("");
    }
}

class PersegiPanjang extends BangunDatar {
    private float panjang, lebar;
    
    public void setPanjang(float panjang) {
        this.panjang = panjang;
    }

    public void setLebar(float lebar) {
        this.lebar = lebar;
    }

    @Override
    float Luas() {
        return this.panjang * this.lebar;
    }

    @Override
    float Keliling() {
        return 2*this.panjang + 2*this.lebar;
    }

    void display() {
        System.out.println("-- Bangun Datar Persegi Panjang --");
        System.out.println("Luas: " + Luas());
        System.out.println("Keliling: " + Keliling());
        System.out.println("");
    }
}

class Segitiga extends BangunDatar {
    private float alas, tinggi;

    public void getAlas(float alas) {
        this.alas = alas;
    }

    public void getTinggi(float tinggi) {
        this.tinggi = tinggi;
    }

    @Override
    float Luas() {
        return (float)1 / (float)2*(this.alas*this.tinggi);        
    }

    @Override
    float Keliling() {
        float sisiC = (float) Math.sqrt((this.alas * this.alas) + (this.tinggi * this.tinggi));
        return this.alas+this.tinggi+sisiC;
    }

    void display() {
        System.out.println("-- Bangun Datar Segitiga --");
        System.out.println("Luas: " + Luas());
        System.out.println("Keliling: " + Keliling());
    }
}

public class Main {
    public static void main(String[] args) {
        Persegi persegi = new Persegi();
        persegi.setSisi(5);
        persegi.display();

        Lingkaran lingkaran = new Lingkaran();
        lingkaran.setR(45);
        lingkaran.display();

        PersegiPanjang persegiPanjang = new PersegiPanjang();
        persegiPanjang.setPanjang(11);
        persegiPanjang.setLebar(6);
        persegiPanjang.display();

        Segitiga segitiga = new Segitiga();
        segitiga.getAlas(20);
        segitiga.getTinggi(11);
        segitiga.display();
    }
}
