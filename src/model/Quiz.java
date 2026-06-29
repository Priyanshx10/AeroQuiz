package model;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a Quiz containing multiple questions.
 */
public class Quiz {

    private String title;
    private List<Question> questions;

    public Quiz() {
        questions = new ArrayList<>();
    }

    public Quiz(String title) {
        this.title = title;
        questions = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void addQuestion(Question question) {
        questions.add(question);
    }

    public void removeQuestion(Question question) {
        questions.remove(question);
    }

    public int getTotalQuestions() {
        return questions.size();
    }

    public void displayQuiz() {

        System.out.println("\n====================================");
        System.out.println(title);
        System.out.println("====================================");

        for (Question question : questions) {
            question.displayQuestion();
        }
    }
}