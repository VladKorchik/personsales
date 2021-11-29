package com.senla.kaluga.PersonsSales.repository.chatRepository;

import com.senla.kaluga.PersonsSales.model.chat.Chat;
import com.senla.kaluga.PersonsSales.model.message.Message;
import com.senla.kaluga.PersonsSales.model.seller.Seller;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ChatRepJPA extends JpaRepository<Chat, String> {

    //todo change the method
    List<Chat> findByEmbeddedIdKeyContains(Seller seller);



}
