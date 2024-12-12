package com.quiz.service;
import java.util.NoSuchElementException;
import java.util.Random;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.quiz.entity.Question;
import com.quiz.entity.QuizSession;
import com.quiz.repository.QuestionRepository;
import com.quiz.repository.QuizSessionRepository;

@Service
public class QuizService {
    @Autowired
    private QuestionRepository questionRepository;
    @Autowired
    private QuizSessionRepository quizSessionRepository;

    public QuizSession startNewQuizSession(Long userId) {
        QuizSession quizSession = new QuizSession();
        quizSession.setUserId(userId);
        return quizSessionRepository.save(quizSession);
    }

    public Question getRandomQuestion() {
        long count = questionRepository.count();
        int index = new Random().nextInt((int) count);
        return questionRepository.findAll().get(index);
    }

    public QuizSession submitAnswer(Long sessionId, Long questionId, String answer) {
    	QuizSession quizSession = quizSessionRepository.findById(sessionId) .orElseThrow(() -> new NoSuchElementException("Quiz session not found")); 
    	Question question = questionRepository.findById(questionId) .orElseThrow(() -> new NoSuchElementException("Question not found"));
        quizSession.setTotalQuestionsAnswered(quizSession.getTotalQuestionsAnswered() + 1);

        if (question.getCorrectAnswer().equalsIgnoreCase(answer)) {
            quizSession.setCorrectAnswers(quizSession.getCorrectAnswers() + 1);
        } else {
            quizSession.setIncorrectAnswers(quizSession.getIncorrectAnswers() + 1);
        }
        return quizSessionRepository.save(quizSession);
    }

    public QuizSession getQuizResults(Long sessionId) {
        return quizSessionRepository.findById(sessionId).orElseThrow();
    }
}