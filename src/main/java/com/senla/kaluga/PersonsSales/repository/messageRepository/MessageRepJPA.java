package com.senla.kaluga.PersonsSales.repository.messageRepository;

import com.senla.kaluga.PersonsSales.model.chat.Chat;
import com.senla.kaluga.PersonsSales.model.message.Message;
import com.senla.kaluga.PersonsSales.model.seller.Seller;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MessageRepJPA extends JpaRepository<Message, String> {

//    //todo выгрузи все сообщения с сортировкой по дате
//    List<Message> findBySenderOrReceiverOrderByDate(Seller sender, Seller receiver);

    List<Message> findByChatOrderByDate (Chat chat);


}
