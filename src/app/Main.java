package app;

import service.QuizService;

/**
 * AeroQuiz
 *
 * Interactive Command Line Quiz Application
 *
 * Author : Priyansh Yadav
 * Version: 1.0.0
 */
public class Main {

    public static void main(String[] args) {

        QuizService quizService = new QuizService();

        quizService.start();
    }
}