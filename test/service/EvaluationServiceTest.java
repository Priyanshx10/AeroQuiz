package service;

import model.Quiz;
import model.Result;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EvaluationServiceTest {

    @Test
    void testEvaluateCalculatesPercentageAndGrade() {

        Quiz quiz = new Quiz("Java Quiz");

        // Total Questions = 10
        for (int i = 1; i <= 10; i++) {
            quiz.addQuestion(null);
        }

        Result result = new Result();
        result.setCorrectAnswers(8);
        result.setWrongAnswers(2);
        result.setSkippedQuestions(0);

        EvaluationService service = new EvaluationService();

        Result evaluated = service.evaluate(result, quiz);

        assertEquals(80.0, evaluated.getPercentage());
        assertEquals("B", evaluated.getGrade());
    }

    @Test
    void testHasPassedReturnsTrue() {

        Quiz quiz = new Quiz("Quiz");

        for (int i = 0; i < 10; i++) {
            quiz.addQuestion(null);
        }

        Result result = new Result();
        result.setCorrectAnswers(6);

        EvaluationService service = new EvaluationService();
        service.evaluate(result, quiz);

        assertTrue(service.hasPassed(result));
    }

    @Test
    void testHasPassedReturnsFalse() {

        Quiz quiz = new Quiz("Quiz");

        for (int i = 0; i < 10; i++) {
            quiz.addQuestion(null);
        }

        Result result = new Result();
        result.setCorrectAnswers(5);

        EvaluationService service = new EvaluationService();
        service.evaluate(result, quiz);

        assertFalse(service.hasPassed(result));
    }

    @Test
    void testGetScore() {

        Quiz quiz = new Quiz("Quiz");

        for (int i = 0; i < 10; i++) {
            quiz.addQuestion(null);
        }

        Result result = new Result();
        result.setCorrectAnswers(7);

        EvaluationService service = new EvaluationService();

        assertEquals("7/10", service.getScore(result, quiz));
    }

    @Test
    void testGetAccuracy() {

        Quiz quiz = new Quiz("Quiz");

        for (int i = 0; i < 10; i++) {
            quiz.addQuestion(null);
        }

        Result result = new Result();
        result.setCorrectAnswers(9);

        EvaluationService service = new EvaluationService();
        service.evaluate(result, quiz);

        assertEquals(90.0, service.getAccuracy(result));
    }

    @Test
    void testEvaluateThrowsExceptionForNullResult() {

        EvaluationService service = new EvaluationService();

        Quiz quiz = new Quiz("Quiz");

        assertThrows(
                IllegalArgumentException.class,
                () -> service.evaluate(null, quiz)
        );
    }

    @Test
    void testEvaluateThrowsExceptionForNullQuiz() {

        EvaluationService service = new EvaluationService();

        Result result = new Result();

        assertThrows(
                IllegalArgumentException.class,
                () -> service.evaluate(result, null)
        );
    }
}