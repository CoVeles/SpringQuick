package repositories;

import model.Comment;

public class DBCommentRepositoryImpl implements CommentRepository {
    @Override
    public void storeComment(Comment comment) {
        System.out.println("Storing comment " + comment.getText());
    }
}
