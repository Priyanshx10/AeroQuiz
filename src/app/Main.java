package app;

import data.QuestionBank;
import model.Quiz;
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

        Quiz[] quizzes = {
                QuestionBank.getAerospaceQuiz(),
                QuestionBank.getJavaQuiz(),
                QuestionBank.getDSAQuiz(),
                QuestionBank.getTechnologyQuiz()
        };

        System.out.println("========== AeroQuiz ==========\n");

        for (Quiz quiz : quizzes) {
            System.out.println(quiz.getTitle());
            System.out.println("Questions: " + quiz.getTotalQuestions());
            System.out.println("------------------------------");
        }

        System.out.println("\nQuestion Bank Loaded Successfully!");
    }
}