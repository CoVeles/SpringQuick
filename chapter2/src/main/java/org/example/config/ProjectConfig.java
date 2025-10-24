package org.example.config;

import org.example.main.Parrot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ProjectConfig {

    @Bean //context.getBean("parrot1", Parrot.class);
    @Primary // set this Bean as default
    Parrot parrot1() {
        Parrot parrot = new Parrot();
        parrot.setName("Koko");
        return parrot;
    }

    @Bean(name = "miki") //context.getBean("miki", Parrot.class);
    Parrot parrot2() {
        Parrot parrot = new Parrot();
        parrot.setName("Miki");
        return parrot;
    }

    @Bean(value = "riki") //context.getBean("riki", Parrot.class);
    Parrot parrot3() {
        Parrot parrot = new Parrot();
        parrot.setName("Riki");
        return parrot;
    }

    @Bean("tiki") //context.getBean("tiki", Parrot.class);
    Parrot parrot4() {
        Parrot parrot = new Parrot();
        parrot.setName("Tiki");
        return parrot;
    }

    @Bean
    String hello(){
        return "hello";
    }

    @Bean
    Integer number(){
        return 12;
    }
}
