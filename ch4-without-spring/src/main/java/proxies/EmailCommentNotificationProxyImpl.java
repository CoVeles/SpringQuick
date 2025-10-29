package proxies;

import model.Comment;

public class EmailCommentNotificationProxyImpl implements CommentNotificationProxy {
    @Override
    public void sendComment(Comment comment) {
        System.out.println("Sending notification for comment: " + comment.getText());
    }
}
