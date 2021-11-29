package com.senla.kaluga.PersonsSales.controller;

import com.senla.kaluga.PersonsSales.service.DeleteService;
import com.senla.kaluga.PersonsSales.service.GetService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeleteController {
    DeleteService deleteService;

    void changeStatusOfAdvert (Integer advertId) {
        deleteService.changeStatusOfAdvert(advertId);
    }

    //unwanted
    void deleteMyAdvert (Integer advertId) {
        deleteService.deleteMyAdvert(advertId);
    }


}
