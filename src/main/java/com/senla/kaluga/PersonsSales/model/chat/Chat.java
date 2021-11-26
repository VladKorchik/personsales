package com.senla.kaluga.PersonsSales.model.chat;

import com.senla.kaluga.PersonsSales.model.message.Message;
import com.senla.kaluga.PersonsSales.model.seller.Seller;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Chat {
    @Id
    @GeneratedValue
    private int id;
    @OneToMany
    private Set<Message> messageSet;
    @ManyToMany
    private Set<Seller> participant;

}
