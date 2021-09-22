import java.util.ArrayList;
import java.util.List;

public class Post {
    private String id;
    private String content;
    private List<Comment> comments;
    private List<String> likes;

    public Post(String id, String content) {
        this.id = id;
        this.content = content;
        comments = new ArrayList<>();
        likes = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public void addComment(Comment comment) {
        comments.add(comment);
    }
}
