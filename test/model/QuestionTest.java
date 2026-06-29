package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class QuestionTest {

    @Test
    void testDefaultConstructor() {

        Question question = new Question();

        assertNotNull(question);
    }

    @Test
    void testParameterizedConstructor() {

        Question question = new Question(
                1,
                "Java is?",
                "Language",
                "OS",
                "Browser",
                "IDE",
                'A',
                "Java",
                "Easy"
        );

        assertEquals(1, question.getId());
        assertEquals("Java is?", question.getQuestion());
        assertEquals("Language", question.getOptionA());
        assertEquals("OS", question.getOptionB());
        assertEquals("Browser", question.getOptionC());
        assertEquals("IDE", question.getOptionD());
        assertEquals('A', question.getCorrectAnswer());
        assertEquals("Java", question.getCategory());
        assertEquals("Easy", question.getDifficulty());
    }

    @Test
    void testIsCorrect() {

        Question question = new Question(
                1,
                "Test",
                "A",
                "B",
                "C",
                "D",
                'B',
                "Java",
                "Easy"
        );

        assertTrue(question.isCorrect('B'));
        assertTrue(question.isCorrect('b'));
        assertFalse(question.isCorrect('A'));
    }

    @Test
    void testSetters() {

        Question question = new Question();

        question.setId(10);
        question.setQuestion("Sample");
        question.setOptionA("A");
        question.setOptionB("B");
        question.setOptionC("C");
        question.setOptionD("D");
        question.setCorrectAnswer('D');
        question.setCategory("DSA");
        question.setDifficulty("Hard");

        assertEquals(10, question.getId());
        assertEquals("Sample", question.getQuestion());
        assertEquals("D", question.getOptionD());
        assertEquals('D', question.getCorrectAnswer());
        assertEquals("DSA", question.getCategory());
        assertEquals("Hard", question.getDifficulty());
    }

    @Test
    void testToString() {

        Question question = new Question(
                1,
                "Sample",
                "A",
                "B",
                "C",
                "D",
                'A',
                "Java",
                "Easy"
        );

        assertTrue(question.toString().contains("Question"));
        assertTrue(question.toString().contains("Java"));
    }
}