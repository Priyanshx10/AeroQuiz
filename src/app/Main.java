package app;

import model.Question;
import model.Quiz;
import model.Result;
import model.User;
/**
 * AeroQuiz
 * A Java CLI Quiz Application focused on Aerospace,
 * Programming, Data Structures, and Technology.
 *
 * Author: Priyansh Yadav
 * Version: 1.0.0
 */
public class Main {

    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println("        AeroQuiz Model Test");
        System.out.println("====================================");

        // Create Question
        Question q1 = new Question(
                1,
                "Which planet is known as the Red Planet?",
                "Earth",
                "Mars",
                "Jupiter",
                "Venus",
                'B',
                "Space",
                "Easy"
        );

        // Display Question
        q1.displayQuestion();

        // Test answer checking
        System.out.println("\nTesting Answer Validation");
        System.out.println("--------------------------");
        System.out.println("Answer B: " + q1.isCorrect('B'));
        System.out.println("Answer b: " + q1.isCorrect('b'));
        System.out.println("Answer A: " + q1.isCorrect('A'));

        // Create Quiz
        Quiz quiz = new Quiz("Space Quiz");
        quiz.addQuestion(q1);

        System.out.println("\nTotal Questions: " + quiz.getTotalQuestions());

        // Create User
        User user = new User("Priyansh");
        user.setScore(1);

        System.out.println("\nUser Details");
        System.out.println(user);

        // Create Result
        Result result = new Result(1, 0, 0);

        result.calculatePercentage(1);
        result.calculateGrade();
        result.displayResult();

        System.out.println("\nAll model tests completed successfully.");
    }
}