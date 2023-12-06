package com.tutorial;

class Player {
    // Data Member
    String nama; // Default (Bisa dibaca dan ditulis oleh class yang lain)
    public int exp; // Bisa dibaca dan ditulis oleh class yang lain
    private int health; // hanya bisa dibaca oleh class itu sendiri

    // Konstruktor 
    Player (String nama, int exp, int health) {
        this.nama = nama;
        this.exp = exp;
        this.health = health;
    }
    
    void display() {
        System.out.println("Nama: "+ this.nama);
        System.out.println("exp: "+ this.exp);
        System.out.println("Health: "+ this.health);
    }
}

public class Main {
    public static void main(String[] args) {
        Player player = new Player("Alucard", 95, 100);
        player.display();
        player.nama = "Miyabi";
        System.out.println(player.nama);

        player.exp = 50;
        System.out.println(player.exp);
    }
}
