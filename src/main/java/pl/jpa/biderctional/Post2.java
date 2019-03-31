package pl.jpa.biderctional;

import lombok.NoArgsConstructor;
import pl.jpa.undirectional.PostDetails;

import javax.persistence.*;

@NoArgsConstructor
@Entity
public class Post2 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    @OneToOne (cascade = CascadeType.ALL)
    @JoinColumn(name = "details_id")
    private PostDetails details;

    public Post2(String title) {
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
        return "Post2{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", details=" + details +
                '}';
    }
}

