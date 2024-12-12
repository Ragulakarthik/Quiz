package com.quiz.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Question {
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Long questionId; 
	private String questionText; 
	private String correctAnswer; 
	private List<String> options;
	
	public Question() {
		
	}
	public Question(Long questionId, String questionText, String correctAnswer, List<String> options) {
		this.questionId=questionId;
		this.questionText=questionText;
		this.correctAnswer=correctAnswer;
		this.options=options;
	}
}