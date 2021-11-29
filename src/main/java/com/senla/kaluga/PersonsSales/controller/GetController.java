package com.senla.kaluga.PersonsSales.controller;

import com.senla.kaluga.PersonsSales.model.advert.Advert;
import com.senla.kaluga.PersonsSales.model.chat.Chat;
import com.senla.kaluga.PersonsSales.model.comment.CommentForAdvert;
import com.senla.kaluga.PersonsSales.model.message.Message;
import com.senla.kaluga.PersonsSales.model.seller.Seller;
import com.senla.kaluga.PersonsSales.model.sellerrating.SellerRating;
import com.senla.kaluga.PersonsSales.service.GetService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
public class GetController {
    GetService getService;
    //todo

    //все объявы
    @GetMapping("/getall")
    Set<Advert> getAllActiveAdvertLikeABuyer() {
        return getService.getAllActiveAdvertLikeABuyer();
    }


    // Получить объявления с фильтрацией по дате, категории и т.д.
    @GetMapping("/filterby")
    Set<Advert> getActiveAdvertsWithSort(@RequestParam ("filterby") String parameterForFilter) {
        return getService.getActiveAdvertsWithSort(parameterForFilter);
    }

    // получить все объявы одного пользователя
    @GetMapping("/seealladvertfromone")
    Set<Advert> seeAllAdvertFromOne(@RequestParam ("userid") Integer userId ) {
        return getService.seeAllAdvertFromOne();
    }

    // Получить все коменты к объяве
    @GetMapping("/getcomments")
    Set<CommentForAdvert> getCommentsForAdvert (@RequestParam ("advertid") int advertid) {
        return getService.getCommentsForAdvert(advertid);
    }

    // Получить мои переписки
    // Тут надо попробовать сделать через роль, учетку и как-то там, т.е. через секурити
    @GetMapping("/mychats")
    Set<Chat> getMyChats() {
        return getService.getMyChats();
    }

    //todo добавить метод получения рейтинга продавца и коментов о нём
    @GetMapping("/getreview/{userId}")
    Set<SellerRating> getReview (@RequestParam ("userId") long userId) {
        return getService.getReview(userId);
    }


    //todo
    //показать конкретную переписку с пользователем
    //тут надо из секурности выдернуть телефон пользователя или типа того и передать его в метод
    //плюс адрес мапинга должен как-то меняться, в зависимости от запроса
    // todo Надо подумать, где и как взять этот айдишник, а то пока что херня
    @GetMapping("/chat/{userId}")
    Set<Message> getChatWith(Long sellerId) {
        getService.getChatWith(sellerId);
    }

}
