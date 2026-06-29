package data;

import model.Quiz;

/**
 * Central repository for all available quizzes.
 */
public class QuestionBank {

    private QuestionBank() {
        // Prevent instantiation
    }

    public static Quiz getAerospaceQuiz() {
        return AerospaceQuestions.getQuiz();
    }

    public static Quiz getJavaQuiz() {
        return JavaQuestions.getQuiz();
    }

    public static Quiz getDSAQuiz() {
        return DSAQuestions.getQuiz();
    }

    public static Quiz getTechnologyQuiz() {
        return TechnologyQuestions.getQuiz();
    }
}