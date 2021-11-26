package com.senla.kaluga.PersonsSales.repository.sellerRepository;

import com.senla.kaluga.PersonsSales.model.seller.Seller;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.Optional;

public class SellerRepository {
    @Autowired
    private SellerRepJPA sellerRepJPA;
    @PersistenceContext
    private EntityManager entityManager;
//    Инжектировать с помощью @Autowired нельзя, так как @PersistenceContext заботится о создании уникального
//    EntityManager для каждого потока, для соблюдения потокобезопасности.

    @Transactional
    public void updateUser(Long phoneNumber, String whatToChange, String newValue) {
        Seller seller = sellerRepJPA.getById(phoneNumber.toString());

        switch (whatToChange) {
            case "password":
                seller.setPassword(newValue);
                break;
            case "firstName":
                seller.setFirstName(newValue);
                break;
            case "lastName":
                seller.setLastName(newValue);
                break;
            case "email":
                seller.setEmail(newValue);
                break;
        }
        sellerRepJPA.save(seller);
    }

    //todo

    // где-то должен быть такой функционал восстановления пароля по email. вроде в спринг секурити



}
