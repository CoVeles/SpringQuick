package configuration;

import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.Configuration;
import proxies.CommentNotificationProxy;
import proxies.EmailCommentNotificationProxyImpl;
import repositories.CommentRepository;
import repositories.DBCommentRepositoryImpl;
import services.CommentService;

@Configuration
public class ProjectConfiguration {
    @Bean
    public CommentRepository commentRepository() {return new DBCommentRepositoryImpl();}
    @Bean
    public CommentNotificationProxy commentNotificationProxy() {return new EmailCommentNotificationProxyImpl();}
    @Bean
    public CommentService commentService(
            CommentRepository commentRepository,
            CommentNotificationProxy commentNotificationProxy) {
        return new CommentService(commentRepository, commentNotificationProxy);}
}
