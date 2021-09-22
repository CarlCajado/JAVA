import java.util.ArrayList;
import java.util.List;

public class User {

    private String id;
    private String name;
    private List<User> friends;
    private List<Post> posts;

    public User(String id, String name) {

        this.id = id;
        this.name = name;
        friends = new ArrayList<>();
        posts = new ArrayList<>();
    }

    public void addFriend(User friend) {
        friends.add(friend);
    }

    public void addPost(Post post) {

        posts.add(post);
    }

    public String getid() {
        return id;
    }

    public String getNmame() {
        return name;
    }

    public List<Post> getUserPosts() {
        return this.posts;
    }

    public String toString() {
        return "(" + id + "," + name + ")";
    }
}
