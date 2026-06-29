# AeroQuiz Design

## Design Goals

The primary goal of AeroQuiz is to provide a clean, modular, and maintainable Java CLI application while demonstrating object-oriented programming concepts.

---

## Project Layers

### Presentation Layer

Responsible for interacting with users.

Contains:

* Main.java
* QuizService.java

Responsibilities:

* Display menus
* Read user input
* Display quiz
* Display results

---

### Business Logic Layer

Contains:

EvaluationService

Responsibilities:

* Percentage calculation
* Grade calculation
* Score calculation
* Pass/Fail evaluation

---

### Data Layer

Contains:

* QuestionBank
* AerospaceQuestions
* JavaQuestions
* DSAQuestions
* TechnologyQuestions

Responsibilities:

* Store quiz data
* Provide quizzes to services

---

### Model Layer

Contains:

* Question
* Quiz
* Result
* User

These classes represent business entities.

---

## Object-Oriented Concepts Used

### Encapsulation

Private fields with getters and setters.

---

### Abstraction

Services hide implementation details from Main.

---

### Composition

Quiz contains multiple Question objects.

---

### Reusability

EvaluationService can evaluate any quiz.

QuestionBank can easily add more categories.

---

## Error Handling

Implemented validation for:

* Empty user name
* Invalid menu choice
* Invalid answers
* Invalid numeric input

---

## Testing

JUnit 5 tests cover:

* Model classes
* QuestionBank
* EvaluationService

This ensures application correctness and future maintainability.
