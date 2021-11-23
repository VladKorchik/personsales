package com.senla.kaluga.PersonsSales.repository;

import com.senla.kaluga.PersonsSales.model.user.PersonSeller;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepJPA extends JpaRepository<PersonSeller, String> {



}
