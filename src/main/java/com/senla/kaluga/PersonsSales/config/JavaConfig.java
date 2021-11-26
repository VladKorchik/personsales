package com.senla.kaluga.PersonsSales.config;

import com.senla.kaluga.PersonsSales.repository.commentsRepository.CommentsRepository;
import com.senla.kaluga.PersonsSales.repository.messageRepository.MessageRepository;
import com.senla.kaluga.PersonsSales.repository.sellerRepository.SellerRepository;
import com.senla.kaluga.PersonsSales.repository.advertRepository.AdvertRepository;
import com.senla.kaluga.PersonsSales.service.DeleteService;
import com.senla.kaluga.PersonsSales.service.GetService;
import com.senla.kaluga.PersonsSales.service.PostService;
import com.senla.kaluga.PersonsSales.service.PutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {

        //todo delete unnecessary

        //todo resolve annotaion: singleton or not

    @Autowired
    public CommentsRepository comentsRepository(){
        return new CommentsRepository();
    }
    @Autowired
    public MessageRepository messageRepository(){
        return new MessageRepository();
    }
    @Autowired
    public SellerRepository personRepository(){
        return new SellerRepository();
    }
    @Autowired
    public AdvertRepository productRepository() {
        return new AdvertRepository();
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
