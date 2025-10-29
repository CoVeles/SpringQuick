package org.example.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person {
    private String name = "Ella";
    private final Parrot parrot;

    public Person(@Qualifier("parrot2") Parrot p) {
        this.parrot = p;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //public void setParrot(Parrot parrot2) {this.parrot = parrot2;}

    public Parrot getParrot() {
        return parrot;
    }
}
