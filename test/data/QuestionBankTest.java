package data;

import model.Quiz;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class QuestionBankTest {

    @Test
    void testGetAerospaceQuiz() {

        Quiz quiz = QuestionBank.getAerospaceQuiz();

        assertNotNull(quiz);
        assertNotNull(quiz.getTitle());
        assertFalse(quiz.getQuestions().isEmpty());
        assertEquals(10, quiz.getTotalQuestions());
    }

    @Test
    void testGetJavaQuiz() {

        Quiz quiz = QuestionBank.getJavaQuiz();

        assertNotNull(quiz);
        assertNotNull(quiz.getTitle());
        assertFalse(quiz.getQuestions().isEmpty());
        assertEquals(10, quiz.getTotalQuestions());
    }

    @Test
    void testGetDSAQuiz() {

        Quiz quiz = QuestionBank.getDSAQuiz();

        assertNotNull(quiz);
        assertNotNull(quiz.getTitle());
        assertFalse(quiz.getQuestions().isEmpty());
        assertEquals(10, quiz.getTotalQuestions());
    }

    @Test
    void testGetTechnologyQuiz() {

        Quiz quiz = QuestionBank.getTechnologyQuiz();

        assertNotNull(quiz);
        assertNotNull(quiz.getTitle());
        assertFalse(quiz.getQuestions().isEmpty());
        assertEquals(10, quiz.getTotalQuestions());
    }

    @Test
    void testEachQuizIsDifferentInstance() {

        Quiz aerospace = QuestionBank.getAerospaceQuiz();
        Quiz javaQuiz = QuestionBank.getJavaQuiz();
        Quiz dsaQuiz = QuestionBank.getDSAQuiz();
        Quiz technologyQuiz = QuestionBank.getTechnologyQuiz();

        assertNotSame(aerospace, javaQuiz);
        assertNotSame(javaQuiz, dsaQuiz);
        assertNotSame(dsaQuiz, technologyQuiz);
        assertNotSame(aerospace, technologyQuiz);
    }

    @Test
    void testQuizTitlesAreNotEmpty() {

        assertFalse(QuestionBank.getAerospaceQuiz().getTitle().isBlank());
        assertFalse(QuestionBank.getJavaQuiz().getTitle().isBlank());
        assertFalse(QuestionBank.getDSAQuiz().getTitle().isBlank());
        assertFalse(QuestionBank.getTechnologyQuiz().getTitle().isBlank());
    }
}