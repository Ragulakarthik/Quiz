package com.quiz.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.quiz.entity.Question;

public interface QuestionRepository extends JpaRepository<Question, Long>{

}