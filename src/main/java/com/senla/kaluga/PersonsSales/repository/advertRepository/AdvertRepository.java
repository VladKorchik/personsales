package com.senla.kaluga.PersonsSales.repository.advertRepository;

import com.senla.kaluga.PersonsSales.model.advert.Advert;
import com.senla.kaluga.PersonsSales.model.seller.Seller;
import com.senla.kaluga.PersonsSales.repository.sellerRepository.SellerRepJPA;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class AdvertRepository {
    @Autowired
    private AdvertRepJPA advertRepJPA;
    @PersistenceContext
    private EntityManager entityManager;

    //todo Если ты не автор, то должен видеть только активные объявления.
    // Если ты автор - должен видеть и свои неактивные тоже

    //todo получение объявлений с сортировкой по:
    // - сначала премиальные
    // - потом с сортировкой по рейтингу

    public List<Advert> getAllActiveAdverts(){
        return advertRepJPA.findAdvertByIsAdvertActiveIsTrue();
    }

    public List<Advert> getMyOwnAdverts(Seller seller) {
        return advertRepJPA.findByAuthorOrderByDate(seller);
    }

    public void updateAdvert(Integer id, String whatToChange, String newValue) {
        Advert advert = advertRepJPA.getById(id);
        switch (whatToChange) {
            case "name":
                advert.setName(newValue);
                break;
            case "price":
                advert.setPrice(Long.getLong(newValue));
                break;
            case "category":
                advert.setCategory(newValue);
                break;
            case "description":
                advert.setCategory(newValue);
                break;
        }
        advertRepJPA.save(advert);
    }

    public void makeAdvertPremium(Integer id) {
        Advert advert = advertRepJPA.getById(id);
        if (advert.getIsAdvertPremium().equals(false)) {
            advert.setIsAdvertPremium(true);
        } else {
            System.out.println("Advert is already premium!");
        }
        advertRepJPA.save(advert);
    }

    public void changeActivityStatus(Integer id) {
        Advert advert = advertRepJPA.getById(id);
        if (advert.getIsAdvertActive().equals(true)) {
            advert.setIsAdvertActive(false);
        } else {
            advert.setIsAdvertActive(true);
        }
        advertRepJPA.save(advert);
    }

}
