package com.senla.kaluga.PersonsSales.repository.commentsRepository;

import com.senla.kaluga.PersonsSales.repository.sellerRepository.SellerRepJPA;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class CommentsRepository {
    @Autowired
    private SellerRepJPA sellerRepJPA;
    @PersistenceContext
    private EntityManager entityManager;



}
