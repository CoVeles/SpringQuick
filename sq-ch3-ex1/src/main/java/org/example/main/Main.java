package org.example.main;

import org.example.beans.Parrot;
import org.example.beans.Person;
import org.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Parrot parrot = ctx.getBean(Parrot.class);
        System.out.println(parrot.toString());

        Person person = ctx.getBean(Person.class);
        System.out.println(person.toString());

        System.out.println("Person's parrot " + person.getParrot());
    }
}
