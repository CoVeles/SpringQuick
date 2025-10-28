package org.example.config;

import org.example.beans.Parrot;
import org.example.beans.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {
    @Bean
    public Parrot parrot1(){
        Parrot parrot = new Parrot();
        parrot.setName("Koko");
        return parrot;
    }

    @Bean
    public Parrot parrot2(){
        Parrot parrot = new Parrot();
        parrot.setName("Kiki");
        return parrot;
    }

    @Bean
    public Person person(Parrot parrot2){
        Person person = new Person();
        person.setName("Lili");
        person.setParrot(parrot2);
        return person;
    }
}
