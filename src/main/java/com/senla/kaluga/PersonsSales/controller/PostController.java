package com.senla.kaluga.PersonsSales.controller;

import com.senla.kaluga.PersonsSales.service.PostService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostController {
    PostService postService;

    //todo

    // Создание объявления
    @PostMapping("/createAdvert")
    void createAdvert(@RequestBody String name, @RequestBody long price, @RequestBody String category,
                      @RequestBody String description ) {
        postService.createAdvert();
    }

    // Написание комента к товару
    // Тут надо разобраться, чтбоы имя комментатора подтягивалось из секурити и тоже передавалось в тело метода
    @PostMapping("/leaveComment")
    void leaveComment(@RequestBody int advertId, @RequestBody String question) {
        postService.leaveComment();
    }

    // Ответить на комент
    @PostMapping("/answerTheComment")
    void answerTheComment(@RequestBody int advertId, @RequestBody String answer){
        postService.answerTheComment();
    }

    // Отправить сообщение
    @PostMapping("/sendMessage")
    void sendMessage(@RequestBody long receiverId, @RequestBody String message ){
        postService.sendMessage();
    }

    // Проплатить объявление в топе выдачи
    @PostMapping("/raiseAdvertToTheTop")
    void raiseAdvertToTheTop(@RequestBody long advertId) {
        postService.raiseAdvertToTheTop();
    }

    //todo Надо ещё добавить функционал оценки пользователя, чтобы можно было ему оценки ставить и коменты писать

    //

    // todo Регистрация нового пользователя
    // Надо посмотреть в секурити, нужен ли для этого новый метод или можно стандартными средствами спринга

}
