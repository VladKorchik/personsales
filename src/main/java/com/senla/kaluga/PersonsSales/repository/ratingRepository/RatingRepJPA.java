package com.senla.kaluga.PersonsSales.repository.ratingRepository;

import com.senla.kaluga.PersonsSales.model.sellerrating.SellerRating;
import com.senla.kaluga.PersonsSales.model.seller.Seller;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RatingRepJPA extends JpaRepository<SellerRating, String> {

    public List<SellerRating> findBySeller (Seller seller);



}
