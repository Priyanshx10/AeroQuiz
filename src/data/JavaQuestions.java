package data;

import model.Question;
import model.Quiz;

/**
 * Provides Java-related quiz questions.
 */
public class JavaQuestions {

    public static Quiz getQuiz() {

        Quiz quiz = new Quiz("☕ Java Programming Fundamentals");

        quiz.addQuestion(new Question(
                1,
                "Which keyword is used to inherit a class in Java?",
                "implements",
                "extends",
                "inherits",
                "super",
                'B',
                "Java",
                "Easy"
        ));

        quiz.addQuestion(new Question(
                2,
                "Which method is the entry point of every Java application?",
                "start()",
                "run()",
                "main()",
                "execute()",
                'C',
                "Java",
                "Easy"
        ));

        quiz.addQuestion(new Question(
                3,
                "Which of the following is NOT a primitive data type?",
                "int",
                "boolean",
                "String",
                "double",
                'C',
                "Java",
                "Easy"
        ));

        quiz.addQuestion(new Question(
                4,
                "Which OOP principle allows one class to acquire properties of another?",
                "Encapsulation",
                "Polymorphism",
                "Inheritance",
                "Abstraction",
                'C',
                "Java",
                "Medium"
        ));

        quiz.addQuestion(new Question(
                5,
                "Which collection does NOT allow duplicate elements?",
                "ArrayList",
                "LinkedList",
                "HashSet",
                "Vector",
                'C',
                "Java",
                "Medium"
        ));

        quiz.addQuestion(new Question(
                6,
                "Which keyword is used to create an object in Java?",
                "create",
                "class",
                "new",
                "object",
                'C',
                "Java",
                "Easy"
        ));

        quiz.addQuestion(new Question(
                7,
                "Which exception occurs when dividing by zero using integers?",
                "ArithmeticException",
                "IOException",
                "NullPointerException",
                "NumberFormatException",
                'A',
                "Java",
                "Medium"
        ));

        quiz.addQuestion(new Question(
                8,
                "Which access modifier makes a member accessible only within the same class?",
                "public",
                "protected",
                "private",
                "default",
                'C',
                "Java",
                "Medium"
        ));

        quiz.addQuestion(new Question(
                9,
                "Which interface is implemented by ArrayList?",
                "Set",
                "Map",
                "List",
                "Queue",
                'C',
                "Java",
                "Medium"
        ));

        quiz.addQuestion(new Question(
                10,
                "What is the size of an int in Java?",
                "16 bits",
                "32 bits",
                "64 bits",
                "Depends on the Operating System",
                'B',
                "Java",
                "Easy"
        ));

        return quiz;
    }
}