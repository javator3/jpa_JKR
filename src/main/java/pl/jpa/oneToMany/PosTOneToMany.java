package pl.jpa.oneToMany;


import lombok.NoArgsConstructor;
import pl.jpa.oneToMany.PostCommentOneToMany;

import javax.persistence.*;
import java.util.List;

@NoArgsConstructor
@Entity
public class PosTOneToMany {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;


    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "COMMENT_ID")
    private List<PostCommentOneToMany>comments;

    public PosTOneToMany(String title) {
        this.title = title;
    }

    public List<PostCommentOneToMany> getComments() {
        return comments;
    }

    @Override
    public String toString() {
        return "PosTOneToMany{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", comments=" + comments +
                '}';
    }
}
