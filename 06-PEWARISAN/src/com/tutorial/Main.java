package com.tutorial;

class Hero {
    // Attribut
    String Nama;
    float exp;
    float health;

    void display() {
        System.out.println("Nama Hero: " + this.Nama);
        System.out.println("exp Hero: " + this.exp);
        System.out.println("health Hero: " + this.health);
    }
}

// SubClass
class HeroTank extends Hero {

}

public class Main {
    public static void main(String[] args) {
        Hero hero_1 = new Hero();
        hero_1.display();

        HeroTank hero_2 = new HeroTank();
        hero_2.Nama = "Nana";

        hero_2.display();
    }
}
