package com.quiz.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class QuizSession {
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Long sessionId; 
	private Long userId; 
	private Integer totalQuestionsAnswered = 0; 
	private Integer correctAnswers = 0; 
	private Integer incorrectAnswers = 0;
}