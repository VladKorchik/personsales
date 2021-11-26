package com.senla.kaluga.PersonsSales.repository.ratingRepository;

import com.senla.kaluga.PersonsSales.model.rating.Rating;
import com.senla.kaluga.PersonsSales.model.seller.Seller;
import com.senla.kaluga.PersonsSales.repository.sellerRepository.SellerRepJPA;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.ArrayList;
import java.util.List;

public class RatingRepository {
    @Autowired
    private RatingRepJPA ratingRepJPA;
    @PersistenceContext
    private EntityManager entityManager;

    //todo Возвращаем средний рейтинг кого-либо
    //на сервисном слое сервис заберёт персону, а потом передаст её сюда
    public long getAverageRating(Seller seller) {
        List<Rating> ratings = ratingRepJPA.findBySeller(seller);
        int quantityOfMarks = 0;
        int allMarksSum = 0;
        for (Rating rating : ratings) {
            allMarksSum = +rating.getMark();
            quantityOfMarks++;
        }
        long result = allMarksSum / quantityOfMarks;
        return result;
    }

    //todo новая оценка создаётся на сервисном уровне и передаётся сюда
    public void addMark (Rating rating){
        ratingRepJPA.save(rating);
    }

    //todo Возвращаем все отзывы
    public List<Rating> getAllMarks(Seller seller){
        List<Rating> ratings = ratingRepJPA.findBySeller(seller);
        return ratings;
    }

}