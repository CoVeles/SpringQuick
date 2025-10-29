package main;

import configuration.ProjectConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import services.CommentService;
import services.UserService;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfiguration.class);

        CommentService cs = context.getBean(CommentService.class);
        UserService us = context.getBean(UserService.class);

        boolean b = cs.getCommentRepository() == us.getCommentRepository();
        System.out.println(b);
    }
}
