package com.senla.kaluga.PersonsSales.model.message;

import com.senla.kaluga.PersonsSales.model.chat.Chat;
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
import java.sql.Timestamp;
import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Message {
    @Id
    @GeneratedValue
    private Integer id;
    @CreationTimestamp
    private Timestamp date;
    @ManyToOne
    private Seller sender;
    @ManyToOne
    private Seller receiver;
    @Size(max = 5000)
    private String text;
    @ManyToOne
    private Chat chat;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Message message = (Message) o;
        return id != null && Objects.equals(id, message.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}