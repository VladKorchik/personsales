package com.senla.kaluga.PersonsSales.model.comment;

import com.senla.kaluga.PersonsSales.model.product.Advert;
import com.senla.kaluga.PersonsSales.model.user.PersonSeller;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.sql.Timestamp;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class CommentForProduct {
    @Id
    @GeneratedValue
    private int id;
    @ManyToOne
    private Advert productId;
    @CreationTimestamp
    private Timestamp date;
    @ManyToOne
    private PersonSeller author;
    @Size(max = 1000)
    private String text;
    @Size(max = 1000)
    private String answerFromSeller;

}
