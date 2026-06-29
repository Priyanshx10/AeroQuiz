# 🚀 AeroQuiz

AeroQuiz is a **Java-based Command Line Quiz Application** built using **Object-Oriented Programming (OOP)** principles. It provides an interactive quiz experience across multiple technical domains, including Aerospace, Java Programming, Data Structures & Algorithms, and Technology.

The project demonstrates clean architecture, modular design, Gradle build automation, JUnit 5 testing, and Git-based development workflows.

---

## 📌 Features

* ✅ Interactive Command Line Interface (CLI)
* ✅ Four Quiz Categories
* ✅ 40 Multiple Choice Questions
* ✅ Automatic Score Evaluation
* ✅ Percentage Calculation
* ✅ Grade Calculation
* ✅ Pass / Fail Evaluation
* ✅ Question Skip Option
* ✅ Input Validation
* ✅ Clean Object-Oriented Design
* ✅ Gradle Build System
* ✅ JUnit 5 Unit Tests

---

## 📚 Quiz Categories

| Category                        | Questions |
| ------------------------------- | --------: |
| 🚀 Aerospace Fundamentals       |        10 |
| ☕ Java Programming              |        10 |
| 💻 Data Structures & Algorithms |        10 |
| 🌐 Technology Fundamentals      |        10 |

---

# 🏗️ Project Architecture

The project follows a layered architecture to separate responsibilities.

```text
            +----------------------+
            |      Main.java       |
            +----------+-----------+
                       |
                       v
            +----------------------+
            |    QuizService       |
            +----------+-----------+
                       |
        +--------------+----------------+
        |                               |
        v                               v
+------------------+          +----------------------+
|  QuestionBank    |          | EvaluationService    |
+------------------+          +----------------------+
        |                               |
        v                               v
+------------------+          +----------------------+
| Question Objects |          | Result Evaluation    |
+------------------+          +----------------------+
```

---

# 📂 Project Structure

```text
AeroQuiz/
│
├── src/
│   ├── app/
│   │   └── Main.java
│   │
│   ├── model/
│   │   ├── Question.java
│   │   ├── Quiz.java
│   │   ├── Result.java
│   │   └── User.java
│   │
│   ├── data/
│   │   ├── AerospaceQuestions.java
│   │   ├── JavaQuestions.java
│   │   ├── DSAQuestions.java
│   │   ├── TechnologyQuestions.java
│   │   └── QuestionBank.java
│   │
│   └── service/
│       ├── QuizService.java
│       └── EvaluationService.java
│
├── test/
│   ├── model/
│   ├── data/
│   └── service/
│
├── docs/
│
├── gradle/
│
├── build.gradle
├── settings.gradle
├── gradlew
├── gradlew.bat
├── README.md
└── LICENSE
```

---

# 🛠️ Technologies Used

* Java 25
* Gradle 9
* JUnit 5
* Git
* GitHub
* Object-Oriented Programming

---

# ⚙️ Requirements

* Java 25 or later
* Gradle 9.x

---

# 📥 Installation

Clone the repository:

```bash
git clone https://github.com/Priyanshx10/AeroQuiz.git

cd AeroQuiz
```

---

# ▶️ Build the Project

```bash
./gradlew clean build
```

---

# ▶️ Run the Application

```bash
./gradlew run
```

---

# 🧪 Run Unit Tests

```bash
./gradlew test
```

---

# 📊 Sample Output

```text
==============================================
              AeroQuiz v1.0
==============================================
Aerospace • Java • DSA • Technology
==============================================

Enter your name: Priyansh

Choose Quiz Category

1. Aerospace
2. Java Programming
3. Data Structures & Algorithms
4. Technology

Question 1
Which keyword is used to inherit a class in Java?

A. implements
B. extends
C. inherits
D. super

Your Answer : B

Correct!

========================================
             QUIZ RESULT
========================================

Score       : 8/10
Percentage  : 80.00%
Grade       : B

Congratulations! You Passed!
```

---

# 🧪 Unit Testing

The project includes unit tests for:

* Question
* Quiz
* Result
* User
* EvaluationService
* QuestionBank

Execute all tests:

```bash
./gradlew test
```

---

# 📈 Future Enhancements

* Randomized Questions
* Difficulty Selection
* Timer Based Quiz
* High Score System
* Leaderboard
* JSON Question Bank
* Database Integration
* Multiplayer Quiz
* GUI Version using JavaFX
* Spring Boot REST API Version

---

# 🎯 Learning Objectives

This project demonstrates:

* Object-Oriented Programming
* Encapsulation
* Constructors
* Collections
* Service Layer Design
* Modular Architecture
* Clean Code Practices
* Gradle Build Automation
* Unit Testing with JUnit 5
* Git & GitHub Workflow

---

# 👨‍💻 Author

**Priyansh Yadav**

GitHub: https://github.com/Priyanshx10

LinkedIn: https://www.linkedin.com/in/priyansh10/

---

# 📄 License

This project is licensed under the MIT License.

See the **LICENSE** file for details.

---

# ⭐ Support

If you found this project useful:

* ⭐ Star this repository
* 🍴 Fork the project
* 🛠️ Contribute improvements
* 📝 Share feedback

---

## 🎉 AeroQuiz v1.0.0

A complete Java CLI Quiz Application built as a portfolio project demonstrating Object-Oriented Programming, Gradle, JUnit 5, and professional software development practices.
