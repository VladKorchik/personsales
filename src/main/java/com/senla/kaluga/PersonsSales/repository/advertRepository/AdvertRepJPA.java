package com.senla.kaluga.PersonsSales.repository.advertRepository;

import com.senla.kaluga.PersonsSales.model.advert.Advert;
import com.senla.kaluga.PersonsSales.model.seller.Seller;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AdvertRepJPA extends JpaRepository<Advert, String> {

    //todo

    // если объявление неактивно, то оно не должно показываться в системе

    // Вернуть все объявления: Сначала объявления премиум-аккаунтов, потом
    // проплаченные объявления, потом обычные, потом по сортировке рейтинга пользвоателя

    List<Advert> findByIsAdvertActive();

    List<Advert> findByAuthorOrderByDate(Seller seller);

    // Вернуть одно объявление

    // изменить описание в объявлении или какие-то его другие поля

    // проплатить объявление, чтобы оно было в поиске выше обычных

    // поиск объявления по слову из названия. Вернуть можно ни одного, одно или несколько объявлений.

    // возврат объявлений по сортивроке пользователя: по цене, по дате и т.д., но перед этим они всё равно должны
    // сортироваться по рейтингу продавца

    // сделать так, чтобы пользователи, которые имели самый низкий рейтинг, их объявления были
    // в конце выдачи

    //Вернуть все объявления одного пользователя (история продаж)

}
