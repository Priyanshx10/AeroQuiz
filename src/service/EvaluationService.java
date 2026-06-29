package service;

import model.Quiz;
import model.Result;

/**
 * Handles evaluation logic for a completed quiz.
 * This class is responsible for calculating
 * percentage and grade based on the quiz result.
 */
public class EvaluationService {

    /**
     * Evaluates the quiz result.
     *
     * @param result The result object containing correct,
     *               wrong and skipped answers.
     * @param quiz   The completed quiz.
     * @return Updated Result object.
     */
    public Result evaluate(Result result, Quiz quiz) {

        if (result == null) {
            throw new IllegalArgumentException("Result cannot be null.");
        }

        if (quiz == null) {
            throw new IllegalArgumentException("Quiz cannot be null.");
        }

        result.calculatePercentage(quiz.getTotalQuestions());
        result.calculateGrade();

        return result;
    }

    /**
     * Returns true if the user passed the quiz.
     */
    public boolean hasPassed(Result result) {

        return result.getPercentage() >= 60;
    }

    /**
     * Returns the score in a readable format.
     *
     * Example:
     * 8/10
     */
    public String getScore(Result result, Quiz quiz) {

        return result.getCorrectAnswers() + "/" + quiz.getTotalQuestions();
    }

    /**
     * Returns the user's accuracy.
     *
     * Example:
     * 80.00
     */
    public double getAccuracy(Result result) {

        return result.getPercentage();
    }
}