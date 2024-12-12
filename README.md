# Quiz Application 📝

This is a Spring Boot quiz application that allows users to start a quiz session, get random multiple choice questions, submit answers, and retrieve quiz results. 
The application uses an H2 in-memory database for simplicity.

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
