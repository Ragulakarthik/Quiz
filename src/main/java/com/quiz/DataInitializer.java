package com.quiz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.quiz.entity.AppUser;
import com.quiz.entity.Question;
import com.quiz.repository.QuestionRepository;
import com.quiz.repository.UserRepository;

import java.util.Arrays;

@Component
public class DataInitializer implements CommandLineRunner {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private QuestionRepository questionRepository;

    @Override
    public void run(String... args) throws Exception {
    	userRepository.save(new AppUser(null, "Karthik"));

    	questionRepository.save(new Question(null, "What is the capital of Japan?", "Tokyo", Arrays.asList("Tokyo", "Kyoto", "Osaka", "Nagoya")));
    	questionRepository.save(new Question(null, "Who wrote 'To Kill a Mockingbird'?", "Harper Lee", Arrays.asList("Harper Lee", "J.K. Rowling", "Ernest Hemingway", "Mark Twain")));
    	questionRepository.save(new Question(null, "What is the chemical symbol for water?", "H2O", Arrays.asList("H2O", "CO2", "NaCl", "O2")));
    	questionRepository.save(new Question(null, "What is the largest planet in our solar system?", "Jupiter", Arrays.asList("Jupiter", "Saturn", "Earth", "Mars")));
    	questionRepository.save(new Question(null, "In which year did the Titanic sink?", "1912", Arrays.asList("1912", "1905", "1898", "1920")));
    	questionRepository.save(new Question(null, "What is the speed of light?", "299,792 km/s", Arrays.asList("299,792 km/s", "150,000 km/s", "1,000,000 km/s", "75,000 km/s")));
    	questionRepository.save(new Question(null, "Who painted the Mona Lisa?", "Leonardo da Vinci", Arrays.asList("Leonardo da Vinci", "Vincent van Gogh", "Pablo Picasso", "Claude Monet")));
    	questionRepository.save(new Question(null, "What is the hardest natural substance on Earth?", "Diamond", Arrays.asList("Diamond", "Gold", "Iron", "Platinum")));
    	questionRepository.save(new Question(null, "Which country is known as the Land of the Rising Sun?", "Japan", Arrays.asList("Japan", "China", "South Korea", "Thailand")));
    	questionRepository.save(new Question(null, "What is the main ingredient in guacamole?", "Avocado", Arrays.asList("Avocado", "Tomato", "Onion", "Garlic")));

    }
}