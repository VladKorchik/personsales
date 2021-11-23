package com.senla.kaluga.PersonsSales.config;

import com.senla.kaluga.PersonsSales.repository.ComentsRepository;
import com.senla.kaluga.PersonsSales.repository.MessageRepository;
import com.senla.kaluga.PersonsSales.repository.PersonRepository;
import com.senla.kaluga.PersonsSales.repository.ProductRepository;
import com.senla.kaluga.PersonsSales.service.DeleteService;
import com.senla.kaluga.PersonsSales.service.GetService;
import com.senla.kaluga.PersonsSales.service.PostService;
import com.senla.kaluga.PersonsSales.service.PutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {

        //todo delete unnecessary

        //todo resolve annotaion: singleton or not

    @Autowired
    public ComentsRepository comentsRepository(){
        return new ComentsRepository();
    }
    @Autowired
    public MessageRepository messageRepository(){
        return new MessageRepository();
    }
    @Autowired
    public PersonRepository personRepository(){
        return new PersonRepository();
    }
    @Autowired
    public ProductRepository productRepository() {
        return new ProductRepository();
    }

    @Autowired
    public DeleteService deleteService (){
        return new DeleteService();
    }

    @Autowired
    public GetService getService (){
        return new GetService();
    }
//    @Bean
//    public PostService postService (ComentsRepository comentsRepository, MessageRepository messageRepository,
//                                   PersonRepository personRepository, ProductRepository productRepository){
//        return new PostService();
//    }

    @Autowired
    public PostService postService (){
        return new PostService();
    }

    @Autowired
    public PutService putService (){
        return new PutService();
    }
}
