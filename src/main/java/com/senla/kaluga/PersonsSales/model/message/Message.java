package com.senla.kaluga.PersonsSales.model.message;

import com.senla.kaluga.PersonsSales.model.chat.Chat;
import com.senla.kaluga.PersonsSales.model.seller.Seller;
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

}