import java.util.*;
import java.util.List;
import javax.persistence.*;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private String email;

    @OneToMany(mappedBy = "user")
    private List<Post> posts;


    public User() {}
    public User(String name, String email, List<Post> posts) {
        this.name = name;
        this.email = email;
        this.posts = posts;
    }

    public Long getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public str getPosts() {
        return posts;
    }
    public void setPosts(str posts) {
        this.posts = posts;
    }
}