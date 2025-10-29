package org.example.config;

import org.example.beans.Parrot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.example.beans")
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

}
