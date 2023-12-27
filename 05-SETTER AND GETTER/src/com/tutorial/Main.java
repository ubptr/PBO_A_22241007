package com.tutorial;

class User {
    private String username;
    private String password;

    // Membuat Konstruktor
    User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // Method Getter
    public String getUsername() {
        return this.username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password){
        this.password = password;
    }
}

public class Main {
    public static void main(String[] args) {
        User person_1 = new User("Goku", "powerranggers");
        // Panggil Method Getter 
        System.out.println(person_1.getUsername());
        System.out.println(person_1.getPassword());

        person_1.setPassword("12345678");
        System.out.println("New Password: " + person_1.getPassword());
    }
}
