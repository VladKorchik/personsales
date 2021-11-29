package com.senla.kaluga.PersonsSales.model.chat;

import com.senla.kaluga.PersonsSales.model.seller.Seller;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
@Embeddable
public class EmbeddedIdKey implements Serializable {
    private Seller firstParticipant;
    private Seller secondParticipant;

}
