package com.senla.kaluga.PersonsSales.repository.personRepository;

import com.senla.kaluga.PersonsSales.model.user.PersonSeller;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PersonRepJPA extends JpaRepository<PersonSeller, String> {

    Optional<PersonSeller> findByPhoneNumber(int phoneNumber);
    Optional<PersonSeller> findByEmail (String email);

    //todo изменить данные аккаунта

}
