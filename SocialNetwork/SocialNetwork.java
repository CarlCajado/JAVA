import java.util.ArrayList;
import java.util.List;

public class SocialNetwork {

    private List<User> users;

    public SocialNetwork() {
        users = new ArrayList<User>();
    }

    public void addUser(User user) {
        users.add(user);
    }

    public User getUserById(String id) {

        for (User u : users) {
            if (id == u.getId())
                return u;
        }

        return null;

    }

    private Post getPostById(Post post, User id) {
        for (User getUserById(id) i : posts) {

        }
        return null;
    }

    public void addPost(String id, Post post) {
        User userId = getUserById(id);
        userId.addPost(post);
    }

    public void addComment(String user1, String user2, String postId, Comment comment) {
        User userComented = getUserById(user1);
        User userPosted = getUserById(user2);
        Post post = getPostById(postId);

    }
}