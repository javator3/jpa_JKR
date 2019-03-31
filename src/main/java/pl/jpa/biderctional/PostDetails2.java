package pl.jpa.biderctional;

import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@Entity
public class PostDetails2 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String content;

    @OneToOne(mappedBy = "details", fetch = FetchType.EAGER)
            //eager nie trzeba pisac bo domyślne, mozna wybrac Lazy, kwestia wydajności
    private Post2 post2;

    public PostDetails2(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "PostDetails{" +
                "id=" + id +
                ", content='" + content + '\'' +
                '}';
    }
}
