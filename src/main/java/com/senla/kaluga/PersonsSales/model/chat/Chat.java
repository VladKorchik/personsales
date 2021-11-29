package com.senla.kaluga.PersonsSales.model.chat;

import com.senla.kaluga.PersonsSales.model.message.Message;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
@Entity
public class Chat implements Serializable {
    @EmbeddedId
    private EmbeddedIdKey embeddedIdKey;
    @OneToMany
    private Set<Message> messageSet;

    @Override
    public String toString() {
        return "Chat{" +
                "first participant" + embeddedIdKey.getFirstParticipant() +
                "second participant" + embeddedIdKey.getSecondParticipant() +
                ", messageSet=" + messageSet +
                '}';
    }


}
