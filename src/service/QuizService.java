package service;

import java.util.Scanner;

import data.QuestionBank;
import model.Question;
import model.Quiz;
import model.Result;
import model.User;

/**
 * Handles the complete quiz flow and user interaction.
 */
public class QuizService {

    private final Scanner scanner;
    private Result result;

    public QuizService() {
        scanner = new Scanner(System.in);
    }

    /**
     * Starts the application.
     */
    public void start() {

        showWelcome();

        User user = createUser();

        Quiz quiz = chooseQuiz();

        if (quiz == null) {
            System.out.println("\nThank you for using AeroQuiz!");
            scanner.close();
            return;
        }

        System.out.println("\n========================================");
        System.out.println("Hello, " + user.getName() + "!");
        System.out.println("Quiz Selected : " + quiz.getTitle());
        System.out.println("Total Questions : " + quiz.getTotalQuestions());
        System.out.println("========================================");

        result = new Result();

        conductQuiz(quiz);

        displayResult(user, quiz);

        scanner.close();
    }

    /**
     * Displays welcome banner.
     */
    private void showWelcome() {

        System.out.println("==============================================");
        System.out.println("              AeroQuiz v1.0");
        System.out.println("==============================================");
        System.out.println("Aerospace • Java • DSA • Technology");
        System.out.println("==============================================");
    }

    /**
     * Creates a user.
     */
    private User createUser() {

        System.out.print("\nEnter your name: ");

        String name = scanner.nextLine().trim();

        while (name.isEmpty()) {

            System.out.print("Name cannot be empty. Enter again: ");
            name = scanner.nextLine().trim();
        }

        return new User(name);
    }

    /**
     * Shows category menu.
     */
    private void showMenu() {

        System.out.println("\nChoose Quiz Category");
        System.out.println("-------------------------------");
        System.out.println("1. Aerospace");
        System.out.println("2. Java Programming");
        System.out.println("3. Data Structures & Algorithms");
        System.out.println("4. Technology");
        System.out.println("0. Exit");
    }

    /**
     * Returns selected quiz.
     */
    private Quiz chooseQuiz() {

        while (true) {

            showMenu();

            System.out.print("\nEnter your choice: ");

            try {

                int choice = Integer.parseInt(scanner.nextLine());

                switch (choice) {

                    case 1:
                        return QuestionBank.getAerospaceQuiz();

                    case 2:
                        return QuestionBank.getJavaQuiz();

                    case 3:
                        return QuestionBank.getDSAQuiz();

                    case 4:
                        return QuestionBank.getTechnologyQuiz();

                    case 0:
                        return null;

                    default:
                        System.out.println("\nInvalid choice! Try again.");
                }

            } catch (NumberFormatException e) {

                System.out.println("\nPlease enter a valid number.");
            }
        }
    }

    /**
     * Conducts the quiz.
     */
    private void conductQuiz(Quiz quiz) {

        result.setCorrectAnswers(0);
        result.setWrongAnswers(0);
        result.setSkippedQuestions(0);

        System.out.println("\n========================================");
        System.out.println("            Quiz Started");
        System.out.println("========================================");

        int questionNumber = 1;

        for (Question question : quiz.getQuestions()) {

            System.out.println("\nQuestion " + questionNumber++);

            question.displayQuestion();

            String answer = getValidAnswer();

            if (answer.equals("S")) {

                result.setSkippedQuestions(
                        result.getSkippedQuestions() + 1);

                continue;
            }

            if (question.isCorrect(answer.charAt(0))) {

                result.setCorrectAnswers(
                        result.getCorrectAnswers() + 1);

                System.out.println("Correct!");

            } else {

                result.setWrongAnswers(
                        result.getWrongAnswers() + 1);

                System.out.println("Wrong!");
                System.out.println("Correct Answer : "
                        + question.getCorrectAnswer());
            }
        }
    }

    /**
     * Reads a valid answer.
     */
    private String getValidAnswer() {

        while (true) {

            System.out.print("\nYour Answer (A/B/C/D or S to Skip): ");

            String input = scanner.nextLine().trim().toUpperCase();

            if (isValidAnswer(input)) {
                return input;
            }

            System.out.println("Invalid input! Please try again.");
        }
    }

    /**
     * Validates answer input.
     */
    private boolean isValidAnswer(String input) {

        return input.equals("A")
                || input.equals("B")
                || input.equals("C")
                || input.equals("D")
                || input.equals("S");
    }

    /**
     * Displays final result.
     */
    private void displayResult(User user, Quiz quiz) {

        result.calculatePercentage(quiz.getTotalQuestions());
        result.calculateGrade();

        System.out.println("\n========================================");
        System.out.println("             QUIZ RESULT");
        System.out.println("========================================");

        System.out.println("Player        : " + user.getName());
        System.out.println("Quiz          : " + quiz.getTitle());

        System.out.println("----------------------------------------");

        System.out.println("Correct       : "
                + result.getCorrectAnswers());

        System.out.println("Wrong         : "
                + result.getWrongAnswers());

        System.out.println("Skipped       : "
                + result.getSkippedQuestions());

        System.out.println("----------------------------------------");

        System.out.println("Score         : "
                + result.getCorrectAnswers()
                + "/"
                + quiz.getTotalQuestions());

        System.out.printf("Percentage    : %.2f%%\n",
                result.getPercentage());

        System.out.println("Grade         : "
                + result.getGrade());

        System.out.println("========================================");

        if (result.getPercentage() >= 60) {
            System.out.println("Congratulations! You Passed!");
        } else {
            System.out.println("Keep Practicing! You'll Do Better!");
        }

        System.out.println("========================================");
    }
}