package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ResultTest {

    @Test
    void testDefaultConstructor() {

        Result result = new Result();

        assertNotNull(result);
    }

    @Test
    void testParameterizedConstructor() {

        Result result = new Result(8,2,0);

        assertEquals(8,result.getCorrectAnswers());
        assertEquals(2,result.getWrongAnswers());
        assertEquals(0,result.getSkippedQuestions());
    }

    @Test
    void testCalculatePercentage() {

        Result result = new Result(8,2,0);

        result.calculatePercentage(10);

        assertEquals(80.0,result.getPercentage());
    }

    @Test
    void testCalculatePercentageZeroQuestions() {

        Result result = new Result();

        result.calculatePercentage(0);

        assertEquals(0,result.getPercentage());
    }

    @Test
    void testGradeA() {

        Result result = new Result(10,0,0);

        result.calculatePercentage(10);
        result.calculateGrade();

        assertEquals("A",result.getGrade());
    }

    @Test
    void testGradeB() {

        Result result = new Result(8,2,0);

        result.calculatePercentage(10);
        result.calculateGrade();

        assertEquals("B",result.getGrade());
    }

    @Test
    void testGradeF() {

        Result result = new Result(2,8,0);

        result.calculatePercentage(10);
        result.calculateGrade();

        assertEquals("F",result.getGrade());
    }
}