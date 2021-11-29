package com.senla.kaluga.PersonsSales.repository.commentsRepository;

import com.senla.kaluga.PersonsSales.model.advert.Advert;
import com.senla.kaluga.PersonsSales.model.comment.CommentForAdvert;
import com.senla.kaluga.PersonsSales.repository.sellerRepository.SellerRepJPA;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Set;

public class CommentsRepository {
    @Autowired
    private CommentsRepJPA commentsRepJPA;
    @PersistenceContext
    private EntityManager entityManager;

    //todo
    public Set<CommentForAdvert> getComments (Advert advert) {
        return commentsRepJPA.findByAdvertOrderByDate(advert);
    }

    public void updateOrAddAnswerForComment(CommentForAdvert comment, String whatToChange, String newValue) {
        switch (whatToChange) {
            case "question":
                comment.setQuestion(newValue);
                break;
            case "answerFromSeller":
                comment.setAnswerFromSeller(newValue);
                break;
        }
        commentsRepJPA.save(comment);
    }



}
