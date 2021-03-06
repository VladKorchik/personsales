package com.senla.kaluga.PersonsSales.model.seller;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
@Entity
public class Role implements GrantedAuthority {
    @Id
    private Long id;
    private String name;
    @Transient
    @ManyToMany
    private Set<Seller> Sellers;

    public Role(Long id) {
        this.id = id;
    }

    public Role(Long id, String name) {
        this.id = id;
        this.name = name;
    }

//    Имя роли должно соответствовать шаблону: «ROLE_ИМЯ»
    @Override
    public String getAuthority() {
        return getName();
    }
}