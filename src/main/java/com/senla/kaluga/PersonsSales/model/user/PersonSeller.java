package com.senla.kaluga.PersonsSales.model.user;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.util.Objects;

@Getter
@Setter
@Entity
@Table ( name = "personssales.person")
public class PersonSeller implements CanBeASeller {
    @Id
    @Column(name = "phone_number")
    private int phoneNumber;
    @Column(name = "password")
    private String password;
    @Enumerated(EnumType.STRING)
    @Column(name = "user_role")
    private UserRole userRole;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Enumerated(EnumType.STRING)
    @Column(name = "user_raiting")
    private UserRating userRating;
    @Column(name = "email")
    private String email;
    @Column(name = "registration_date")
    private String registrationDate;

    public PersonSeller() {}

    @Override
    public int hashCode() {
        return Objects.hash(phoneNumber);
    }

}
