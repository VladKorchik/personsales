package com.senla.kaluga.PersonsSales.repository;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class PersonRepository {
    @Autowired
    private PersonRepJPA personRepJPA;
    @PersistenceContext
    private EntityManager entityManager;

}
