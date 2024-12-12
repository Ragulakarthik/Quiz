package com.quiz.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.quiz.entity.QuizSession;

public interface QuizSessionRepository extends JpaRepository<QuizSession, Long>{

}