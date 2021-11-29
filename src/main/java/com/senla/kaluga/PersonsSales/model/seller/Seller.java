package com.senla.kaluga.PersonsSales.model.seller;

import com.senla.kaluga.PersonsSales.model.chat.Chat;
import com.senla.kaluga.PersonsSales.model.sellerrating.SellerRating;
import com.senla.kaluga.PersonsSales.model.advert.Advert;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.Objects;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
@Entity
public class Seller implements UserDetails {

    @Id
    @Column(unique = true)
    private Long phoneNumber;
    private String password;
    @Transient
    private String passwordConfirm;
    @Size(min = 2, max = 100, message = "Имя должно состоять минимум из двух символов.")
    private String firstName;
    @Size(min = 2, max = 100, message = "Фамилия должна состоять минимум из двух символов.")
    private String lastName;
    @OneToMany
    private Set<SellerRating> commentsAndRating;
    private String email;
    @CreationTimestamp
    private Timestamp registrationDate;
    @ManyToMany(fetch = FetchType.EAGER)
    private Set<Role> roles;
    @ManyToMany
    private Set<Chat> chatSet;
    @OneToMany
    private Set<Advert> personsAdverts;


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

    public String getPasswordConfirm() {
        return passwordConfirm;
    }

    public void setPasswordConfirm(String passwordConfirm) {
        this.passwordConfirm = passwordConfirm;
    }

}