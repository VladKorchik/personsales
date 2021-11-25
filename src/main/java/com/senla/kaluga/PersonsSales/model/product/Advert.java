package com.senla.kaluga.PersonsSales.model.product;

import com.senla.kaluga.PersonsSales.model.comment.CommentForAdvert;
import com.senla.kaluga.PersonsSales.model.user.PersonSeller;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.sql.Timestamp;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Advert {
    @Id
    @GeneratedValue
    private Integer id;
    @Size(max = 100)
    private String name;
    private int price;
    @ManyToOne
    private PersonSeller author;
    @Size(max = 150)
    private String category;
    @Size(max = 2000)
    private String description;
    @CreationTimestamp
    private Timestamp date;
    // todo
    @Size (min = 0, max = 5, message = "рейтинг не может быть ")
    private int advertRating;
    @OneToMany
    private Set<CommentForAdvert> commentForAdvertSet;
}
