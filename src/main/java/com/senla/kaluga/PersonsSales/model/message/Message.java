package com.senla.kaluga.PersonsSales.model.message;

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
public class Message {
    @Id
    @GeneratedValue
    private Integer id;
    @CreationTimestamp
    private Timestamp date;
    @ManyToOne
    private PersonSeller sender;
    @ManyToOne
    private PersonSeller reciever;
    @Size(max = 5000)
    private String text;

}
