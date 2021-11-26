package com.senla.kaluga.PersonsSales.repository.messageRepository;

import com.senla.kaluga.PersonsSales.model.chat.Chat;
import com.senla.kaluga.PersonsSales.model.message.Message;
import com.senla.kaluga.PersonsSales.model.seller.Seller;
import com.senla.kaluga.PersonsSales.repository.sellerRepository.SellerRepJPA;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;


public class MessageRepository {
    @Autowired
    private MessageRepJPA messageRepJPA;
    @PersistenceContext
    private EntityManager entityManager;

    //todo
    //нужно возвращать все сообщения, связанные с одним человечком. И желательно это сделать так, чтобы возвращались только секьюрные. Т.е. читать объявления мог либо
    // отправитель, либо получатель. Это ограничим на уровне эндпоинтов

    public List<Message> getAllMessages(Chat chat) {
        return messageRepJPA.findByChatOrderByDate(chat);
    }

    public void newMessage(Message message) {
        messageRepJPA.save(message);
    }

}
