package com.senla.kaluga.PersonsSales.controller;

import com.senla.kaluga.PersonsSales.service.PutService;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PutController {
    PutService putService;

    //Разница между PUT и POST в том, что PUT является идемпотентным, т.е. единичный и множественные вызовы
    // этого метода, с идентичным набором данных, будут иметь тот же результат выполнения (без сторонних эффектов),

    //todo

    // Обновить данные пользователя
    @PutMapping("/updatePersonData")
    void updatePersonData(@RequestBody...) {
        putService.updatePersonData();
    }

    // Обновить данные объявы
    void updateAdvertData() {
        putService.updateAdvertData();
    }



}
