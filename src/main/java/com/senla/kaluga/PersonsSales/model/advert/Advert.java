package com.senla.kaluga.PersonsSales.model.advert;

import com.senla.kaluga.PersonsSales.model.comment.CommentForAdvert;
import com.senla.kaluga.PersonsSales.model.seller.Seller;
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

    //todo можно подумать над реализацией фоток товара

    @Id
    @GeneratedValue
    private Integer id;
    @Size(max = 100)
    private String name;
    private Long price;
    @ManyToOne
    private Seller author;
    @Size(max = 150)
    private String category;
    @Size(max = 2000)
    private String description;
    @CreationTimestamp
    private Timestamp date;
    private Boolean isAdvertPremium;
    private Boolean isAdvertActive;
    @OneToMany
    private Set<CommentForAdvert> commentForAdvertSet;

}