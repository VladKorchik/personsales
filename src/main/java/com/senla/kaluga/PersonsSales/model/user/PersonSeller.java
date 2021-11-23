package com.senla.kaluga.PersonsSales.model.user;

import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.Collection;
import java.util.Objects;
import java.util.Set;

@Getter
@Setter
@Entity
@Table ( name = "personssales.person")
public class PersonSeller implements CanBeASeller, UserDetails {
    @Id
    @Column(name = "phone_number")
    private int phoneNumber;
    @Column(name = "password")
    private String password;
    @Transient
    private String passwordConfirm;
    @Column(name = "first_name")
    @Size(min = 2, message = "Имя должно состоять минимум из вух символов.")
    private String firstName;
    @Column(name = "last_name")
    @Size(min = 2, message = "Фамилия должна состоять минимум из вух символов.")
    private String lastName;
    @Enumerated(EnumType.STRING)
    @Column(name = "user_raiting")
    private UserRating userRating;
    private String email;
    @Column(name = "registration_date")
    private String registrationDate;
    @ManyToMany(fetch = FetchType.EAGER)
    private Set<Role> roles;

    public PersonSeller() {}

    @Override
    public int hashCode() {
        return Objects.hash(phoneNumber);
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return getRoles();
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return null;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPasswordConfirm() {
        return passwordConfirm;
    }

    public void setPasswordConfirm(String passwordConfirm) {
        this.passwordConfirm = passwordConfirm;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

}
