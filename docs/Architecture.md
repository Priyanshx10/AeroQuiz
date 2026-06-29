# AeroQuiz Architecture

## Overview

AeroQuiz follows a layered architecture to keep the application modular, maintainable, and easy to extend.

```
                +----------------------+
                |      Main.java       |
                +----------+-----------+
                           |
                           v
                +----------------------+
                |    QuizService       |
                +----------+-----------+
                           |
        +------------------+------------------+
        |                                     |
        v                                     v
+-------------------+             +----------------------+
|   QuestionBank    |             | EvaluationService    |
+-------------------+             +----------------------+
        |
        v
+----------------------------------------------+
| AerospaceQuestions                           |
| JavaQuestions                                |
| DSAQuestions                                 |
| TechnologyQuestions                          |
+----------------------------------------------+
        |
        v
+----------------------------------------------+
| Question | Quiz | Result | User              |
+----------------------------------------------+
```

---

## Components

### Main

* Application entry point
* Starts the quiz application

---

### QuizService

Responsible for:

* User interaction
* Displaying menus
* Conducting quizzes
* Validating user input
* Displaying results

---

### EvaluationService

Responsible for:

* Calculating percentage
* Assigning grades
* Determining pass/fail
* Calculating score

---

### QuestionBank

Acts as the central repository for all quizzes.

Provides access to:

* Aerospace Quiz
* Java Quiz
* DSA Quiz
* Technology Quiz

---

### Model Layer

Contains the core entities:

* Question
* Quiz
* Result
* User

These classes represent the application's data model.

---

## Design Principles

* Object-Oriented Programming (OOP)
* Single Responsibility Principle (SRP)
* Separation of Concerns
* Modular Architecture
* Reusable Components

---

## Technologies

* Java 25
* Gradle
* JUnit 5
* Git
* GitHub

---

## Future Improvements

* Timer-based quizzes
* Randomized questions
* Difficulty levels
* Database integration
* Leaderboard
* GUI using JavaFX
* REST API backend
