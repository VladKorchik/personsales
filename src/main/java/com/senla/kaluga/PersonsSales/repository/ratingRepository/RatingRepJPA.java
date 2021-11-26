package com.senla.kaluga.PersonsSales.repository.ratingRepository;

import com.senla.kaluga.PersonsSales.model.rating.Rating;
import com.senla.kaluga.PersonsSales.model.seller.Seller;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RatingRepJPA extends JpaRepository<Rating, String> {

    public List<Rating> findBySeller (Seller seller);



}
