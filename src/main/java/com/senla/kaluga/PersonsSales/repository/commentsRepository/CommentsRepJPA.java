package com.senla.kaluga.PersonsSales.repository.commentsRepository;

import com.senla.kaluga.PersonsSales.model.advert.Advert;
import com.senla.kaluga.PersonsSales.model.comment.CommentForAdvert;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Set;

public interface CommentsRepJPA extends JpaRepository<CommentForAdvert, String> {

    Set<CommentForAdvert> findByAdvertOrderByDate(Advert advert);

}
