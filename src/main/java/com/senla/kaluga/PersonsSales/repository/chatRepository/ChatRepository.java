package com.senla.kaluga.PersonsSales.repository.chatRepository;

import com.senla.kaluga.PersonsSales.model.chat.Chat;
import com.senla.kaluga.PersonsSales.model.seller.Seller;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class ChatRepository {
    @Autowired
    private ChatRepJPA chatRepJPA;
    @PersistenceContext
    private EntityManager entityManager;

    public List<Chat> getMyChats(Seller seller){
        return chatRepJPA.findByEmbeddedIdKeyContains(seller);
    }

}
