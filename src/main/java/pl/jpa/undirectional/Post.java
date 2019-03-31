package pl.jpa.undirectional;

import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@Entity
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    @OneToOne (cascade = CascadeType.ALL)
    @JoinColumn(name = "details_id")
    private PostDetails details;

    public Post(String title) {
        this.title = title;
    }

    public PostDetails getDetails() {
        return details;
    }

    public void setDetails(PostDetails details) {
        this.details = details;
    }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", details=" + details +
                '}';
    }
}

