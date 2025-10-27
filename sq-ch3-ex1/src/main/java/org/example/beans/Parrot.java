package org.example.beans;

public class Parrot {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public Parrot() {
        System.out.println("Parrot constructor");
    }

    @Override
    public String toString() {
        return "Parrot : " + name;
    }
}
