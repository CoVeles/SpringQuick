package main;

import model.Comment;
import proxies.CommentNotificationProxy;
import proxies.EmailCommentNotificationProxyImpl;
import repositories.CommentRepository;
import repositories.DBCommentRepositoryImpl;
import services.CommentService;

public class Main {
    public static void main(String[] args) {
        CommentRepository cr = new DBCommentRepositoryImpl();
        CommentNotificationProxy cnp = new EmailCommentNotificationProxyImpl();
        CommentService cs = new CommentService(cr,cnp);

        Comment comment = new Comment();
        comment.setText("Hello World");
        comment.setAuthor("John Doe");

        cs.publishComment(comment);
    }
}
