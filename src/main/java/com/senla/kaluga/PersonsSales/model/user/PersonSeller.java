package com.senla.kaluga.PersonsSales.model.user;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table ( name = "person")
@Getter
@Setter
public class PersonSeller implements CanBeASeller {
    @Id
    @OneToMany
    private int PHONENUMBER;
    private String password;
    @Enumerated(EnumType.STRING)
    private UserRole userRole;
    private String firstName;
    private String lastName;
    @Enumerated(EnumType.STRING)
    private UserRating userRating;
    private String email;
    private String registrationDate;

    public PersonSeller() {}

    @Override
    public int hashCode() {
        return Objects.hash(PHONENUMBER);
    }

}
