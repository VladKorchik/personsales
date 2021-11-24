package com.senla.kaluga.PersonsSales.repository.messageRepository;

import com.senla.kaluga.PersonsSales.model.message.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepJPA extends JpaRepository<Message, String> {


}
