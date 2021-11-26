package com.senla.kaluga.PersonsSales.repository.commentsRepository;

import com.senla.kaluga.PersonsSales.model.comment.CommentForAdvert;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentsRepJPA extends JpaRepository<CommentForAdvert, String> {

    //todo вернуть все комментари к определённому товару, отсортировав их до дате

}
