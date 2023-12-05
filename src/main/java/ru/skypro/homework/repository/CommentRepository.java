package ru.skypro.homework.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.skypro.homework.model.Comment;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
    Comment findByPk(Integer pk);
    void deleteByAdPkAndPk(Integer adId, Integer commentId);
    void deleteAllByAdPk(Integer adId);
}
