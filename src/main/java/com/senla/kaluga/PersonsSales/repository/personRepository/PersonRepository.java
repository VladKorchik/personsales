package com.senla.kaluga.PersonsSales.repository.personRepository;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class PersonRepository {
    @Autowired
    private PersonRepJPA personRepJPA;
    @PersistenceContext
    private EntityManager entityManager;

//    Инжектировать с помощью @Autowired нельзя, так как @PersistenceContext заботится о создании уникального
//    EntityManager для каждого потока, для соблюдения потокобезопасности.

}
