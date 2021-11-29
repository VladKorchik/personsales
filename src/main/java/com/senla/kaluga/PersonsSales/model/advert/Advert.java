package com.senla.kaluga.PersonsSales.model.advert;

import com.senla.kaluga.PersonsSales.model.comment.CommentForAdvert;
import com.senla.kaluga.PersonsSales.model.seller.Seller;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.boot.context.properties.bind.DefaultValue;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.sql.Timestamp;
import java.util.Set;

@Entity
@Getter
@Setter
@EqualsAndHashCode
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
    // Тут надо что-то сделать, чтобы по умолчанию объявление было неактивным
    private Boolean isAdvertPremium;
    //тут надо что-то сделать, чтобы после создания объявление было активно
    private Boolean isAdvertActive;
    @OneToMany
    private Set<CommentForAdvert> commentForAdvertSet;

}