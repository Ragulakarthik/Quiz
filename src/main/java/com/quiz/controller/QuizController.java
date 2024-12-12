package com.quiz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.quiz.entity.Question;
import com.quiz.entity.QuizSession;
import com.quiz.service.QuizService;

@RestController
@RequestMapping("/quiz")
public class QuizController {
    @Autowired
    private QuizService quizService;

    @PostMapping("/start/{userId}")
    public QuizSession startQuiz(@PathVariable Long userId) {
        return quizService.startNewQuizSession(userId);
    }

    @GetMapping("/question")
    public Question getQuestion() {
        return quizService.getRandomQuestion();
    }

    @PostMapping("/answer/{sessionId}/{questionId}")
    public QuizSession submitAnswer(@PathVariable Long sessionId, @PathVariable Long questionId, @RequestParam String answer) {
        return quizService.submitAnswer(sessionId, questionId, answer);
    }

    @GetMapping("/results/{sessionId}")
    public QuizSession getResults(@PathVariable Long sessionId) {
        return quizService.getQuizResults(sessionId);
    }
}