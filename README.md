# Quiz Application 📝

This is a Spring Boot quiz application that allows users to start a quiz session, get random multiple choice questions, submit answers, and retrieve quiz results. 
The application uses an H2 in-memory database for simplicity.
![image](https://github.com/user-attachments/assets/297bcafc-7275-41d3-92a9-5b4926f0fa68)
![image](https://github.com/user-attachments/assets/bd018569-3cd5-4a25-a84d-4d0938c55a52)
![image](https://github.com/user-attachments/assets/b108c607-ce95-4923-bb34-e007886a9bf3)
![image](https://github.com/user-attachments/assets/71214eae-bdd7-4868-af8a-5f4e6bf30e11)
![image](https://github.com/user-attachments/assets/05e925d4-36dc-4d12-9d43-c3b1caa4d889)
![image](https://github.com/user-attachments/assets/5e4fd414-b349-4a18-a66b-4f8e4cef491a)

## Technologies Used 💡

- **Spring Boot**: For building the RESTful web service.
- **Spring Data JPA**: For database interaction.
- **H2 Database**: As an in-memory database for storing quiz data.
- **Maven**: For project management and build automation.

## Features 🌟

- Start a new quiz session
- Get a random multiple choice question from a set of questions in the database
- Submit an answer
- Get the total questions answered by the user with details on correct and incorrect submissions

## Prerequisites ✅

- Java 17 or later
- Maven 3.6 or later
- Git

## Getting Started

### Clone the Repository 📦

To clone the repository, use the following command:

git clone https://github.com/Ragulakarthik/Quiz.git

cd Quiz

## Run the Application 🏃‍♂️

After cloning open the project, open the project in any IDE like Spring Tool Suite (STS), Itellij or Ecilpse and Run As Spring Boot App.

After that open PostMan and give these end points that are mentioned below.

## API Endpoints 🌐
## Start a New Quiz Session
URL: /api/quiz/start/{userId}

Method: POST

Description: Start a new quiz session for the specified user.

http://localhost:8080/api/quiz/start/1


## Get a Random Question
URL: /api/quiz/question

Method: GET

Description: Retrieve a random question from the database.

http://localhost:8080/api/quiz/question


## Submit an Answer
URL: /api/quiz/answer/{sessionId}/{questionId}

Method: POST

Description: Submit an answer for the specified quiz session and question.

Parameters: answer (Query parameter)

http://localhost:8080/api/quiz/answer/1/1?answer=Paris


## Get Quiz Results
URL: /api/quiz/results/{sessionId}

Method: GET

Description: Retrieve the quiz results for the specified quiz session.

http://localhost:8080/api/quiz/results/1

## Contact
feel free to contact me using email Id : ragulakarthik04@gmail.com
