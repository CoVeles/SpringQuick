package org.example.config;

import org.example.main.Parrot;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.example.main")
//@ComponentScan(basePackageClasses = Parrot.class)
public class ProjectConfig {

}
