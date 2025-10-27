package org.example.config;

import org.example.beans.Parrot;
import org.example.beans.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {
    @Bean
    public Parrot parrot () {
        Parrot parrot = new Parrot();
        parrot.setName("Kiki");
        return parrot;
    }

    @Bean
    public Person person () {
        Person person = new Person();
        person.setName("Pojo");
        person.setParrot(parrot());
        return person;
    }
}
