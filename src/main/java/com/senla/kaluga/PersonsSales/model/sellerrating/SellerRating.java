package com.senla.kaluga.PersonsSales.model.sellerrating;

import com.senla.kaluga.PersonsSales.model.seller.Seller;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Size;

    //todo получение общего рейтинга продавца можно организовать на сервисном слое. Но это необязательно.
    // Главное - чтобы объявления правильно сортировались.

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
@Entity
public class SellerRating {
    @Id
    @GeneratedValue
    private int id;
    @ManyToOne
    private Seller seller;
    @Size(min = 1, max = 10, message = "Оценка ставится в диапазоне от 1 до 10")
    private int mark;
    @Size (max = 1000)
    private String text;

}
