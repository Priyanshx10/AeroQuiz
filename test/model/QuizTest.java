package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class QuizTest {

    @Test
    void testDefaultConstructor() {

        Quiz quiz = new Quiz();

        assertNotNull(quiz.getQuestions());
        assertEquals(0, quiz.getTotalQuestions());
    }

    @Test
    void testParameterizedConstructor() {

        Quiz quiz = new Quiz("Java Quiz");

        assertEquals("Java Quiz", quiz.getTitle());
        assertEquals(0, quiz.getTotalQuestions());
    }

    @Test
    void testAddQuestion() {

        Quiz quiz = new Quiz("Java");

        Question q = new Question();

        quiz.addQuestion(q);

        assertEquals(1, quiz.getTotalQuestions());
        assertTrue(quiz.getQuestions().contains(q));
    }

    @Test
    void testRemoveQuestion() {

        Quiz quiz = new Quiz("Java");

        Question q = new Question();

        quiz.addQuestion(q);
        quiz.removeQuestion(q);

        assertEquals(0, quiz.getTotalQuestions());
    }

    @Test
    void testSetTitle() {

        Quiz quiz = new Quiz();

        quiz.setTitle("DSA");

        assertEquals("DSA", quiz.getTitle());
    }
}