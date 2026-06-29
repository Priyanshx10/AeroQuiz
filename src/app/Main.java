package app;

import service.QuizService;

public class Main {

    public static void main(String[] args) {

        QuizService quizService = new QuizService();
        quizService.start();

    }
}