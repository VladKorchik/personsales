package com.senla.kaluga.PersonsSales.repository.sellerRepository;

import com.senla.kaluga.PersonsSales.model.seller.Seller;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SellerRepJPA extends JpaRepository<Seller, String> {



}
