package com.senla.kaluga.PersonsSales.model.comment;

import com.senla.kaluga.PersonsSales.model.advert.Advert;
import com.senla.kaluga.PersonsSales.model.seller.Seller;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.Hibernate;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class CommentForAdvert implements Serializable {
    @Id
    @GeneratedValue
    private Integer id;
    @ManyToOne
    private Advert advert;
    @CreationTimestamp
    private Timestamp date;
    @ManyToOne
    private Seller author;
    @Size(max = 1000)
    private String question;
    @Size(max = 1000)
    private String answerFromSeller;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        CommentForAdvert that = (CommentForAdvert) o;
        return advert != null && Objects.equals(advert, that.advert);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
